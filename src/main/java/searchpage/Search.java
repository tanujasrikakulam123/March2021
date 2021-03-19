package searchpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Search
{
    static WebDriver driver;
    public Search(WebDriver driver)
    {
        Search.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    protected WebElement searchElement;

    @FindBy(how = How.CSS, using = "#nav-search-submit-button")
    protected WebElement clicksElement;

    public void productSearch() throws InterruptedException
    {
        searchElement.sendKeys("canon eos 1500d");
        clicksElement.click();
    }
}
