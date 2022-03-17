import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;


        MainPage gymWolfMainPage = PageFactory.initElements(driver, MainPage.class);
        //gymWolfMainPage.startRegistration("test@test.te");
       // gymWolfMainPage.clickMainRegisterButton();
    }

