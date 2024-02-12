package API_GB.Seminare_6.z4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Farengate();
        Kelvin kelvin = new Kelvin();
        System.out.println("converter = " + converter.convertValue(100));
    }
}
