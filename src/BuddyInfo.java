public class BuddyInfo {

    private String name;
    private String address;
    private String phonenumber;

    public BuddyInfo(String name, String address, String phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public BuddyInfo() {
        this("Unknown", "Unknown", "Unknown");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public String getPhonenumber() {
        return phonenumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Lisa", "Unknown", "Unknown");

        System.out.println("Hello " + buddy.getName());
    }
}