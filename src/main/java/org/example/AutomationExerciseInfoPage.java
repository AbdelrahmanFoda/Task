package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutomationExerciseInfoPage {
    private WebDriver driver;
    private By ValidationMessage= By.xpath("//b[contains(text(),'Enter Account Information')]");
    private By GenderType= By.id("id_gender1");
    private By password= By.id("password");
    private By days= By.id("days");
    private By months= By.id("months");
    private By years= By.id("years");
    private By newsletterCheckbox=By.id("newsletter");
    private By checkboxReceivespecialoffers=By.id("optin");
    private By FirstName= By.id("first_name");
    private  By LastName= By.id("last_name");
    private By CompanyName= By.id("company");
    private By Address1= By.name("address1");
    private By Address2= By.name("address2");
    private  By Country= By.name("country");
    private By State= By.id("state");
    private By City= By.id("city");
    private  By ZipCode= By.id("zipcode");
    private  By MobileNumber= By.id("mobile_number");
    private  By CreateAccountbutton= By.xpath("//button[@data-qa=\"create-account\"]");
    private  By Sucmsg= By.xpath("//b[contains(text(),'Account Created!')]");
    public AutomationExerciseInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertOnValidationMsg(String ValidationMsg) {
        String Account = driver.findElement(ValidationMessage).getText();
        Assert.assertTrue(Account.contains(ValidationMsg));

    }
    public void FillInformationDetails(String PleaseenteryourPassword, String Chooseyourbirthday , String Choosebirthmonth , String Choosebirthyear){
        driver.findElement(GenderType).click();
        driver.findElement(password).sendKeys(PleaseenteryourPassword);
        Select drpCountry = new Select(driver.findElement(days));
        drpCountry.selectByVisibleText(Chooseyourbirthday);
        Select drpCo = new Select(driver.findElement(months));
        drpCo.selectByVisibleText(Choosebirthmonth);
        Select drpCou = new Select(driver.findElement(years));
        drpCou.selectByVisibleText(Choosebirthyear);
    }

    public void SelectCheckboxSignup(){
        driver.findElement(newsletterCheckbox).click();

    }
    public void SelectCheckboxReceivespecialoffers(){
        driver.findElement(checkboxReceivespecialoffers).click();

    }

    public void FillUserDetails(String First_Name, String last_name , String Company ,String address1, String address2 , String country , String state, String city , String zipcode , String mobilenumber){

        driver.findElement(FirstName).sendKeys(First_Name);
        driver.findElement(LastName).sendKeys(last_name);
        driver.findElement(CompanyName).sendKeys(Company);
        driver.findElement(Address1).sendKeys(address1);
        driver.findElement(Address2).sendKeys(address2);
        Select drpCoo = new Select(driver.findElement(Country));
        drpCoo.selectByVisibleText(country);
        driver.findElement(State).sendKeys(state);
        driver.findElement(City).sendKeys(city);
        driver.findElement(ZipCode).sendKeys(zipcode);
        driver.findElement(MobileNumber).sendKeys(mobilenumber);


    }
    public void ClickCreateAccountbutton(){
        driver.findElement(CreateAccountbutton).click();

    }
    public void AssertSuccessMsg(String Msg) {

        String Suc = driver.findElement(Sucmsg).getText();
        Assert.assertTrue(Suc.contains(Msg));
    }
}
