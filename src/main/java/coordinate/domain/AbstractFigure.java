package coordinate.domain;

public abstract class AbstractFigure implements Figure {
     private final Points points;

    public AbstractFigure(Points points) {

        this.points = points;
    }
}
