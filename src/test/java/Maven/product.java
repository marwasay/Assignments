package Maven;

import SwagLabs.HomePage;
import SwagLabs.LoginPage;
import SwagLabs.ProductPage;
import SwagLabs.cartPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class product extends BaseTest {
    String expectedPrice="$29.99";

    @Test
    public void productPriceTest(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage=new HomePage(driver);
        ProductPage productPage=new ProductPage(driver);


        loginPage.login("standard_user","secret_sauce");
        homePage.selectProduct();
        String actualValue = driver.findElement(productPage.getProductPrice()).getText();
        Assert.assertEquals(actualValue,expectedPrice);


    }@Test
    public void addProductToCart(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage=new HomePage(driver);
        ProductPage productPage=new ProductPage(driver);
        cartPage cartpage =new cartPage(driver);

        loginPage.login("standard_user","secret_sauce");
        homePage.selectProduct();
        productPage.addToCart();
        productPage.moveToCCart();
        boolean isProductNameDisplayed= driver.findElement(cartpage.getProductName()).isDisplayed();
        Assert.assertTrue(isProductNameDisplayed);


    }
}

