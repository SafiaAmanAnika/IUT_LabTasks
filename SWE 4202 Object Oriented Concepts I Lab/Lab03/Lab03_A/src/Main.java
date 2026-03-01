public class Main {
    public static void main(String[] args) {
        Person p1 = new Programmer("Raiyan", 24, "Dhaka", "Microsoft", "Junior Software Engineer");
        Person p2 = new Dancer("Tahsin", 24, "Dhaka", "Elite group", "Shilpokola Academy");
        Person p3 = new Singer("Anika", 24, "Dhaka", "Imaginary band", "Lead vocalist");

        p1.eat();
        p1.sleep();
        p1.walk();
        p1.learn();
        ((Programmer)p1).code();
        ((Dancer)p2).dance();
        ((Singer)p3).sing();
        ((Singer)p3).playGuitar();
    }
}
