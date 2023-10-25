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

    @Override
    public String returnSizeMessage() {
        return String.format("사각형 넓이는 %.0f", area());
    }

    private int getWidth() {
        return super.points.getMaxX() - super.points.getMinX();
    }

    private int getHeight() {
        return super.points.getMaxY() - super.points.getMinY();
    }
}
