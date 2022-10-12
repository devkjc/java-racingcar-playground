import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {

    private final List<Car> carList;

    public Racing(String names) {

        carList = new ArrayList<>();

        String[] split = names.split(",");
        for (String name : split) {
            carList.add(new Car(name));
        }
    }

    public Racing(List<Car> carList) {
        this.carList = carList;
    }

    public void goCars(int repeat) throws InterruptedException {
        System.out.println("실행결과");
        System.out.println("========================================= :: ");
        for (int i = 1; i <= repeat; i++) {
            System.out.println(i + " 라운드");
            roundStart();
        }
        winnerPrint();
        System.out.println("========================================= :: ");
    }

    private void winnerPrint() {
        String winner = getWinner(getWinnerPoint()).stream().map(Car::getName).collect(Collectors.joining(","));
        System.out.println("우승자는 :: " + winner);
    }

    public List<Car> getWinner(int winnerPoint) {
        return carList.stream().filter(car -> car.getPoint() == winnerPoint).collect(Collectors.toList());
    }

    public int getWinnerPoint() {
        return carList.stream().mapToInt(Car::getPoint).max().orElse(0);
    }

    private void roundStart() throws InterruptedException {
        Thread.sleep(1000);
        for (Car car : carList) {
            car.go();
            System.out.println(car);
        }
        System.out.println("========================================= :: ");
    }
}
