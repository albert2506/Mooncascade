import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClassTest {
    private WebDriver driver;
    private MainPage gymWolfMainPage;
    private RegistrationlPage registerGeneralPage;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/albert.martirosyan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.gymwolf.com/staging");
        gymWolfMainPage = new MainPage(driver);
    }
    @Test
    public void registration(){
        RegistrationlPage registerGeneralPage = gymWolfMainPage.startRegistration("test@test.te");
         registerGeneralPage = gymWolfMainPage.clickMainRegisterButton();
         String heading = registerGeneralPage.getHeadingText();
        Assert.assertEquals("General", heading);
    }
    @Test
    public RegistrationlPage finalRegistration(String name, String password, String confirmPassword, String myGym, String description, String url){
        registerGeneralPage = this.finalRegistration("test", "Qw123123", "Qw123123", "test", "test", "testurl");
        return null;
    }

    @After
    public void shutDown(){
        driver.quit();

    }
}
