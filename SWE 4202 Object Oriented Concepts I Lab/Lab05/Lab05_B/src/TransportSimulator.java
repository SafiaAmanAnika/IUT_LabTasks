import java.util.ArrayList;

public class TransportSimulator {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("BMW","Diesel"));
        vehicles.add(new Bus("Ena", "Petrol"));
        vehicles.add(new ElectricScooter("Tesla","Electricity"));

        for(Vehicle i: vehicles) {
            i.showInfo();
            i.honk();
            i.startJourney();
            i.stopJourney();

            if(i instanceof ElectricScooter) {
                ((ElectricScooter)i).rechargeBattery();
            }
        }
    }
}