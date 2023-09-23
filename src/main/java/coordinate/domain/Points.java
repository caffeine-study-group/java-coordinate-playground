package coordinate.domain;

import java.util.List;

public class Points {
    private final List<Point> list;

    public Points(List<Point> list) {
        this.list = list;
    }

    public List<Point> getList() {
        return list;
    }

    public int getSize() {
        return list.size();
    }
}
