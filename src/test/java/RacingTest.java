import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingTest {

    @Test
    void 차_여러대_생성() {
        Racing racing = new Racing("이름이지롱,이름이지지,이름이다,이름,아하");
        assertThat(racing).isInstanceOf(Racing.class);
        assertThatThrownBy(() -> new Racing("이름인데길어")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 우승자() {

        Car car1 = new Car("1");
        car1.go(4);
        car1.go(4);
        Car car2 = new Car("2");
        car2.go(4);
        car2.go(4);
        Car car3 = new Car("3");

        Racing racing = new Racing(Arrays.asList(car1,car2,car3));

        assertThat(racing.getWinner(racing.getWinnerPoint())).contains(car1, car2);
    }
}
