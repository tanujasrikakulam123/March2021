package testsuite;

import addtocartpage.AddingToCart;
import org.testng.annotations.Test;
import searchpage.Search;
import utilities.Browser;

public class TestMethods extends Browser
{
    @Test
    public void TestPage() throws InterruptedException
    {
        Search search=new Search(driver);
        search.productSearch();
        AddingToCart cart=new AddingToCart(driver);
        cart.addToCart();
    }
}
