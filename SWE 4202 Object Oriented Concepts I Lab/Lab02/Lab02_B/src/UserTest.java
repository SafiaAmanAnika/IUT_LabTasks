public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("230042120", "Safia Aman Anika", "0167245055", "Student");
        u1.displayProfileInfo();

        User u2 = new User();
        u2.setUserId("230042135");
        u2.setName("Khadiza Sultana");
        u2.setPhoneNo("01841655055");
        u2.setMembershipType("Teacher");
        u2.deactivateAccount();
        u2.displayProfileInfo();

        u2.reactivateAccount();
        u2.displayProfileInfo();
    }
}