package coordinate.domain;

import coordinate.ui.OutputUI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class CoordinateOutputTest {

    @Test
    void coordinate_output_ui_line_test() {

        String pipeLine =  "|";
        String bottomBar = "  +-----------------------------------------------------------------------\n 0";
        String point = ".";

        int limit = 24;

        int x1 = 10;
        int y1 = 14;

        int x2 = 10;
        int y2 = 19;

        for (int i = limit; i > 0; i--) {

            if (i % 2 == 0) {
                System.out.printf("%2d%s", i, pipeLine);
            } else {
                System.out.print("  " + pipeLine);
            }

             for (int j = 0; j < limit; j++) {
                 if (x1 == j && y1 == i) {
                     System.out.printf("%"+j*3+"s", point);
                 }
             }

             System.out.println();
        }

        System.out.printf("%s", bottomBar);

        for (int i = 2; i <= limit; i += 2) {
           System.out.printf("%6d", i);
        }

        System.out.println();
    }

    @Test
    public void output_ui_graph_test() {
        List<Point> pointList = Arrays.asList(new Point(10, 10), new Point(14, 15));
        Points points = new Points(pointList);
        OutputUI outputUI = new OutputUI(FigureFactory.generate(points));
        outputUI.drawGraph();
    }
}
