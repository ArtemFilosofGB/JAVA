package OOP.Homework07Calculator.view;

public class Prints {
    public String exitTxt ="Прощай пользователь, надеюсь мы всё посчитали";
    public void PrintToConsole(double result) {
        System.out.println("Результат = " + result + "\n");

    }

    public void printHelp() {
    System.out.println("Программа Калькулятор\n" +
            "Ввод производится в формате: Цифра(пробел)Операция(пробел)Цифра(Enter)\n" +
            "Операция: + , - , * , /\n" +
            "Для выхода введи - q");

    }
    public void exitText(){
        System.out.println(exitTxt);
    }
}
