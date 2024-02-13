package API_GB.Seminare_6.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("Вася", new ArrayList<>(Arrays.asList(8001123, 8001111)));
        phoneBook.add("Пушкин", 890080077);
        phoneBook.add("Лермонтов", 890081177);
        phoneBook.add("Пелевин", 890082000);
        phoneBook.add("Пелевин", 900000);
        phoneBook.add("Пелевин", 890022220);

        phoneBook.sort3();
        phoneBook.printBook();
        phoneBook.deleteContact("Пушкин");
        phoneBook.deleteNumber("Пелевин", 900000);
        System.out.println("-------------");
        phoneBook.printBook();


    }
}
