package Account;

public class ATM {
    Bank bank = new Bank();
    public void createAccount(String customerName, String phone, String pin){
        bank.createAccount(customerName, phone, pin);
    }
    public void deposit(String accountNumber, double amount){
        bank.deposit(accountNumber, amount);
    }
    public double getBalance(String accountNumber, String pin) {
        if(bank.validate(accountNumber, pin)) throw new IllegalArgumentException("Invalid pin");
        return bank.checkBalance(accountNumber);
    }

    public void withdraw(String accountNumber, double amount, String pin) {
        bank.withdraw(accountNumber, amount);
    }

    public void transfer(String senderAccount, String receiverAccount, double amount, String pin) {
        if(bank.validate(senderAccount, pin)) throw new IllegalArgumentException("Invalid pin");
        bank.withdraw(senderAccount, amount);
        bank.deposit(receiverAccount, amount);
    }
}
