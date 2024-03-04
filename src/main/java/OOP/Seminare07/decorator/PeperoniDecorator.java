package OOP.Seminare07.decorator;

public class PeperoniDecorator extends PizzaDecorator{
    public PeperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCoes() {
        return pizza.getCoes()+30;
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription()+" peperoni";
    }
}
