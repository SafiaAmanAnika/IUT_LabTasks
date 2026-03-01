public class Dancer extends Person {
    private String groupName, academy;

    public Dancer(String name, int age, String city, String groupName, String academy) {
        super(name, age, city);
        this.groupName = groupName;
        this.academy = academy;
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getAcademy() {
        return academy;
    }
    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public void dance() {
        System.out.println(getName() + " is dancing.");
    }
}