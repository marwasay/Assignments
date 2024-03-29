package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    WebDriver driver;
    public OverviewPage(WebDriver driver){
        this.driver=driver;

    }
    //elements
    private By finishButton =By.className("btn_action cart_button");
    public By getFinishButton(){
        return finishButton;
    }
    public void moveTOThankYouPage(){
        driver.findElement(finishButton).click();
    }
}
