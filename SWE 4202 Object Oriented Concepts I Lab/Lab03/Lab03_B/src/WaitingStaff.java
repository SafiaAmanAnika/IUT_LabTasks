public class WaitingStaff extends Staff {

    public WaitingStaff(String name, String address, String mobileNo, String staffRole) {
        super(name, address, mobileNo, staffRole);
    }

    public void takeOrder() {
        System.out.println(staffRole + " is taking orders.");
    }

    public void suggestWine() {
        System.out.println(staffRole + " is suggesting wine.");
    }
}