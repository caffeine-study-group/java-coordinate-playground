package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PointTest {

    @Test
    void 포인트_생성() {
        int x = 10;
        int y = 10;
        Point point = new Point(x, y);
    }

    @Test
    void 포인트_생성_X_실패() {
        int x = 25;
        int y = 24;

        assertThatThrownBy(() -> {
            Point point2 = new Point(x, y);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 포인트_생성_Y_실패() {
        int x = 24;
        int y = 25;

        assertThatThrownBy(() -> {
            Point point2 = new Point(x, y);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
