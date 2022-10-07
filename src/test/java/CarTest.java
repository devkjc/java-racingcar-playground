import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 차_생성() {
        assertThat(new Car("이름이지롱")).isInstanceOf(Car.class);
        assertThatThrownBy(() -> new Car("긴이름이지롱")).isInstanceOf(IllegalArgumentException.class);
    }
}
