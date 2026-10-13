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
        bankAccount = new BankAccount("customerName", "phone", correctPin);
    }

    @Test
    public void testThat_MoneyCanBeDeposited() {
        bankAccount.deposit(10000.0);
        assertEquals(10000.0, bankAccount.checkBalance());
    }
    @Test
    public void testThat_YouCannotDepositNegativeValue(){
        assertThrows( IllegalArgumentException.class, () -> bankAccount.deposit(-1000.0) );
    }
    @Test
    public void testThat_YouCannotDepositEmptyValue(){
        assertThrows( IllegalArgumentException.class, () -> bankAccount.deposit(0.0) );
    }

    @Test
    public void testThat_MoneyCanBeWithdraw(){
        bankAccount.deposit(10000.0);
        bankAccount.withdraw(7000.0);
        double actual = bankAccount.checkBalance();
        assertEquals(3000.0, actual);
    }

    @Test
    public void testThat_AnyNegativeValueCannotBeWithdraw(){
        bankAccount.deposit(6000.0);
        assertThrows( IllegalArgumentException.class, () -> bankAccount.withdraw(-1000.0) );
    }

//    @Test
//    public void testForWrongPin() {
//        bankAccount.deposit(6000.0);
//        assertThrows( IllegalArgumentException.class, () -> bankAccount.withdraw(6000, wrongPin) );
//    }

    @Test
    public void testForBalance() {
        bankAccount.deposit(20000.0);
        double actual = bankAccount.checkBalance();
        assertEquals(20000.0, actual);
    }
}



