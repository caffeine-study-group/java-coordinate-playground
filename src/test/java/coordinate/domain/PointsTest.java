package coordinate.domain;

import com.sun.tools.javac.util.List;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointsTest {
    private Points points;

    @BeforeEach
    void setUp() {
        this.points = new Points(List.of(new Point(1, 2), new Point(3, 4)));
    }

    @Test
    void 포인트_일급콜렉션_생성_테스트() {
        Points points = new Points(List.of(new Point(10, 10), new Point(20, 20)));
        assertFalse(points.getList().size() != 2);
        assertFalse(points.getList().isEmpty());
        assertNotNull(points.getList());
    }

    @Test
    void 가장_작은_X_가져오기_테스트() {
        assertEquals(1, points.getMinX());
    }

    @Test
    void 가장_작은_Y_가져오기_테스트() {
        assertEquals(2, points.getMinY());
    }

    @Test
    void 가장_큰_X_가져오기_테스트() {
        assertEquals(3, points.getMaxX());
    }

    @Test
    void 가장_큰_Y_가져오기_테스트() {
        assertEquals(4, points.getMaxY());
    }
}
