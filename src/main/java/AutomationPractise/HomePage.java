package AutomationPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    //elements
    By logoutButton = By.xpath("//a[@href=\"/logout\"]");
    By productLink = By.xpath("//a[@href=\"/product_details/1\"]");
    By addToCart =By.className("btn btn-default add-to-cart");

    public void actions(){
        driver.findElement(productLink).click();
        driver.findElement(addToCart).click();
    }
}
