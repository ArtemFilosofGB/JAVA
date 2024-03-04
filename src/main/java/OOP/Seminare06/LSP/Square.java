package OOP.Seminare06.LSP;

public class Square extends QuadRangie{
private int len;

    public Square(int len) {
        this.len = len;
    }

    @Override
    public int area() {
        return len*len;
    }
}
