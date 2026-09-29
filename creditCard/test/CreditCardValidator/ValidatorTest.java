package CreditCardValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {
    CardValidator cardValidator = new CardValidator();

    @Test
    public void testThat_YouHaveACreditCard() {

        String cardNumber = "4388576018410707";
        assertTrue(cardValidator.checkCard(cardNumber));
    }

    @Test
    public void testThat_CreditCardCanHave13DigitNumber() {
        String cardNumber = "4388576018402";
        assertTrue(cardValidator.checkCardLength(cardNumber));
    }
    @Test
    public void testThat_CreditCardCanHave16DigitNumber() {
        String cardNumber = "4388576018402";
        assertTrue(cardValidator.checkCardLength(cardNumber));
    }


}
