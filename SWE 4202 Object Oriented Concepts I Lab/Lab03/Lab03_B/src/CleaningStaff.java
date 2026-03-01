public class CleaningStaff extends Staff {

    public CleaningStaff(String name, String address, String mobileNo, String staffRole) {
        super(name, address, mobileNo, staffRole);
    }

    public void cleanDish() {
        System.out.println("Cleaning staff is cleaning the restuarant.");
    }
}