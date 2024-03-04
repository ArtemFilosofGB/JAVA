package OOP.Homework07Calculator;

public class Division implements Operation{
    @Override
    public double calculate(double number1, double number2) {
        if (!isZero(number2)){
            System.out.println("Невозможно! Деление на ноль!");
        }
        return number1/number2;
    }

    boolean isZero(double number){
        if (number==0) return true;
        return false;
    }

}
