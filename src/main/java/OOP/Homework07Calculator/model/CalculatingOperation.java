package OOP.Homework07Calculator.model;

public abstract class CalculatingOperation {
    Calculator calculator = new Calculator();
    private double result = 0;

    public double getResult() {
        return result;
    }

    public double getResult(double number1, double number2, String operator) {

        switch (operator) {
            case "+":
                calculator.setOperation(new Summ());
                this.result = calculator.calculate(number1, number2);
                break;
            case "-":
                calculator.setOperation(new Subtraction());
                this.result = calculator.calculate(number1, number2);
                break;
            case "*":
                calculator.setOperation(new Multiplication());
                this.result = calculator.calculate(number1, number2);
                break;
            case "/":
                if (number2 != 0) {
                    calculator.setOperation(new Division());
                    this.result = calculator.calculate(number1, number2);
                } else {
                    System.out.println("Деление на ноль недопустимо.");
                    return 0;
                }
        }
        return this.result;
    }
}
