import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {

    private final List<Car> carList = new ArrayList<>();

    public Racing(String names) {
        String[] split = names.split(",");
        for (String name : split) {
            carList.add(new Car(name));
        }
    }

    public void goCars(int repeat) throws InterruptedException {
        System.out.println("실행결과");
        System.out.println("========================================= :: ");
        for (int i = 1; i <= repeat; i++) {
            roundStart(i);
        }
        winner();
        System.out.println("========================================= :: ");
    }

    private void winner() {
        int winnerPoint = carList.stream().mapToInt(Car::getPoint).max().orElse(0);
        String winnerName = carList.stream().filter(car -> car.getPoint() == winnerPoint).map(Car::getName).collect(Collectors.joining(","));
        System.out.println("우승자는 :: " + winnerName);
    }

    private void roundStart(int i) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(i + " 라운드");
        for (Car car : carList) {
            car.go();
            System.out.println(car);
        }
        System.out.println("========================================= :: ");
    }
}
