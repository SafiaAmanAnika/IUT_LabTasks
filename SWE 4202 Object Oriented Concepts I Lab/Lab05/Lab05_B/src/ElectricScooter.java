public class ElectricScooter extends Vehicle {

    public ElectricScooter(String name, String fuelType) {
        super(name, fuelType);
    }

    @Override
    void honk() {
        System.out.println("Beep!");
    }

    @Override
    void startJourney() {
        System.out.println("Scooter starts silently.");
    }

    @Override
    void stopJourney() {
        System.out.println("Scooter is parked.");
    }

    public void rechargeBattery() {
        System.out.println("Recharging battery...");
    }
}