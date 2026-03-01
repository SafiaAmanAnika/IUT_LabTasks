public class Staff extends Person {
    protected String staffRole;

    public Staff(String name, String address, String mobileNo, String staffRole) {
        super(name, address, mobileNo);
        this.staffRole = staffRole;
    }

    public void performDuty() {
        System.out.println(staffRole + " is performing duty.");
    }
}