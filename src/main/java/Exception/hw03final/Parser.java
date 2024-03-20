package Exception.hw03final;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Parser {
    public String[] strings;
    String inputString;
    User user;

    public Parser(String inputString) {
        this.inputString = inputString;
        this.strings = new String[6];
        sptlitData();
    }

    public String[] getStrings() {
        return strings;
    }


    public String[] sptlitData() {
        if (inputString.equals("") || inputString.equals(" ")) throw new RuntimeException("Введена пустая строка");
        else if (inputString.split(" ").length != 6) throw new MyRunTimeExeption(strings.length);
        else strings = inputString.split(" ");
        return strings;
    }

    public void createUser() {
        this.user = new User(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5].charAt(0));
    }


    public void checkData() {
        //Проверка ФИО
        System.out.println("Проверка ФИО...");
        if (!isAlpha(strings[0]))throw new RuntimeException("Фамилия: неверный ввод. Требуется буквенный формат");
        if (!isAlpha(strings[1]))throw new RuntimeException("Имя: неверный ввод. Требуется буквенный формат");
        if (!isAlpha(strings[2]))throw new RuntimeException("Отчество: неверный ввод. Требуется буквенный формат");

        if (strings[0].length() < 2 && isAlpha(strings[0])) throw new RuntimeException("Фамилия: неверный ввод. Должно быть не менее 2х символов");
        if (strings[1].length() < 1) throw new RuntimeException("Имя: неверный ввод. Должно быть не менее 1х символов");
        if (strings[2].length() < 1) throw new RuntimeException("Отчество: неверный ввод. Должно быть не менее 1х символов");

        if (isNumeric(strings[0])) throw new RuntimeException("Фамилия: неверный ввод. Не может быть числом");
        if (isNumeric(strings[1])) throw new RuntimeException("Имя: неверный ввод. Не может быть числом");
        if (isNumeric(strings[2])) throw new RuntimeException("Отчество: неверный ввод. Не может быть числом");

        //Проверка даты
        if (isDateValid(strings[3], "dd.MM.yyyy")) {
            System.out.println("Введенная строка " + strings[3] + "Дата: является допустимой датой в формате dd.mm.yyyy.");
        } else {
            throw new RuntimeException("Введенная строка " + strings[3] + " не является допустимой датой в формате dd.mm.yyyy.");
        }

        //Проверка телефона
        System.out.println("Проверка телефона...");
        if (!isNumeric(strings[4])) throw new RuntimeException("Телефон: поле не является числом");
        else if (!(Long.parseLong(strings[4]) >0)) throw new RuntimeException("Телефон: должно быть положительны числом");
        else  if(strings[4].length()<6) throw new RuntimeException("Телефон: должно быть более 6 цифр");


        //Проверка Пол

        System.out.println("Проверка поля пол...");
        if (strings[5].equals("f") || strings[5].equals("m")) {
            System.out.println("Вcе данные соответствуют формату");
        } else {
            throw new RuntimeException("Пол: значение не равно 'f' или 'm'");
        }

    }
    public boolean isAlpha(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNumeric(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isDateValid(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(true); // Устанавливаем строгий режим проверки

        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
