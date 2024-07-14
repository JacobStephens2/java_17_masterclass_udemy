public class Customer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("Jacob", 100, "test701@gmail.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 100, emailAddress);
    }
}
