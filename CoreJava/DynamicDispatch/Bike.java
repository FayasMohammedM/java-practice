package DynamicDispatch;

public class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike starts with kicker");
    }
}
