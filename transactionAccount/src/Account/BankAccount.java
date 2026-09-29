package Account;

import java.math.BigDecimal;

public class BankAccount {
    private String pin;
    private BigDecimal balance;
    public BankAccount() {
        this.balance = BigDecimal.ZERO;
    }

    public BigDecimal deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException( "Invalid amount" );
        }
        balance = balance.add(amount);;
    return balance;
    }

    public BigDecimal getBalance() {
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

    public   BigDecimal checkBalance(String password) {
        if (!pin.equals(password)) {
            throw new IllegalArgumentException( "Incorrect PIN" );
        }
        return balance; }

    public  BigDecimal withdraw(BigDecimal amount, String password) {
        if (!pin.equals(password)) {
            throw new IllegalArgumentException( "Incorrect PIN" );
        }
        if (amount.compareTo(balance) > 0) {
            throw new IllegalArgumentException( "Insufficient Funds" );
        }
        balance = balance.subtract(amount);
return balance;
    }
}
