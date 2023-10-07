package coordinate.domain;

public class RectangleFigure extends AbstractFigure {

    public RectangleFigure(Points points) {
        super(points);
    }

    @Override
    public double distance() {
        return 0;
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }

    private int getWidth() {
        return super.points.getMaxX() - super.points.getMinX();
    }

    private int getHeight() {
        return super.points.getMaxY() - super.points.getMinY();
    }
}
