package coordinate.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineFigureTest {

    @Test
    void 길이를_계산한다() {
        Points points = new Points(Arrays.asList(new Point(10, 10), new Point(14, 15)));
        LineFigure line = (LineFigure) FigureFactory.generate(points);

        Double result = Math.sqrt(Math.pow(14.0 - 10.0, 2) + Math.pow(15.0 - 10.0, 2));
        System.out.println(result);
        assertEquals(result, line.distance(), 0.001);
    }
}
