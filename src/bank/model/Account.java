package bank.model;

import bank.utility.ValidationHelper;

public class Account {
    private final int accountNumber;
    private double balance;
    private final Customer customer;
    private final ValidationHelper validationHelper = new ValidationHelper();
    public Account(int accountNumber, double balance, Customer customer){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customer=customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void deposit(double deposit){
        if (validationHelper.validAmount(deposit)){//For +ve amount check
            balance+=deposit;
            System.out.println("₹"+deposit+" Deposited in Your Bank Account");
        }
        else
            System.out.println("⚠️⚠️⚠️Invalid Amount⚠️⚠️⚠️");
    }
    public void withdraw(double amount){
        if (!validationHelper.validAmount(amount) ||  amount>balance)
            System.out.println("⚠️⚠️⚠️Invalid Amount⚠️⚠️⚠️");
        else{
            balance-=amount;
            System.out.println("₹"+amount+" withdrawn successfully!!");
        }
    }
}
