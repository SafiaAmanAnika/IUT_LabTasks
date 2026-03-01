public class Bus extends Vehicle {

    public Bus(String name, String fuelType) {
        super(name, fuelType);
    }

    @Override
    void honk() {
        System.out.println("Honk! Honk!");
    }

    @Override
    void startJourney() {
        System.out.println("Bus is departing with passengers.");
    }

    @Override
    void stopJourney() {
        System.out.println("Bus has reached its destination...");
    }
}