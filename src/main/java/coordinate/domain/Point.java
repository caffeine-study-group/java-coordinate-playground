package coordinate.domain;

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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
