public class Customer extends Person {
    protected String date, specialPrefences, allergies;

    public Customer(String name, String address, String mobileNo) {
        super(name, address, mobileNo);
    }

    public void reserveDate(String date) {
        System.out.println("The customer is reserving a table on the date: " + date);
    }

    public void notePreferences(String specialPreferences, String allergies) {
        System.out.println(
            "The customer prefers " + specialPreferences  + " and has an allergy of " + allergies);
    }
}