package OOP.Seminare06.OCP;

public class Car extends Vehicle{

    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed()*0.8;
    }
}
