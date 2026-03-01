abstract public class Vehicle {
    private String name, fuelType;

    public Vehicle(String name, String fuelType) {
        this.name = name;
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public String getFuelTyep() {
        return fuelType;
    }

    public void showInfo() {
        System.out.println("Vehicle name: " + name + "\nFuel type: " + fuelType);
    }

    abstract void honk();
    abstract void startJourney();
    abstract void stopJourney();
}