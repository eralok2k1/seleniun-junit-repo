package core;

import core.webDriverFactory.WebDriverFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected final static String base_url = "https://amazon.in";


    @Before
    public void set_up(){
        try{
            driver= WebDriverFactory.getWebDriverForBrowser("chrome");
        } catch(Exception e){
            e.printStackTrace();
            Assert.fail("Incorrect Browser Sent. Check the Stack Trace");
        }


    }

    @After
    public void clean_up(){
        driver.quit();
    }
}
