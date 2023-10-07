package coordinate.domain;

public enum FigureType {
    Line(2),
    Rectangle(4);


   private final int pointCount;

    FigureType(int pointCount) {
        this.pointCount = pointCount;
    }

    public static boolean isLine(int pointCount) {
        return Line.pointCount == pointCount;
    }

    public static boolean isRectangle(int pointCount) {
        return Rectangle.pointCount == pointCount;
    }
}
