public class AnimalSimulator {
    public static void main(String[] args) {
        Animal a1 = new Dog("Nala");
        Animal a2 = new Cat("Beans", "indoor");
        Animal a3 = new Cow("Bob");

        a1.makeSound();
        a1.displayInfo();
        
        a2.makeSound();
        a2.displayInfo();

        a3.makeSound();
        a3.displayInfo();
    }
}
