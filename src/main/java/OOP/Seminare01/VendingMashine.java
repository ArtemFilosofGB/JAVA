package OOP.Seminare01;

import java.util.ArrayList;
import java.util.List;

public interface VendingMashine {

    void initProduct(List<Product> productList);

    Product getProduct(String name);
    Product getProduct(String name, int cost, double volume);
    Product getProduct(int cost);
}
