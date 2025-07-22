package DynamicDispatch;

public class DynamicDispatch {
    public static void main(String[] args) {
       Vehicle myVehicle;
       myVehicle = new Car();
       myVehicle.startEngine();

       myVehicle = new Bike();
       myVehicle.startEngine();

       myVehicle = new Vehicle();
       myVehicle.startEngine();

    }
}
