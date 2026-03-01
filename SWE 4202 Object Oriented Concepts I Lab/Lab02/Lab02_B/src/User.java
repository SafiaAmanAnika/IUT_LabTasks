public class User {
    private String userId, name, phoneNo, membershipType;
    private Boolean isAccountActive;

    public User(){};
    public User(String userId, String name, String phoneNo, String membershipType) {
        this.userId = userId; 
        this.name = name;
        this.phoneNo = phoneNo;
        this.membershipType = membershipType;
        this.isAccountActive = true;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMembershipType() {
        return membershipType;
    }
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public Boolean getIsAccountActive() {
        return isAccountActive;
    }

    public void deactivateAccount() {
        isAccountActive = false;
    }

    public void reactivateAccount() {
        isAccountActive = true;
    }

    public void displayProfileInfo() {
        System.out.println(
            "User ID: " + getUserId() + "\nUser name: " + getName() 
            + "\nUser phone number: " + getPhoneNo() + "\nMembership Type: " + getMembershipType()
            + "\nAccount Status: " + (getIsAccountActive()? "Active" : "Deactive"));
        System.out.println("----------------------");
    }
}