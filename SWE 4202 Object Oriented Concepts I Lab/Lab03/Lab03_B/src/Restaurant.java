public class Restaurant {
    public static void main(String[] args) {
        Customer c1 = new Customer("Anika", "Gazipur", "01675485055");
        c1.reserveDate("24/7/2025");
        c1.notePreferences("more onions", "nuts");
        System.out.println();

        CookingStaff chef = new CookingStaff("Rahim", "Dhaka", "01711223344", "Chef");
        chef.performDuty();
        chef.cookDish();
        chef.cleanDish();
        System.out.println();

        WaitingStaff waiter = new WaitingStaff("Karim", "Narayanganj", "01888776655", "Waiter");
        waiter.performDuty();
        waiter.takeOrder();
        waiter.suggestWine();
        System.out.println();

        CleaningStaff cleaner = new CleaningStaff("Selim", "Comilla", "01554321098", "Cleaner");
        cleaner.performDuty();
        cleaner.cleanDish();
    }
}