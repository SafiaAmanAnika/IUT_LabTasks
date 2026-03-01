public class CookingStaff extends Staff {

    public CookingStaff(String name, String address, String mobileNo, String staffRole) {
        super(name, address, mobileNo, staffRole);
    }

    public void cookDish() {
        System.out.println(staffRole + " is cooking a dish.");
    }

    public void cleanDish() {
        System.out.println(staffRole + " is cleaning the dishes.");
    }
}