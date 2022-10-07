public class Car {

    public static final int NAME_MAX_LENGTH = 5;
    private final String name;

    public Car(String name) {
        if (isNameMaxLength(name)) {
            throw new IllegalArgumentException("이름의 최대 길이수를 초과하였습니다.");
        }
        this.name = name;
    }

    private boolean isNameMaxLength(String name) {
        return name.length() > NAME_MAX_LENGTH;
    }

    public String getName() {
        return name;
    }
}
