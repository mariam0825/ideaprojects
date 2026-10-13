package Account;

import java.util.ArrayList;

public class Bank {

    private static ArrayList<BankAccount> accounts = new ArrayList<>();
    private int addAccountNumber = 1;

    private String generateAccountNumbers(String phone) {
        return phone.substring(1);
    }

    public void createAccount(String customerName, String phone, String pin) {
        String accountNumber = generateAccountNumbers(phone);

        BankAccount newAccount = new BankAccount( customerName, phone, pin);
        newAccount.setAccountNumber(accountNumber);
        accounts.add(newAccount);
    }

    public int getNumberOfCustomer() {
        return accounts.size();
    }

    public BankAccount findAccount(String accountNumber) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }

        throw new IllegalArgumentException("Account not found");
    }

    public double checkBalance(String accountNumber) {
        return findAccount(accountNumber).checkBalance();
    }

    public BankAccount findAccountWithPhone(String phone) {
        for (BankAccount account : accounts) {

            if (account.getPhone().equals(phone)) {
                return account;
            }
        }
        return null;
    }


    public void deposit(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        account.withdraw(amount);
    }

    public void transfer(String accountNumber, String accountNumberOne, double amount) {
        withdraw(accountNumber, amount);
        deposit(accountNumberOne, amount);
    }

    public boolean validate(String accountNumber, String pin){
       BankAccount account = findAccount(accountNumber);
       return !account.isCorrectPin(pin);
    }

    public void delete(){
        accounts.clear();
    }
}