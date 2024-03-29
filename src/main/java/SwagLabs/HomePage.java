package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    String productName="Sauce Labs Bike Light";

    private WebDriver driver ;
    public HomePage (WebDriver driver){
        this.driver=driver;


    }

    //elements
    private By wordProducts = By.className("product_label");
    private By productLink =By.xpath("//div[text()=\""+productName+"\"]");
    //private By addToCartButton  =By.className("btn_primary btn_inventory");

    //getter
    public By getWordProducts(){
        return wordProducts;
    }

    public void selectProduct(){
        driver.findElement(productLink).click();
       // driver.findElement(addToCartButton).click();

    }



}
