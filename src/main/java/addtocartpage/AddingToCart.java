package addtocartpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import windowhandilingspage.WindowHandilings;

import java.util.concurrent.TimeUnit;

public class AddingToCart
{
    static WebDriver driver;
    public AddingToCart(WebDriver driver)
    {
        AddingToCart.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#search > div.s-desktop-width-max.s-opposite-dir > div > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20.sg-col > div > div:nth-child(1) > div > div > div:nth-child(1) > h2 > a > span")
    protected WebElement cameraElement;

    @FindBy(how = How.CSS,using = "#ddmDeliveryMessage > a:nth-child(3)")
    protected WebElement firstAvailabilityOfCamera;

    @FindBy(how = How.CSS,using = "#a-autoid-12-announce > div > div.twisterTextDiv.text > span")
    protected WebElement dimesionsOfCamera;

    @FindBy(how = How.ID,using = "add-to-cart-button")
    protected WebElement addingToCartElement;

    public  void addToCart() throws InterruptedException
    {
        cameraElement.click();
        WindowHandilings window=new WindowHandilings(driver);
        window.windowHandilings();
        firstAvailabilityOfCamera.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dimesionsOfCamera.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        addingToCartElement.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}