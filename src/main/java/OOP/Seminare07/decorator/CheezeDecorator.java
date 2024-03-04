package OOP.Seminare07.decorator;

public class CheezeDecorator extends PizzaDecorator{
    public CheezeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCoes() {
        return pizza.getCoes()+20;
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription()+" cheeze";
    }
}
