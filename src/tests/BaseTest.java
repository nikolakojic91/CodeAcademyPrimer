package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {
    public WebDriver driver;
    public String validUsername = "standard_user";
    public String validPassword = "secret_sauce";

        public String invalidUsername = " ";
        public String invalidPassword = " ";


@Before

    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikola\\Downloads\\CodeAcademySelenium-main\\CodeAcademySelenium-main\\lib\\geckodriver.exe");
        
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true); // <-- headless set here
        driver = new FirefoxDriver();
        
       // driver = new FirefoxDriver();

       // driver.manage().window().maximize();
    }
@After
public void teardown() {
    driver.quit();
}
}