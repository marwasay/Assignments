package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;
    public CheckOutPage(WebDriver driver){
        this.driver=driver;

    }
    //elements
    private By firstNameField = By.id("first-name");
    private By lastNameField =By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton =By.className("btn_primary cart_button");

    public By getContinueButton(){
        return continueButton;
    }


    public void moveToCheckOUtOverview(String firstName,String lastName , String postalCode){
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(continueButton).click();


    }
}
