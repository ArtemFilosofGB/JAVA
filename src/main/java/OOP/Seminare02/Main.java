package OOP.Seminare02;

import org.slf4j.Marker;

public class Main {
    public static void main(String[] args) {
        Market marker = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Petr");
        marker.acceptToMarket(human1);
        marker.update();
    }
}
