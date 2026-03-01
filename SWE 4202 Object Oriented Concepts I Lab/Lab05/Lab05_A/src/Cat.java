public class Cat extends Animal {

    public Cat(String name, String habitat) {
        super(name, habitat);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void displayInfo() {
        System.out.println(getName() + " is a " + getHabitat() + " cat");
    }
}
