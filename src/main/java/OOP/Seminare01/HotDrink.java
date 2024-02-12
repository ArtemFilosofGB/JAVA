package OOP.Seminare01;

/**
 * @apiNote HotDrink - класс описывает горячий напитки
 *
 */

public class HotDrink extends BotlOfWater{

    int temperature=-1;

    /**
     * @apiNote Горячий напиток с температурой
     * @param name String
     * @param cost int
     * @param volume double
     * @param temperature int По умолчанию -1 (температура не установлена)
     */
    public HotDrink(String name, int cost, double volume,int temperature) {
       super(name,cost,volume);
       this.temperature=temperature;
    }

    public HotDrink(int volume) {
        super(volume);
    }

    public HotDrink(String name, int cost) {
        super(name, cost);
    }

    public HotDrink(int cost, int volume) {
        super(cost, volume);
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = " + super.getName() + ' ' +
                " cost = " + super.getCost() +' ' +
                " volume = " + super.getVolume() +
                " temperature=" + temperature +
                '}'+'\n';
    }

    /**
     * @apiNote Конструктор класс HotDrink
     * @param name
     * @param cost
     * @param volume
     */
    public HotDrink(String name, int cost, double volume) {
        super(name, cost, volume);
    }
}
