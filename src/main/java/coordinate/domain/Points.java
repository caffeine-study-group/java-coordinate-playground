package coordinate.domain;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    public int getX(int i){
        return list.get(i).getX();
    }

    public int getY(int i){
        return list.get(i).getY();
    }

    public int getMinX() {
        return list
                .stream()
                .mapToInt(Point::getX)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

    public int getMaxX() {
        return list
                .stream()
                .mapToInt(Point::getX)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public int getMinY() {
        return list
                .stream()
                .mapToInt(Point::getY)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

    public int getMaxY() {
        return list
                .stream()
                .mapToInt(Point::getY)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }
}
