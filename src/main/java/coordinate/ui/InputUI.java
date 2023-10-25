package coordinate.ui;

import coordinate.domain.CoordinateParser;
import coordinate.domain.Points;

import java.util.Scanner;

public class InputUI {
    static final String COORDINATE_INPUT_MESSAGE = "좌표를 입력하세요.";
    final Scanner scanner = new Scanner(System.in);

    public InputUI() {
    }

    public Points outputAndInputPoints() {
        System.out.println(COORDINATE_INPUT_MESSAGE);
        return CoordinateParser.parse(scanner.nextLine());
    }
}
