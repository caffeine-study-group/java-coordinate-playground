package coordinate.domain;

public enum FigureType {
    Line(2);


   private final int pointCount;

    FigureType(int pointCount) {
        this.pointCount = pointCount;
    }

    public static boolean isLine(int pointCount) {
        return Line.pointCount == pointCount;
    }
}
