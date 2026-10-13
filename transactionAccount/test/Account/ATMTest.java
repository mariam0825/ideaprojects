package Account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ATMTest {

        ATM atm = new ATM();
        Bank bank = new Bank();
        String accountNumber = "phone".substring(1);

        @BeforeEach
        void setUp(){
            bank.createAccount("name", "phone", "1234");
            bank.deposit(accountNumber, 5_000);
        }
        @AfterEach
        void end(){
            bank.delete();
        }

//    @Test
//    public void testThat_I

    @Test
    public void testThat_iCanGetMyBalance(){
        assertEquals(5_000,atm.getBalance(accountNumber, "1234"));
    }

    @Test
    public void testThat_iCanWithdraw_2_000(){
        atm.withdraw(accountNumber, 2_000, "1234");
        assertEquals(3_000,atm.getBalance(accountNumber, "1234"));
    }

    @Test
    public void testThat_ICanTransfer_1k_andMyBalance_Is4k(){
        bank.createAccount("receiver", "receiverPhone", "1234");
        atm.transfer(accountNumber, "eceiverPhone", 1_000, "1234");
        assertEquals(4_000, atm.getBalance(accountNumber, "1234"));
    }

    @Test
    public void testThat_ITransfer3K_receiverGets3K(){
        bank.createAccount("receiver", "receiverPhone", "1234");
        atm.transfer(accountNumber, "eceiverPhone", 3_000, "1234");
        assertEquals(3_000, atm.getBalance("eceiverPhone", "1234"));
    }

    @Test
    public void testThat_NegativeAmount_CantBeTransferred(){
        bank.createAccount("receiver", "receiverPhone", "1234");
        assertThrows(IllegalArgumentException.class,()->
                atm.transfer(accountNumber, "eceiverPhone", -3_000, "1234"));
    }
}
