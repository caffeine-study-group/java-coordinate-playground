package coordinate.domain;

public abstract class AbstractFigure implements Figure {
    protected final Points points;

    public AbstractFigure(Points points) {
        this.points = points;
    }

    @Override
    public boolean contains(Point point) {
        return this.points.contains(point);
    }
}
