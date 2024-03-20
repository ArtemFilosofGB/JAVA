package Exception.hw03final;


import java.util.Scanner;

import static Exception.hw03final.File.writeUserToFile;

public class Main {
    public static void main(String[] args) {


        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите данные пользователя в формате: <Фамилия> <Имя> <Отчество> <дата_рождения> <номер_телефона> <пол>");
        String nextLine = scaner.nextLine();
        Parser parser = new Parser(nextLine);

        //проверка длинны
        int arrLength = parser.getStrings().length;
        //Введено недостаточно данных
        if (arrLength != 6) throw new MyRunTimeExeption(arrLength);
        else {
            System.out.println("Проверка на корректные данные...");
            parser.checkData();
            parser.createUser();
            System.out.println("Создан пользователь"+parser.user.toString());
            String fileName = parser.strings[0] + ".txt";
            writeUserToFile(fileName, parser.user);

        }


    }


}
