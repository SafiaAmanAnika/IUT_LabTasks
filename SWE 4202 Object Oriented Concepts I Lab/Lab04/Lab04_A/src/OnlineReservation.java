public class OnlineReservation extends Reservation {
    
    @Override
    public void bookRoom() {
        System.out.println("Booking room through online reservation system.");
    }

    @Override
    public void bookRoom(String guestName) {
        System.out.println("Booking for guest " + guestName + " via online system.");
    }
}
