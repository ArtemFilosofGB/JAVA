package OOP.Seminare06.DIP;

public class mainDIP {
    public static void main(String[] args) {
        Car car = new Car(new DiselEngin());
        car.start();
        car = new Car(new PetrolEngine());
        car.start();
    }
}
