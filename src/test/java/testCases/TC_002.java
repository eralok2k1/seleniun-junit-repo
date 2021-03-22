package testCases;

import core.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_002 extends TestBase {

    @Test
    public void t_002_search_for_product(){
        driver.get(base_url);
        String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actual = driver.getTitle();
        Assert.assertEquals("Page Title validation", expected, actual);
        //wait and search for product
        WebDriverWait wait = new WebDriverWait(driver,20 );
        WebElement elementSearchBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#twotabsearchtextbox")));
        elementSearchBox.sendKeys("Laptop");
        driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
        WebDriverWait wait1  = new WebDriverWait(driver,20 );
        wait1.until(ExpectedConditions.titleIs("Amazon.in : Laptop"));
        Assert.assertEquals("Page Title Validation", driver.getTitle(),"Amazon.in : Laptop");
    }


}
