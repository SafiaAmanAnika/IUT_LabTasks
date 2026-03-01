public class Reservation {
    
    public void bookRoom() {
        System.out.println("Booking a standard room.");
    }

    public void bookRoom(String guestName) {
        System.out.println("Booking a standard room for " + guestName);
    }

    public void bookRoom(String guestName, boolean isVIP) {
        if(isVIP == true) {
            System.out.println("Booking a VIP room for " + guestName);
        } else {
            System.out.println("Booking a standard room for " + guestName);
        }
    }
}
