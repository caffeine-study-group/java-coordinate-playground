package coordinate.domain;

import com.sun.tools.javac.util.List;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointsTest {

    @Test
    void 포인트_일급콜렉션_생성_테스트() {
        Points points = new Points(List.of(new Point(10, 10), new Point(20, 20)));
        assertFalse(points.getList().size() != 2);
        assertFalse(points.getList().isEmpty());
        assertNotNull(points.getList());
    }


    @Test
    void test() {
        new LineFigure(new Points(Lists.emptyList()));
    }
}
