package coordinate.domain;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureFactoryTest {
    @Test
    void 라인_생성_테스트() {
        Points points = new Points(List.of(new Point(10, 10), new Point(20, 20)));
        Figure lineFigure = FigureFactory.generate(points);
        assertTrue(lineFigure instanceof LineFigure);
    }
}