import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static org.openqa.selenium.By.className;

public class headless {
    WebDriver driver;

    @Test
    public void register1() {
        ChromeOptions opt = new ChromeOptions();
       opt.addArguments("--headless=new");
        driver = new ChromeDriver(opt);
        driver.get("https://www.google.ro");

        String expectedTitle = "Google";
        String currentTitle = driver.getTitle();
        Assert.assertEquals(currentTitle, expectedTitle);
    }

}





