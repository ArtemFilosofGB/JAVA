package OOP.Seminare01;

import java.util.ArrayList;
import java.util.List;

public class VendingMashineHotDrink implements VendingMashine{

    List<Product> ListHotDrinks = new ArrayList<>();

    @Override
    public String toString() {
        return "VendingMashineHotDrink{" +
                "ListHotDrinks=" + ListHotDrinks.toString() +
                '}';
    }

    @Override
    public void initProduct(List<Product> productList) {

    }

    @Override
    public Product getProduct(String name) {
        for (Product hotDrink : ListHotDrinks) {
            if(hotDrink.getName().equals(name))
                return hotDrink;
        }
        return null;
    }

    @Override
    public Product getProduct(String name, int cost, double volume) {
        return null;
    }

//    @Override
//    public Product getProduct(String name, int cost, double volume) {
//        for (Product hotDrink : ListHotDrinks) {
//            if(hotDrink.getName().equals(name)
//                    && hotDrink.getCost()==cost
//                    && (BotlOfWater)hotDrink.getVolume()==volume)
//                return hotDrink;
//        }
//        return null;
//    }


    /**
     * Поиск продукта по стоимости
     * @param cost int
     * @return Продукт(Имя Стоимость Объём Температура)
     */
    @Override
    public Product getProduct(int cost) {
        for (Product hotDrink : ListHotDrinks) {
            if(hotDrink.getCost()==cost)
                return hotDrink;
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink){
        this.ListHotDrinks.add(hotDrink);
    }
}
