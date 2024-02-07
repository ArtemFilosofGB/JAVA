package API_GB.Seminare_5.homework5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> arrLst = new ArrayList<>();
        arrLst.add(phoneNum);
        if (!phoneBook.containsKey(name)) phoneBook.put(name, arrLst);
        else {
            arrLst.add(phoneNum);
            phoneBook.put(name, arrLst);
        }
// Введите свое решение ниже


    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> found = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else return found;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже

        return phoneBook;
    }
}
// Не удаляйте этот класс - он нужен для
