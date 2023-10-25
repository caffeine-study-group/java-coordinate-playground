package coordinate.domain;

import java.util.Objects;

public class Point {
    private static final int MAX_NUM = 24;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        if (x > MAX_NUM || y > MAX_NUM) {
            throw new IllegalArgumentException("좌표는 24까지만 입력할 수 있습니다.");
        }
        this.x = x;
        this.y = y;
    }

    public Point(String input) {
        String[] points = input.split(",");

        if (points.length != 2) {
            throw new IllegalArgumentException("좌표는 X는 Y로 구성되어야 합니다.");
        }

        this.x = Integer.parseInt(points[0]);
        this.y = Integer.parseInt(points[1]);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
