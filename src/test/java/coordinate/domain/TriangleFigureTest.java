package coordinate.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TriangleFigureTest {

    @Test
    void 삼각형_넓이_계산() {
        Points points = new Points(Arrays.asList(
                new Point(10, 10),
                new Point(14, 15),
                new Point(20, 8)
        ));
        TriangleFigure triangle = (TriangleFigure)FigureFactory.generate(points);

        assertEquals(29, triangle.area(), 0.001);
    }
}
