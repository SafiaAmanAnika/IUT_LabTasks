public class Singer extends Person {
    private String bandName, role;

    public Singer(String name, int age, String city, String bandName, String role) {
        super(name, age, city);
        this.bandName = bandName;
        this.role = role;
    }

    public String getBandName() {
        return bandName;
    }
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public void sing() {
        System.out.println(getName() + " is singing.");
    }

    public void playGuitar() {
        System.out.println(getName() + " is playing the Guitar.");
    }
}