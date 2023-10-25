package coordinate.domain;

public class LineFigure extends AbstractFigure {
    public LineFigure(Points points) {
        super(points);
    }

    @Override
    public double distance() {
        return Math.sqrt(Math.pow(subtractExactX(), 2) + Math.pow(subtractExactY(), 2));
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String returnSizeMessage() {
        return String.format("두 점 사이의 거리는 %d", distance());
    }

    private int subtractExactX() {
        return Math.subtractExact(super.points.getX(0), super.points.getX(1));
    }

    private int subtractExactY() {
        return Math.subtractExact(super.points.getY(0), super.points.getY(1));
    }
}
