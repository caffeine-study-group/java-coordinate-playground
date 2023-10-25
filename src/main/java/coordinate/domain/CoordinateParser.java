package coordinate.domain;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CoordinateParser {
    final static private String SPLITTER_DASH = "-";
    final static private String REPLACE_REGEX = "[()]";
    final static private String EMPTY = "";

    public static Points parse(String input) {
        return new Points(Arrays.stream(input.split(CoordinateParser.SPLITTER_DASH))
                .map(p -> p.replaceAll(REPLACE_REGEX, CoordinateParser.EMPTY))
                .map(Point::new)
                .collect(Collectors.toList()));
    }
}
