import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("짜잔");
    }

    @Test
    void 전진_테스트() {
        car.go(4);
        assertThat(car.getPoint()).isEqualTo(1);
    }

    @Test
    void 전진_실패_테스트() {
        car.go(3);
        assertThat(car.getPoint()).isEqualTo(0);
    }

    @RepeatedTest(30)
    void 랜덤_숫자_0_9() {
        assertThat(car.randomInt()).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(9);
    }
}
