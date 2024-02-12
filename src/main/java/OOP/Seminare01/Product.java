package OOP.Seminare01;
/**
 * Абстрактный Продукт
 * Имя String
 * Стоимость Int
 */
public abstract class Product {

    private String name;
    private int cost;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Product() {
        this.name="default_name";
        this.cost=0;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(String name) {
        this.name=name;
        this.cost=0;

    }    public Product(int cost) {
        this.name="default_name";
        this.cost=cost;
    }

    public String getName() {
        return this.name;
    }

}
