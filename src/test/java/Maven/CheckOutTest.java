package Maven;

import SwagLabs.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest{
    @Test
    public void continueButtonValidation() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CheckOutPage checkOutPage=new CheckOutPage(driver);


        loginPage.login("standard_user", "secret_sauce");
        homePage.selectProduct();
        productPage.addToCart();
        productPage.moveToCCart();
        boolean isContinueButtonDisplayed = driver.findElement(checkOutPage.getContinueButton()).isDisplayed();
        Assert.assertTrue(isContinueButtonDisplayed);
    }
    @Test
        public void checkOutOverviewValidation(){
            LoginPage loginPage=new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            ProductPage productPage=new ProductPage(driver);
            CheckOutPage checkOutPage=new CheckOutPage(driver);
            OverviewPage overviewPage=new OverviewPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        homePage.selectProduct();
        productPage.addToCart();
        productPage.moveToCCart();
        overviewPage.moveTOThankYouPage();
        checkOutPage.moveToCheckOUtOverview("Marwa","Sayed","000K");
        boolean isFinishButtonDisplayed = driver.findElement(overviewPage.getFinishButton()).isDisplayed();
        Assert.assertTrue(isFinishButtonDisplayed);

        }




        }


