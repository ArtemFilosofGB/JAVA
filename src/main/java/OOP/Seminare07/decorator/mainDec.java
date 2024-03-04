package OOP.Seminare07.decorator;

public class mainDec {
    public static void main(String[] args) {
        Pizza pizza = new CheezeDecorator(
                new CheezeDecorator(
                        new PeperoniDecorator(
                                new PizzaDough())
                        )
                );
        printPizza(pizza);

    }

    static void printPizza(Pizza pizza) {
        System.out.println(pizza.getDiscription());
        System.out.println(pizza.getCoes());
    }
}
