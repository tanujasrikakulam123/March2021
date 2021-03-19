package addtocartpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddingToCart {
    static WebDriver driver;

    public AddingToCart(WebDriver driver) {
        AddingToCart.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#search > div.s-desktop-width-max.s-opposite-dir > div > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20.sg-col > div > div:nth-child(1) > div > div > div:nth-child(1) > h2 > a > span")
    protected WebElement cameraElement;

    @FindBy(how = How.XPATH,using = "//*[@id=\"add-to-cart-button\"]")
    protected   WebElement addingToCartElement;

    @FindBy(how = How.CSS, using = "#attach-sidesheet-view-cart-button > span > input")
    protected   WebElement cartElement;


    public  void addToCart() throws InterruptedException
    {
        cameraElement.click();
        addingToCartElement.click();
        cartElement.click();
    }
}