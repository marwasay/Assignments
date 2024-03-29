package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage {
    WebDriver driver;
    public ThankYouPage(WebDriver driver){
        this.driver=driver;
    }
    //elements
    private By checkOutComplete =By.id("checkout_complete_container");

    public By getCheckOutComplete(){
        return checkOutComplete;
    }
}
