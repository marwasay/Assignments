package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;

    }
    //elements
    private By username = By.id("user-name");
    private By validPassword = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorButton = By.className("error-button");
    //private By wordProducts = By.className("product_label");

    //getter
    public By getErrorButton(){
        return errorButton;
    }

    //actions
    public void login(String userName, String password) {
        driver.findElement(username).sendKeys(userName);
        driver.findElement(validPassword).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
