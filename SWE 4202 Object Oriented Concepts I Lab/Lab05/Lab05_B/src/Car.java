public class Car extends Vehicle{
    
    public Car(String name, String fuelType) {
        super(name,fuelType);
    }

    @Override
    void honk() {
        System.out.println("Beep! Beep!");
    }

    @Override
    void startJourney() {
        System.out.println("Car is starting the journey.");
    }

    @Override
    void stopJourney() {
        System.out.println("Car has stopped.");
    }
}