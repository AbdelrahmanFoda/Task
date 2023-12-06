package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationExercisSignUpPage {
   private WebDriver driver;
   //lactors
    private By loginbutton = By.linkText("Signup / Login");
    private By Name = By.name("name");
    private By Email= By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]");
    private By Signupbutton= By.xpath("//button[@data-qa=\"signup-button\"]");

    public AutomationExercisSignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void navigateHomePageUrl(String HomePageUrl){

        driver.navigate().to(HomePageUrl);
      //  navigateHomePageUrl("https://automationexercise.com/");
    }

    public void ClickonSignupLoginbutton(){

        driver.findElement(loginbutton).click();
    }

    public void  Enternameandemailaddress(String username , String EmailN) {
        driver.findElement(Name).click();
        driver.findElement(Name).sendKeys(username);
        driver.findElement(Email).sendKeys(EmailN);
    }
    public void ClickOnSignupButton() {
        driver.findElement(Signupbutton).click();
    }

}
