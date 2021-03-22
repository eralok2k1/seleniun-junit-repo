package testCases;

import core.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class TC_001 extends TestBase {




    @Test

    public void t_001_check_website_is_working(){
        driver.get(base_url);
        String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actual = driver.getTitle();
        Assert.assertEquals("Page Title validation", expected, actual);
    }


}
