package ch08.sec10;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();
        //불가능
        //vehicle.checkFare();

        Bus bus =  (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
