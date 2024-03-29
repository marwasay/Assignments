package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver ;
    public ProductPage(WebDriver driver){
        this.driver=driver;

    }

    //elements
    private By productPrice =By.className("inventory_details_price");
    private By addToCartButton = By.className("btn_primary btn_inventory");
    private By cartIcon = By.id("shopping_cart_container");

    //getter
    public By getProductPrice(){
        return productPrice;
    }


    //actions
    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }

    public void moveToCCart(){
        driver.findElement(cartIcon).click();
}
}
