package API_GB.Seminare_3.z01;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("logka","ru",10000);
        Item item2 = new Item("vilka","ru",10000);
        Item item3 = new Item("logka","ru",10000);
        Item item4 = new Item("logka","ru",10000);
        Item item5 = new Item("logka","ru",10000);
        ArrayList<Item> itemList = new ArrayList<>(100);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);

        Scanner scaner = new Scanner(System.in);
        String search = scaner.nextLine();

        for (int i = 0; i < 100; i++) {
            Item elem = itemList.get(i);
        }
        ArrayList<String> country = new ArrayList<>();
        Integer sumVolume=0;

        for (Item elem : itemList) {
            if(elem.getName().equals(search)){
                sumVolume+= elem.getVolume();
                country.add(elem.getCountry());
            }
        }
        System.out.println(sumVolume);
        System.out.println("country = " + country);
    }
}
