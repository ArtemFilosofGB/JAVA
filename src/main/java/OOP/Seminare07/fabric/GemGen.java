package OOP.Seminare07.fabric;

public class GemGen implements ItemGen{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
