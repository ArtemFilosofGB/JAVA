package OOP.Seminare07.decorator;

public class PizzaDough implements Pizza {
    @Override
    public double getCoes() {
        return 150;
    }

    @Override
    public String getDiscription() {
        return "Тесто";
    }
}
