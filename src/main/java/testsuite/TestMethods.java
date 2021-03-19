package testsuite;

import addtocartpage.AddingToCart;
import org.testng.annotations.Test;
import searchpage.Search;
import utilities.Browser;
import windowhandilingspage.WindowHandilings;

public class TestMethods extends Browser {
    @Test
    public void TestPage() throws InterruptedException
    {
        Search search=new Search(driver);
        search.productSearch();
        AddingToCart cart=new AddingToCart(driver);
        cart.addToCart();
        WindowHandilings window=new WindowHandilings(driver);
        window.windowHandilings();
    }
}
