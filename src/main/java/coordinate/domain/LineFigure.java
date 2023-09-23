package coordinate.domain;

public class LineFigure extends AbstractFigure {
    public LineFigure(Points points) {
        super(points);
    }

    @Override
    public double distance() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}
