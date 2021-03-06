package testCases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC_001 {
    WebDriver driver;
    String base_url = "https://traveltriangle.com";
    int implicit_wait_timeout_in_sec = 20;

    @Before
    public void set_up(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicit_wait_timeout_in_sec, TimeUnit.SECONDS);
    }

    @Test

    public void t_001_check_website_is_working(){
        driver.get(base_url);
        String expected = "Personalized Holiday Packages | Customized Tour Packages from multiple local and trusted travel agents";
        String actual = driver.getTitle();
        Assert.assertEquals("Page Title validation", expected, actual);
    }

    @After
    public void clean_up(){
        driver.quit();
    }
}
