package bank.database;

import bank.model.Account;

import java.util.HashMap;

public class BankDatabase {
    private HashMap<Integer, Account> accounts = new HashMap<>();

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accounts.getOrDefault(accountNumber, null);
    }

}
