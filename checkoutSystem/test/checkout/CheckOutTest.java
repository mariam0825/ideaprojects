package checkout;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutTest {
    private Checkout checkout;
    @BeforeEach
    public void setUp() {
        checkout = new Checkout();
    }

    @Test
    public void testThat_ProductCanBeAdded(){
        String name = "soap";
        double price = 5000.00;
        int quantity = 1;
        checkout.addProduct(name , price, quantity);
        assertEquals(1, checkout.checkProductQuantity(name));

    }
    @Test
    public void testThat_ProductPriceCanBeAdded(){
        String name = "biscuit";
        double price = 2000.00;
        int quantity = 4;
        checkout.addProduct(name , price, quantity);
        assertEquals(price, checkout.checkProductPrice(name));

    }
    @Test
    public void testThat_productQuantityCanBeAdded(){
        String name = "biscuit";
        double price = 2000.00;
        int quantity = 4;
        checkout.addProduct(name , price, quantity);
        assertEquals(quantity, checkout.checkProductQuantity(name));
    }
    @Test
    public void testThat_MoreThanOneCanBeAdded(){
        String name = "biscuit";
        double price = 2000.00;
        int quantity = 4;
        checkout.addProduct(name , price, quantity);
        String nameOne = "Soap";
        double priceOne = 2000.00;
        int quantityOne = 4;
        checkout.addProduct(nameOne , priceOne, quantityOne);
        assertEquals( 2, checkout.checkForMoreProduct());

    }
    @Test
    public void testThat_TotalPriceOfProductCanBeAdded(){
        String name = "biscuit";
        double price = 2000.00;
        int quantity = 2;
        checkout.addProduct(name , price, quantity);
        String nameOne = "Soap";
        double priceOne = 2000.00;
        int quantityOne = 4;
        checkout.addProduct(nameOne , priceOne, quantityOne);
        assertEquals( 4_000.0, checkout.checkTotalPriceOfProduct(name));
    }
    @Test
    public void testThat_TotalPriceOfProductQuantityCanBeAdded(){
        String name = "biscuit";
        double price = 2000.00;
        int quantity = 2;
        checkout.addProduct(name , price, quantity);
        String nameOne = "Soap";
        double priceOne = 2000.00;
        int quantityOne = 4;
        checkout.addProduct(nameOne , priceOne, quantityOne);
        assertEquals( 12_000.0, checkout.checkTotalPriceOfProductQuantity());
    }
    @Test
    public void testThat_totalPriceCanBeGotten_afterDiscount(){
        String name = "Soap";
        double price = 9_000.00;
        int quantity = 5;
        checkout.addProduct(name, price, quantity);
        String nameOne = "Tissue";
        double priceOne = 5_000.00;
        int quantityOne = 10;
        checkout.addProduct(nameOne, priceOne, quantityOne);
        assertEquals(50_000, checkout.totalProductPrice(nameOne));
        double discountPercent = 10;
        assertEquals(85_500, 95_000 - checkout.applyDiscount(discountPercent));
    }

    @Test
    public void testThat_totalPriceCanBeGotten_afterVat(){
        String name = "Tissue";
        double price = 5_000.00;
        int quantity = 10;
        checkout.addProduct(name, price, quantity);
        String nameOne = "Soap";
        double priceOne = 9_000.00;
        int quantityOne = 5;
        checkout.addProduct(nameOne, priceOne, quantityOne);
        assertEquals(50_000, checkout.totalProductPrice(name));
        assertEquals(102_125, 95_000 + checkout.applyVat());
    }


}


