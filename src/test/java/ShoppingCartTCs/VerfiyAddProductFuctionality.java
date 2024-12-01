package ShoppingCartTCs;

import Base.BaseTest;
import Pages.ProductsPage;
import Pages.checkoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class VerfiyAddProductFuctionality extends BaseTest {

    public void testProductAppearsInCartOnCheckoutPage() {
        LoginPage.Username().click();
        LoginPage.UsernameField("standard_user");
        LoginPage.Password().click();
        LoginPage.PasswordField("secret_sauce");
        ProductsPage productsPage = LoginPage.clickLogin();
        productsPage.addItemToCart(1);
        productsPage.addItemToCart(2);
        checkoutPage CheckoutPage = productsPage.clickcart();
        Assert.assertTrue(CheckoutPage.isProductInCart("Sauce Labs Backpack"), "The product does not appear in the cart on the checkout page.");

    }

}
