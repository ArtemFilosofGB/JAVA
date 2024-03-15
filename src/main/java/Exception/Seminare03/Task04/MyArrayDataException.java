package Exception.Seminare03.Task04;

import java.util.List;

public class MyArrayDataException extends IllegalArgumentException{
    public MyArrayDataException(int i,int j) {
        super(String.format("Value in cell [%s][%s] in not number",i,j));
    }

    public MyArrayDataException(List<Point2d> points) {
        super(String.format("Value in cells %s are not numbers",points));
    }
}
