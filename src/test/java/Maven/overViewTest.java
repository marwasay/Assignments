package Maven;

import SwagLabs.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class overViewTest extends BaseTest{
    @Test
    public void thankYouValidation(){
        LoginPage loginPage=new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage=new ProductPage(driver);
        CheckOutPage checkOutPage=new CheckOutPage(driver);
        OverviewPage overviewPage=new OverviewPage(driver);
        ThankYouPage thankYouPage=new ThankYouPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        homePage.selectProduct();
        productPage.addToCart();
        productPage.moveToCCart();
        checkOutPage.moveToCheckOUtOverview("Marwa","Sayed","000K");
        overviewPage.moveTOThankYouPage();

        boolean isThankYouDisplayed = driver.findElement(thankYouPage.getCheckOutComplete()).isDisplayed();
        Assert.assertTrue(isThankYouDisplayed);
    }
}
