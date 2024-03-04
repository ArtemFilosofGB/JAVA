package OOP.Homework07Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new Summ());
        System.out.println("5 + 3 = " + calculator.calculate(5, 3));

        calculator.setOperation(new Subtraction());
        System.out.println("5 - 3 = " + calculator.calculate(5, 3));

        calculator.setOperation(new Multiplication());
        System.out.println("5 * 3 = " + calculator.calculate(5, 3));

        calculator.setOperation(new Division());
        System.out.println("5 / 3 = " + calculator.calculate(5, 3));
    }
}
