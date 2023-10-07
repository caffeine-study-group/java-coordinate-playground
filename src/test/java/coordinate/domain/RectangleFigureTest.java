package coordinate.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleFigureTest {

    @Test
    void 면적을_계산한다() {
        Points points = new Points(Arrays.asList(
                new Point(10, 10),
                new Point(22, 10),
                new Point(22, 18),
                new Point(10, 18)
        ));
        RectangleFigure rectangle = (RectangleFigure)FigureFactory.generate(points);

        assertEquals(96, rectangle.area());
    }
}
