package coordinate.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoordinateParser {
    final static private String SPLITTER_DASH = "-";
    final static private String LEFT_BRACE = "(";
    final static private String RIGHT_BRACE = ")";
    final static private String EMPTY = "";

    public static Points parse(String input) {
        String[] pointArr =  null;
        // 1. - 로 나눈다.
        pointArr = input.split(CoordinateParser.SPLITTER_DASH);
        // 2. 소괄호 없앤다.
        for (int i = 0; i < pointArr.length; i++) {
            pointArr[i] = pointArr[i].replace(CoordinateParser.LEFT_BRACE, CoordinateParser.EMPTY);
            pointArr[i] = pointArr[i].replace(CoordinateParser.RIGHT_BRACE, CoordinateParser.EMPTY);
        }
        // 3. , 로 나눈다. Point를 만든다.
        return new Points(Arrays.stream(pointArr).map(Point::new).collect(Collectors.toList()));
    }
}
