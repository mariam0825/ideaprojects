package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @BeforeEach
    public void testinitialBalance(){
        double balances = 0;

    }

    @Test
    public void testdeposit5k_gives5k(){
        double balances = new balance();
        double amount = 5000;
        double actualResult = balance + amount;
        double expectedResult = AccountFunction.deposit();
        assertEquals = (expectedResult, actualResult);



    }

}
