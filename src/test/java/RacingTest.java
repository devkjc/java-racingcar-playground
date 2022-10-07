import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingTest {

    Racing racing;

    @BeforeEach
    void setUp() {
        racing = new Racing("이름이지롱,이름이지지,이름이다,이름,아하");
    }

    @Test
    void 차_여러대_생성() {
        assertThat(racing).isInstanceOf(Racing.class);
        assertThatThrownBy(() -> new Racing("이름인데길어")).isInstanceOf(IllegalArgumentException.class);
    }
}
