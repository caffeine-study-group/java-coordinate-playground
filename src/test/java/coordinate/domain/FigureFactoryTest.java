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

    @Test
    void 사각형_생성_테스트() {
        Points points = new Points(List.of(new Point(10, 10), new Point(22, 10), new Point(22, 18), new Point(10, 18)));
        Figure rectangleFigure = FigureFactory.generate(points);
        assertTrue(rectangleFigure instanceof RectangleFigure);
    }

    @Test
    void 삼각향_생성_테스트() {
        Points points = new Points(List.of(new Point(10, 10), new Point(14, 15), new Point(20, 8)));
        Figure triangleFigure = FigureFactory.generate(points);
        assertTrue(triangleFigure instanceof TriangleFigure);
    }
}