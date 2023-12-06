    import frameWork.PropertiesReader;
    import org.example.AutomationExercisSignUpPage;
    import org.example.AutomationExerciseInfoPage;
    import frameWork.DriverFactory;
    import frameWork.JsonFileManager;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.chrome.ChromeOptions;
    import org.openqa.selenium.edge.EdgeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.firefox.FirefoxOptions;
    import org.openqa.selenium.safari.SafariDriver;
    import org.testng.annotations.AfterMethod;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Test;
    import java.time.Duration;


    public class testngsteps {


        static WebDriver driver;
        private AutomationExercisSignUpPage AutomationExercisSignUpPage;
        private AutomationExerciseInfoPage AutomationExerciseInfoPage;
        frameWork.JsonFileManager testData;

        @BeforeMethod
        public void openUrl() {
            driver = DriverFactory.initDriver();
            AutomationExercisSignUpPage = new AutomationExercisSignUpPage(driver);
            AutomationExerciseInfoPage = new AutomationExerciseInfoPage(driver);
            AutomationExercisSignUpPage.navigateHomePageUrl("https://automationexercise.com/");
            testData = new JsonFileManager("src/test/resources/TestData.json");
        }
            @Test
            public void register1 () {
                AutomationExercisSignUpPage.ClickonSignupLoginbutton();
                AutomationExercisSignUpPage.Enternameandemailaddress("Abdddepaahmyyan", "foyyydohhpaAeda52@gmail.com");
                AutomationExercisSignUpPage.ClickOnSignupButton();
                AutomationExerciseInfoPage.assertOnValidationMsg("ENTER ACCOUNT INFORMATION");
                AutomationExerciseInfoPage.FillInformationDetails("55454454545",
                        "19", "March", "2020");
                AutomationExerciseInfoPage.SelectCheckboxSignup();
                AutomationExerciseInfoPage.SelectCheckboxReceivespecialoffers();
                AutomationExerciseInfoPage.FillUserDetails("Abdelrahman", "Foda",
                        "GizaSystems",
                        "Cairo", "Cairo",
                        "United States",
                        "www", "nasrcity", "818",
                        "0115584848");
                AutomationExerciseInfoPage.ClickCreateAccountbutton();
                AutomationExerciseInfoPage.AssertSuccessMsg("ACCOUNT CREATED!");

            }



        @AfterMethod
        public void afterMethod() {

            driver.quit();
        }

        @BeforeClass
        public void beforeClass() {
            JsonFileManager testData;
            frameWork.PropertiesReader.loadProperties();
            testData = new JsonFileManager("src/test/resources/TestData.json");
        }
    }


