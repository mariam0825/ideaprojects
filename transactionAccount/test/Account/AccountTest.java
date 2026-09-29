package Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private BankAccount bankAccount;
    private String correctPin = "2486";
    private String wrongPin = "9999";

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

    @Test
    public void testThat_MoneyCanBeDeposited() {
        bankAccount.setPin(correctPin);
        bankAccount.deposit(10000.0);
        assertEquals(10000.0, bankAccount.checkBalance(correctPin));
    }

    @Test
    public void testThat_YouCannotDepositNegativeValue(){
        bankAccount.setPin(correctPin);
        assertThrows( IllegalArgumentException.class, () -> bankAccount.deposit(-1000.0) );
        assertThrows( IllegalArgumentException.class, () -> bankAccount.deposit(0.0) );
        assertEquals( 0.0, bankAccount.checkBalance(correctPin) );
    }

    @Test
    public void testThat_MoneyCanBeWithdraw(){
        bankAccount.setPin(correctPin);
        bankAccount.deposit(10000.0);
        bankAccount.withdraw(7000.0, correctPin);
        double actual = bankAccount.checkBalance(correctPin);
        assertEquals(3000.0, actual);
    }

    @Test
    public void testThat_AnyNegativeValueCannotBeWithdraw(){
        bankAccount.setPin(correctPin);
        bankAccount.deposit(6000.0);

        assertThrows( IllegalArgumentException.class, () -> bankAccount.withdraw(-1000.0, correctPin) );
        assertEquals( 6000.0, bankAccount.checkBalance(correctPin) );
    }

    @Test
    public void testForWrongPin() {
        bankAccount.setPin(correctPin);
        bankAccount.deposit(6000.0);
        assertThrows( IllegalArgumentException.class, () -> bankAccount.checkBalance(wrongPin) );
    }

    @Test
    public void testPinMustBeFourDigits() {
        String lessThanFourDigits = "123";
        String moreThanFourDigits = "12345";
        String nonNumericPin = "abcd";

        assertThrows( IllegalArgumentException.class, () -> bankAccount.setPin(lessThanFourDigits) );
        assertThrows( IllegalArgumentException.class, () -> bankAccount.setPin(moreThanFourDigits) );
        assertThrows( IllegalArgumentException.class, () -> bankAccount.setPin(nonNumericPin) );
    }

    @Test
    public void testForBalance() {
        bankAccount.setPin(correctPin);
        bankAccount.deposit(20000.0);
        double actual = bankAccount.checkBalance(correctPin);
        assertEquals(20000.0, actual);
    }
}



