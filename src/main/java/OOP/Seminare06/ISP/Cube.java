package OOP.Seminare06.ISP;

import java.awt.*;

public class Cube implements Shape, Shape3D {

    private int len;

    public Cube(int len) {
        this.len = len;
    }

    @Override
    public double perimeter() {
        return 12 * len;
    }

    @Override
    public double value() {
        return len*len*len;
    }
}
