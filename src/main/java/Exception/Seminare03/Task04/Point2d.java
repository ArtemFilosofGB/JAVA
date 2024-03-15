package Exception.Seminare03.Task04;

public class Point2d {
    int x;
    int y;

    @Override
    public String toString() {
        return String.format("(%s,%s)",x,y);
    }

    public Point2d(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
