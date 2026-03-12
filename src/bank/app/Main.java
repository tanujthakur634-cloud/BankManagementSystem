package bank.app;

import bank.service.BankService;
import bank.utility.InputHelper;
public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        InputHelper inputHelper = new InputHelper();
        outer:
        while (true){
            System.out.println("\n*********BANK_SYSTEM*********");
            System.out.print("0.Exit\t1.Create Customer\t2.Create Account\t3.Deposit\n4.Withdraw\t5.Show Account\t6.Show Customer Details\n->Enter Your Choice : ");
            int choice = inputHelper.readInteger();
            switch (choice){
                case 0->{
                    System.out.println("Exiting...");
                    break outer;
                }
                case 1 -> bankService.createCustomer();
                case 2 -> bankService.createAccount();
                case 3-> bankService.depositMoney();
                case 4-> bankService.withdrawMoney();
                case 5-> bankService.showAccountDetails();
                case 6->bankService.showCustomerDetails();
                default -> System.out.println("Enter Valid Choice!!");
            }
        }
    }
}
