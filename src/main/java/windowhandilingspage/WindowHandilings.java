package windowhandilingspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandilings
{
    static WebDriver driver;
    public WindowHandilings(WebDriver driver)
    {
        WindowHandilings.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public  void windowHandilings() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Set<String> windowsIds=driver.getWindowHandles();
        Iterator<String> iter= windowsIds.iterator();
        String mainWindow=iter.next();
        String childWindow=iter.next();
        driver.switchTo().window(childWindow);
    }
}
