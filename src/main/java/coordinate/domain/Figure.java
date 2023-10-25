package coordinate.domain;

public interface Figure {


    double distance();  // 거리

    double area();      // 너비

    String returnSizeMessage();

    boolean contains(Point point);
}
