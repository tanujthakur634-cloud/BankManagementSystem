package bank.service;

import bank.database.BankDatabase;
import bank.model.Account;
import bank.model.Customer;
import bank.utility.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class BankService {

    BankDatabase database = new BankDatabase();
    List<Customer> customers = new ArrayList<>();
    InputHelper inputHelper = new InputHelper();

    private int customerCounter = 1;


    public void createCustomer() {

        System.out.print("Enter the Name of the Customer : ");
        String name = inputHelper.readString();

        System.out.print("Enter the Phone Number of the Customer : ");
        String phoneNo = inputHelper.readString();

        int customerID = customerCounter++;

        Customer newCustomer = new Customer(customerID, phoneNo, name);

        customers.add(newCustomer);

        System.out.println("Customer Created Successfully");
        System.out.println("Customer ID : " + customerID);
    }

    public void createAccount() {

        if (customers.isEmpty()) {
            System.out.println("Create Customer First!");
            return;
        }

        System.out.print("Enter Customer ID : ");
        int customerId = inputHelper.readInteger();

        Customer foundCustomer = null;

        for (Customer c : customers) {
            if (c.getCustomerID() == customerId) {
                foundCustomer = c;
                break;
            }
        }

        if (foundCustomer == null) {
            System.out.println("Customer not found!");
            return;
        }

        System.out.print("Enter Account Number : ");
        int accountNumber = inputHelper.readInteger();

        Account account = database.getAccount(accountNumber);

        if (account != null) {
            System.out.println("Account Already Exists!");
            return;
        }

        System.out.print("Enter Initial Balance : ");
        double balance = inputHelper.readDouble();
        if(balance<0){
            System.out.println("Invalid Balance!!");
            return;
        }
        Account newAccount = new Account(accountNumber, balance, foundCustomer);

        database.addAccount(newAccount);

        System.out.println("Account Created Successfully!");
    }

    public void depositMoney() {

        System.out.print("Enter Account Number : ");
        int accountNumber = inputHelper.readInteger();

        System.out.print("Enter Amount to Deposit : ");
        double amount = inputHelper.readDouble();

        Account account = database.getAccount(accountNumber);

        if (account == null) {
            System.out.println("Account does not exist!");
        } else {
            account.deposit(amount);
        }
    }

    public void withdrawMoney() {

        System.out.print("Enter Account Number : ");
        int accountNumber = inputHelper.readInteger();

        System.out.print("Enter Amount to Withdraw : ");
        double amount = inputHelper.readDouble();

        Account account = database.getAccount(accountNumber);

        if (account == null) {
            System.out.println("Account Not Found!");
        } else {
            account.withdraw(amount);
        }
    }

    public void showAccountDetails() {

        System.out.print("Enter Account Number : ");
        int accountNumber = inputHelper.readInteger();

        Account account = database.getAccount(accountNumber);

        if (account == null) {
            System.out.println("Account Not Found!");
        } else {

            System.out.println("********* ACCOUNT DETAILS **********");

            System.out.println("Customer Name : " + account.getCustomer().getName());

            System.out.println("Account Number : " + accountNumber);

            System.out.println("Balance : ₹" + account.getBalance());
        }
    }

    public void showCustomerDetails() {
        System.out.print("Enter Customer ID : ");
        int customerId = inputHelper.readInteger();

        boolean found = false;
        for (Customer c : customers) {
            if (c.getCustomerID() == customerId) {
                c.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer Not Found!");
        }
    }
}