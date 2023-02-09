public class Customer {
    private String name;
    private int creditLimit;
    private String address;

    public Customer(String name, int creditLimit, String address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.address = address;
    }

    public Customer(){
        this("Default Name","default address");
    }

    public Customer(String name, String address) {
        this(name, 0, address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
