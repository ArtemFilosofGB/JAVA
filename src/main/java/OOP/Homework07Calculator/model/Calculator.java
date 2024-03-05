package OOP.Homework07Calculator.model;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
    public double calculate(double num1,double num2){
        return operation.calculate(num1,num2);
    }
}
