import java.util.Random;

public class Car {

    public static final int NAME_MAX_LENGTH = 5;
    public static final int GO_LIMIT = 4;
    public static final int MAX_BOUND = 9;
    private final String name;
    private int point = 0;

    public Car(String name) {
        if (isNameMaxLength(name)) {
            throw new IllegalArgumentException("이름의 최대 길이수를 초과하였습니다.");
        }
        this.name = name;
    }

    private boolean isNameMaxLength(String name) {
        return name.length() > NAME_MAX_LENGTH;
    }

    public void go() {
        go(randomInt());
    }

    int randomInt() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }

    void go(int randomInt) {
        if (isGo(randomInt)) {
            point++;
        }
    }

    @Override
    public String toString() {
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < point; i++) {
            bar.append("-");
        }
        return name + " : " + bar;
    }

    private boolean isGo(int randomInt) {
        return randomInt >= GO_LIMIT;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}
