public class Programmer extends Person {
    private String company, position;

    public Programmer(String name, int age, String city, String company, String position) {
        super(name, age, city);
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public void code() {
        System.out.println(getName() + " is coding.");
    }
}