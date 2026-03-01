public class Main {
    public static void main(String[] args) {
        Reservation r1 = new Reservation();
        r1.bookRoom();
        r1.bookRoom("Anika", true);

        Reservation r2 = new OnlineReservation();
        r2.bookRoom();
        r2.bookRoom("Zenimeow");

        Reservation r3 = new WalkInReservation();
        r3.bookRoom();
    }
}
