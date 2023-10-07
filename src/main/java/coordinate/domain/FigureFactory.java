package coordinate.domain;

public class FigureFactory {
    public static Figure generate(Points points) {
        if (FigureType.isLine(points.getSize())) {
            return new LineFigure(points);
        }

        if (FigureType.isRectangle(points.getSize())) {
            return new RectangleFigure(points);
        }

        if (FigureType.isTriangle(points.getSize())) {
            return new TriangleFigure(points);
        }

        throw new IllegalArgumentException();
    }
}
