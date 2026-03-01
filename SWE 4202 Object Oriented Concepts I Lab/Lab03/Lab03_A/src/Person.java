public class Person {
    private String name, city;
    private int age;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }

    public void walk() {
        System.out.println(getName() + " is walking.");
    }

    public void learn() {
        System.out.println(getName() + " is learning.");
    }
}