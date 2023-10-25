package coordinate.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinateParserTest {

    @Test
    public void 선_좌표_입력_Parse() {
        String input = "(10,10)-(14,15)";
        List<Point> point = Arrays.asList(new Point(10, 10), new Point(14, 15));
        Points points = CoordinateParser.parse(input);
        for (int i = 0; i < point.size(); i++) {
            assertEquals(points.getList().get(i), point.get(i));
        }
    }


}
