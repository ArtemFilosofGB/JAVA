package OOP.Seminare01;

public class BotlOfWater extends Product{
    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BotlOfWater{" +
                "name = " + super.getName() + ' ' +
                " cost = " + super.getCost() +' ' +
                " volume = " + volume +
                '}'+'\n';
    }

    public BotlOfWater(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public BotlOfWater(int volume) {
        this.volume = volume;
    }

    public BotlOfWater(String name, int cost) {
        super(name, cost);
    }

    public BotlOfWater(int cost, double volume) {
        super(cost);
        this.volume = volume;
    }
}
