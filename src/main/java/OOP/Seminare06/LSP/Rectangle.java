package OOP.Seminare06.LSP;

public class Rectangle extends QuadRangie{

    private int wight;

    public Rectangle(int wight, int heigth) {
        this.wight = wight;
        this.heigth = heigth;
    }

    private int heigth;
    @Override
    public int area() {
        return heigth*wight;
    }
}
