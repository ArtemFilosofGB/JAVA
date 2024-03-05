package OOP.Homework07Calculator.model;

public class Summ implements Operation{
    @Override
    public double calculate(double number1, double number2) {
        return number1+number2;
    }
}
