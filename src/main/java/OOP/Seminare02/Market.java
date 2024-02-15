package OOP.Seminare02;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришёл в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();

    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                actor.setMakeOrder(false);
                System.out.println(actor.getName() + " получил заказ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (!actor.isTakeOrder()) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + "вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);

    }
}
