package OOP.Homework07Calculator;

import OOP.Homework07Calculator.Controller.UserController;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();
        userController.help();//Вывод справки

        while (userController.getRun()){

            String expretion = userController.getUserInput();//Ввод строки
            userController.parseInput(expretion);//разделяем троку
            userController.showParsed();//Вывод результата разделения
            userController.getResult();//Вычисление
            userController.printResult(); //вывод результата
        }
    }
}
