package Account;

public class BankAccount {
    private String accountNumber;
    private String customerName;
    private String pin;
    private double balance;
    private String phone;

    public BankAccount( String customerName, String phone, String pin) {
        this.customerName = customerName;
        this.balance = 0.0;
        if(pin.length() != 4) throw new IllegalArgumentException("Invalid pin");
        this.pin = pin;
        this.phone = phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount!!!");
        }
        balance += amount;
    }

    public void setPin(String newPin) {
        if (!isValidPin(newPin)) {
            throw new IllegalArgumentException("Invalid Pin");
        }
        this.pin = newPin;
    }

    private boolean isValidPin(String userPin) {
        if (userPin == null || userPin.length() != 4) {
            return false;
        }
        for (int index = 0; index < userPin.length(); index++) {
            if (!Character.isDigit(userPin.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    public boolean isCorrectPin(String password) {
        return pin != null && pin.equals(password);
    }

    public double checkBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid amount");
        }
        balance -= amount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}