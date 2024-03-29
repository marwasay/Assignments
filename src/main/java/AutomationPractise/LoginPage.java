package AutomationPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //elements
    By loginAndSignUpButton = By.xpath("//a[@href=\"/login]");
    By emailField = By.xpath("//input[@data-qa=\"login-email\"]");
    By passwordField = By.xpath("//input[@data-qa=\"login-password\"]");
    By loginButton = By.className("btn btn-default");
    By error =By.xpath("//p[text()='Your email or password is incorrect!']");

    //actions
    public void action() {
        driver.findElement(loginAndSignUpButton).click();
        driver.findElement(emailField).sendKeys("marwasayedgohar@gmail.com");
        driver.findElement(passwordField).sendKeys("tuma12345");
        driver.findElement(loginButton).click();

    }
}
