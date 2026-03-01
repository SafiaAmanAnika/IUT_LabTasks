public class Cow extends Animal {

    public Cow(String name) {
        super(name, "farm");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }

    @Override
    public void displayInfo() {
        System.out.println(getName() + " is a farm cow");
    }
}
