package OOP.Homework07Calculator.Controller;

import OOP.Homework07Calculator.model.CalculatingOperation;
import OOP.Homework07Calculator.view.Prints;

import java.util.Scanner;

/**
 "Программа Калькулятор\n" +
 "Ввод производится в формате: Цифра(пробел)Операция(пробел)Цифра(Enter)\n" +
 "Операция: + , - , * , /\n" +
 "Для ввода операций используй - getUserInput()\n" +
 "Для разделения строки на операнды и операцуию - parseInput(expretion)\n" +
 "Для отображения результатов разделения - showParsed()\n" +
 "Получение результата вычисления - getResult()\n"+
 "Для выхода введи - q");
 */
public class UserController extends CalculatingOperation implements ParseStringToOperation {

    private Scanner scanner;
    private double operand1;
    private double operand2;
    private String operator;
    public boolean run = true;
    Prints prints = new Prints();

    /**
     * Конструктор
     */
    public UserController() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Ввод команды
     *
     * @return input form user
     */
    public String getUserInput() {
        System.out.println("Введите выражение для калькулятора (например, '2 + 3'):");
        System.out.println("Для выхода введите q");
        String input = scanner.nextLine();
        if (input.toLowerCase().equals("q")) {
            this.run = false;
            this.exitCalc();
            return "";
        }
        return input;
    }

    /**
     * Разделение строки на команды
     *
     * @param input
     */
    @Override
    public void parseInput(String input) {
        String[] tokens = input.split(" "); // Разделение строки по пробелу

        if (tokens.length != 3) {
            System.out.println("Некорректный формат ввода. Попробуйте еще раз.");
            return;
        }

        this.operand1 = Double.parseDouble(tokens[0]);
        this.operand2 = Double.parseDouble(tokens[2]);
        this.operator = tokens[1];
    }

    public void showParsed() {
        System.out.println("operand1 = " + operand1);
        System.out.println("operator = " + operator);
        System.out.println("operand2 = " + operand2);
    }

    @Override
    public double getResult() {
        super.getResult(this.operand1, this.operand2, this.operator);
        return super.getResult();
    }


    public void help() {
        prints.printHelp();
    }

    public void exitCalc() {
        prints.exitText();
        System.exit(0);
    }

    public boolean getRun() {
        return run;
    }

    public void printResult() {
        prints.PrintToConsole(super.getResult());
    }
}
