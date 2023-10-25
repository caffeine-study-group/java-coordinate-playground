package coordinate.ui;

import coordinate.domain.Figure;
import coordinate.domain.Point;

public class OutputUI {

    private static final String PIPE_LINE = "|";
    private static final String BOTTOM_LINE = "  +-----------------------------------------------------------------------\n 0";
    private static final String POINT = ".";
    private static final String WHITE_SPACE = " ";
    private static final int GRAPH_SIZE = 24;

    private static final Point[][] GRAPH = new Point[25][25];

    private final Figure figure;

    public OutputUI(Figure figure) {
        this.figure = figure;
    }

    public void drawGraph() {
        // 그래프 상단 Y축 라벨, 점 그리기
        for (int i = GRAPH_SIZE; i > 0; i--) {
            printLeftLine(i);
            printRightLine(i);
            System.out.println();
        }

        // 그래프 하단 라인 그리기
        System.out.printf("%s", BOTTOM_LINE);

        // 그래프 하단 X축 라벨 그리기
        for (int i = 2; i <= GRAPH_SIZE; i += 2) {
            System.out.printf("%6d", i);
        }

        System.out.println();
    }

    private void printLeftLine(int yIndex) {
        if (yIndex % 2 == 0) {
            System.out.printf("%2d%s", yIndex, PIPE_LINE);
            return;
        }

        System.out.print("  " + PIPE_LINE);
    }

    private void printRightLine(int y) {
        for (int j = 0; j < GRAPH_SIZE; j++) {
            this.printDot(y, j);
        }
    }

    private void printDot(int yIndex, int xIndex) {
        String s = WHITE_SPACE;
        if (figure.contains(getOrDefaultGraph(xIndex, yIndex))) {
            s = POINT;
        }

        System.out.printf("%3s", s);
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
