package Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private BankAccount bankAccount;
    private  String correctPin = "2486";
    private  String wrongPin = "9999";
    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

   @Test
        public void testThat_MoneyCanBeDeposited() {
       bankAccount.setPin(correctPin);
       bankAccount.deposit(new BigDecimal("10000"));
       assertEquals(new BigDecimal("10000"), bankAccount.checkBalance(correctPin));

   }
        @ Test

        public void testThat_YouCannotDepositNegativeValue(){
            bankAccount.setPin(correctPin);
            assertThrows( IllegalArgumentException.class, () -> bankAccount.deposit(new BigDecimal("-1000")) );
            assertThrows( IllegalArgumentException.class, () -> bankAccount.deposit(BigDecimal.ZERO) );
            assertEquals( BigDecimal.ZERO, bankAccount.checkBalance(correctPin) );;
        }
        @ Test
        public void testThat_MoneyCanBeWithdraw(){
            bankAccount.setPin(correctPin);
            bankAccount.deposit(new BigDecimal("10000"));
            bankAccount.withdraw(new BigDecimal("7000"), correctPin);
            double actual = bankAccount.checkBalance(correctPin);
            assertEquals(new BigDecimal("3000"), actual);
        }

        @ Test
        public void testForAnyNegativeValue(){
            bankAccount.setPin(correctPin);
            bankAccount.deposit(new BigDecimal("6000"));

            assertThrows( IllegalArgumentException.class, () -> bankAccount.withdraw(new BigDecimal("-1000"), correctPin) );
            assertEquals( new BigDecimal("6000"), bankAccount.checkBalance(correctPin) );

        }

        @Test
        public void testForWrongPin() {
            bankAccount.setPin(correctPin);
            bankAccount.deposit(new BigDecimal("6000"));
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
        bankAccount.deposit(new BigDecimal("20000"));
        double actual = bankAccount.checkBalance(correctPin);
        assertEquals(new BigDecimal("20000"), actual);
    }

}



