import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    //각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
    @Test
    void 차_생성() {
        assertThat(new Car("이름이지롱")).isInstanceOf(Car.class);
        assertThatThrownBy(() -> new Car("긴이름이지롱")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 차_여러대_생성() {
        Cars cars = new Cars("이름이지롱,이름이지지,이름이다,이름,아하");
        assertThat(cars).isInstanceOf(Cars.class);
        assertThatThrownBy(() -> new Cars("이름인데길어")).isInstanceOf(IllegalArgumentException.class);
    }
}
