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


public class steps2 {
    WebDriver driver;



    @BeforeMethod
    public void openUrl() {
      //  driver = new ChromeDriver();
       // driver.manage().window().maximize();
       // driver.navigate().to("https://automationexercise.com/");
       // driver.get("https://automationexercise.com/");
        ChromeOptions options = new ChromeOptions();
       options.addArguments("--headless=new");
      driver = new ChromeDriver(options);
      driver.get("https://automationexercise.com/");
    }

    @Test
    public void register1() {

        driver.findElement(By.linkText("Signup / Login")).click();
        driver.findElement(By.name("name")).sendKeys("fooeduu");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("fujju22.@gmai.co", Keys.ENTER);
        String Account = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b")).getText();
        Assert.assertTrue(Account.contains("ENTER ACCOUNT INFORMATION"));
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("aa12555");
        Select drpCountry = new Select(driver.findElement(By.id("days")));
        drpCountry.selectByVisibleText("19");
        Select drpCo = new Select(driver.findElement(By.id("months")));
        drpCo.selectByVisibleText("March");
        Select drpCou = new Select(driver.findElement(By.id("years")));
        drpCou.selectByVisibleText("2020");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys("Abdelrahman");
        driver.findElement(By.id("last_name")).sendKeys("foda");
        driver.findElement(By.id("company")).sendKeys("giza");
        driver.findElement(By.name("address1")).sendKeys("cairo");
        driver.findElement(By.name("address2")).sendKeys("nasrcity");
        Select drpCoo = new Select(driver.findElement(By.id("country")));
        drpCoo.selectByVisibleText("United States");
        driver.findElement(By.id("state")).sendKeys("Abb");
        driver.findElement(By.id("city")).sendKeys("cairo");
        driver.findElement(By.id("zipcode")).sendKeys("20");
        driver.findElement(By.id("mobile_number")).sendKeys("01055646464");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
        String Suc = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
        Assert.assertTrue(Suc.contains("ACCOUNT CREATED!"));
        //String actualColor = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getCssValue("actualColor");
       // String expectedColor = "rgba(0, 128, 0, 1)";
       // soft.assertEquals(actualColor, expectedColor);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}




