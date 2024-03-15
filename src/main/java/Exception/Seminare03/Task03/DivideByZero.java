package Exception.Seminare03.Task03;

public class DivideByZero extends ArithmeticException{
    public DivideByZero() {
        super("На ноль делить нельзя!");
    }

    public DivideByZero(String s) {
        super(s);
    }
}
