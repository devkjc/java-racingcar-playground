import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> carList = new ArrayList<>();

    public Cars(String names) {

        String[] split = names.split(",");

        for (String name : split) {
            carList.add(new Car(name));
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}
