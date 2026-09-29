package CreditCardValidator;

public class CardValidator {

    public boolean checkCard(String cardNumber) {
        return true;
    }

    public boolean checkCardLength(String cardNumber) {
        if(cardNumber.length() == 13 || cardNumber.length() == 16){
            return true;
        }
        return false;
    }
}
