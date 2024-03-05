package OOP.Homework07Calculator.model;

public class Division implements Operation{
    @Override
    public double calculate(double number1, double number2) {
        if (isZero(number2)){
            System.out.println("Невозможно! Деление на ноль!");
            return 0;
        }
        return number1/number2;
    }

    boolean isZero(double number){
        return number == 0;
    }

}
