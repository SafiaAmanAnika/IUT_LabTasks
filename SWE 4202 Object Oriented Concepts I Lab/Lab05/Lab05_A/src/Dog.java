public class Dog extends Animal {

    public Dog(String name) {
        super(name, "domestic");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void displayInfo() {
        System.out.println(getName() + " is a domestic dog.");
    }
}
