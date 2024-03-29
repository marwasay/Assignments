package Maven;

import SwagLabs.HomePage;
import SwagLabs.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseTest {


    @Test
    public void validLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        HomePage homePage=new HomePage(driver);
        boolean isProductsDisplayed = driver.findElement(homePage.getWordProducts()).isDisplayed();
        Assert.assertTrue(isProductsDisplayed);
    }
        @Test
        public void invalidLogin (){
            LoginPage loginPage=new LoginPage(driver);
            loginPage.login("gkfjrd","secret_sauce");
            boolean isErrorDisplayed = driver.findElement(loginPage.getErrorButton()).isDisplayed();
            Assert.assertTrue(isErrorDisplayed);





        }

    }

