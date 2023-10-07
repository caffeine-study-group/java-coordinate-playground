package coordinate.domain;

import java.util.Arrays;
import java.util.List;

public class TriangleFigure extends AbstractFigure {

    public TriangleFigure(Points points) {
        super(points);
    }

    @Override
    public double distance() {
        return 0;
    }

    @Override
    public double area() {
        Figure lineA = this.getLine(0, 1);
        Figure lineB = this.getLine(0, 2);
        Figure lineC = this.getLine(1, 2);
        double a = lineA.distance();
        double b = lineB.distance();
        double c = lineC.distance();

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private Figure getLine(int p1, int p2) {
        List<Point> pointList = super.points.getList();
        return FigureFactory.generate(new Points(Arrays.asList(pointList.get(p1), pointList.get(p2))));
    }
}
