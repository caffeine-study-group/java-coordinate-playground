package coordinate.domain;

public class FigureFactory {
    public static Figure generate(Points points) {
        if (FigureType.isLine(points.getSize())) {
            return new LineFigure(points);
        }

        return null;
    }
}
