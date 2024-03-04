package OOP.Seminare07.fabric;

public class GoldGen implements ItemGen{

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
