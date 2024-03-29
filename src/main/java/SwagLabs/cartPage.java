package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {

    private WebDriver driver;
    public cartPage(WebDriver driver){
        this.driver=driver;

    }
    //elements
    private By productName= By.xpath("//div[text()='Sauce Labs Backpack']");

    public By getProductName(){
        return productName;
    }

}
