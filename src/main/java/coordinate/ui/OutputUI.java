package coordinate.ui;

import coordinate.domain.Figure;
import coordinate.domain.Point;
import coordinate.domain.Points;

public class OutputUI {

    private static final String PIPE_LINE = "|";
    private static final String BOTTOM_LINE = "  +-----------------------------------------------------------------------\n 0";
    private static final String POINT = ".";
    private static final int GRAPH_SIZE = 24;

    private static final Point[][] GRAPH = new Point[25][25];

    private final Figure figure;

    public OutputUI(Figure figure) {
        this.figure = figure;
    }

    public void drawGraph() {

        for (int i = GRAPH_SIZE; i > 0; i--) {

            printLeftLine(i);

            for (int j = 0; j < GRAPH_SIZE; j++) {
                this.printDot(i, j);
            }

            System.out.println();
        }

        System.out.printf("%s", BOTTOM_LINE);

        for (int i = 2; i <= GRAPH_SIZE; i += 2) {
            System.out.printf("%6d", i);
        }

        System.out.println();
    }

    private static void printLeftLine(int yIndex) {
        if (yIndex % 2 == 0) {
            System.out.printf("%2d%s", yIndex, PIPE_LINE);
            return;
        }

        System.out.print("  " + PIPE_LINE);
    }

    private void printDot(int yIndex, int xIndex) {

        if (figure.contains(getOrDefaultGraph(xIndex, yIndex))) {
            System.out.printf("%3s", POINT);
        } else {
            System.out.printf("%3s", " ");
        }
    }

    private Point getOrDefaultGraph(int xIndex, int yIndex) {
        if (GRAPH[xIndex][yIndex] == null) {
            GRAPH[xIndex][yIndex] = new Point(xIndex, yIndex);
        }

        return GRAPH[xIndex][yIndex];
    }

    public void printSize() {
        System.out.println(figure.returnSizeMessage());
    }
}
