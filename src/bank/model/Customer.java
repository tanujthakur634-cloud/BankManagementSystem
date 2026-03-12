package bank.model;

public class Customer {
    private final int customerID;
    private final String name, phoneNo;

    public Customer(int customerID, String phoneNo, String name) {
        this.customerID = customerID;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void display() {
        System.out.println("\n***********Customer Details***********\n");
        System.out.println("Name : " + name);
        System.out.println("Customer ID : " + customerID);
        System.out.println("Phone Number : " + phoneNo);
    }
}
