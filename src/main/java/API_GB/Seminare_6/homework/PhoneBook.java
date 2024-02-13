package API_GB.Seminare_6.homework;

import java.util.*;

public class PhoneBook {
    private static Map<String, List<Integer>> db = new HashMap<>();

    public PhoneBook() {
    }

    public PhoneBook(Map<String, List<Integer>> db) {
        this.db = db;
    }

    public <E> PhoneBook(String name, List<E> numbers) {
        this.db.put(name, (List<Integer>) numbers);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "db=" + db +
                '}';
    }

    public void add(String name, Integer number) {
        List<Integer> values = db.get(name);
        if (values == null) {
            values = new ArrayList<Integer>();
            db.put(name, values);
        }
        values.add(number);
    }

    public List<Integer> find(String name) {
        List<Integer> found = new ArrayList<>();
        if (db.containsKey(name)) {
            return db.get(name);
        } else return found;
    }


    public void printBook() {
        Map<String, List<Integer>> map = db;
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ",";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }


    public void sort3() {

        for (List<Integer> value : db.values()) {
            System.out.println("value.size() = " + value.size() + "\n");

        }

    }

    public void deleteContact(String name) {
        db.remove(name);
    }

    public void deleteNumber(String name, int number) {
        List<Integer> list=db.remove(name);
        list.remove(list.indexOf(number));
        for (Integer i : list) {
            add(name,i);
        }
    }
}



