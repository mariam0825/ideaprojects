package Account;
public class BankAccount {
    private String pin;
    private double balance;
    public BankAccount() {
        this.balance = 0.0;
    }
    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        balance += amount;
        return balance;
    }
    public double getBalance() {
        return balance;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        if (pin == null) {
            throw new IllegalArgumentException("PIN cannot be empty");
        }
        if (pin.length() != 4) {
            throw new IllegalArgumentException("PIN must be 4 digits");
        }
        for (int index = 0; index < pin.length(); index++) {
            if (!Character.isDigit(pin.charAt(index))) {
                throw new IllegalArgumentException("PIN must contain numbers only");
            }
        }
        this.pin = pin;
    }
    public double checkBalance(String password) {
        if (!pin.equals(password)) {
            throw new IllegalArgumentException("Incorrect PIN");
        }
        return balance;
    }
    public double withdraw(double amount, String password) {
        if (!pin.equals(password)) {
            throw new IllegalArgumentException("Incorrect PIN");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient Funds");
        }
        balance -= amount;
        return balance;
    }
}
