package OOP.Seminare01;

import java.util.ArrayList;
import java.util.List;

public class VendingMashineBotlOfWater implements VendingMashine {

    List<Product> productList = new ArrayList<>();

    @Override
    public String toString() {
        return productList.toString();//todo: прописать вывод
    }


    @Override
    public void initProduct(List<Product> list) {
        this.productList = list;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, int cost, double volume) {
        return null;
    }


    @Override
    public Product getProduct(int cost) {
        return null;
    }

    public void addBotlofWater(BotlOfWater botlOfWater){
        this.productList.add(botlOfWater);

    }

}
