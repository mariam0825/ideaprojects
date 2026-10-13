package Account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {

    private Bank firstBank;
    private String customerName = "Mariam";
    private String correctPin = "1234";
    private String phone = "phone";

    @BeforeEach
    public void setUp() {
        firstBank = new Bank();
    }

    @AfterEach
    void end(){
        firstBank.delete();
    }

    @Test
    public void testThat_BankCanCreateAccount() {
        firstBank.createAccount(customerName, phone, correctPin);
        assertEquals(1, firstBank.getNumberOfCustomer());
    }

    @Test
    public void testThat_BankGeneratesAccountNumber_OnAccountCreation(){
        firstBank.createAccount(customerName, phone, correctPin);
        BankAccount account = firstBank.findAccountWithPhone(phone);
        assertEquals(phone.substring(1), account.getAccountNumber());
    }

    @Test
    public void testThat_BankCanCheck_accountBalance(){
        firstBank.createAccount(customerName, phone, correctPin);
        BankAccount account = firstBank.findAccountWithPhone(phone);
        String accountNumber = phone.substring(1);
        assertEquals(accountNumber, account.getAccountNumber());
        assertEquals(0, firstBank.checkBalance(accountNumber));
    }

    @Test
    public void testThat_BankCanDeposit(){
        firstBank.createAccount(customerName, phone, correctPin);
        BankAccount account = firstBank.findAccountWithPhone(phone);
        String accountNumber = phone.substring(1);
        assertEquals(accountNumber, account.getAccountNumber());
        assertEquals(0, firstBank.checkBalance(accountNumber));
        firstBank.deposit(accountNumber, 5_000);
        assertEquals(5_000, firstBank.checkBalance(accountNumber));
    }

    @Test
    public void testThat_BankCanWithdraw(){
        firstBank.createAccount(customerName, phone, correctPin);
        BankAccount account = firstBank.findAccountWithPhone(phone);
        String accountNumber = phone.substring(1);
        assertEquals(accountNumber, account.getAccountNumber());
        assertEquals(0, firstBank.checkBalance(accountNumber));
        firstBank.deposit(accountNumber, 5_000);
        assertEquals(5_000, firstBank.checkBalance(accountNumber));
        firstBank.withdraw(accountNumber,2_000 );
        assertEquals(3_000, firstBank.checkBalance(accountNumber));
    }

    @Test
    public void testThat_BankCanTransferBetweenAccounts(){
        firstBank.createAccount("customerOne", "phoneOne", "1234");
        BankAccount account = firstBank.findAccountWithPhone("phoneOne");
        String accountNumber = "phoneOne".substring(1);
        assertEquals(accountNumber, account.getAccountNumber());
        firstBank.deposit(accountNumber, 5_000);
        assertEquals(5_000, firstBank.checkBalance(accountNumber));
        firstBank.createAccount("customerTwo", "phoneTwo", "1235");
        BankAccount accountOne = firstBank.findAccountWithPhone("phoneTwo");
        String accountNumberOne = "phoneTwo".substring(1);
        assertEquals(accountNumberOne, accountOne.getAccountNumber());
        assertEquals(0, accountOne.checkBalance());
        firstBank.transfer(accountNumber, accountNumberOne, 3_000);
        assertEquals(3_000, accountOne.checkBalance());
        assertEquals(2_000, account.checkBalance());
    }



}