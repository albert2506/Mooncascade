import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    private By registerButton = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[3]/ul/li[1]/a");
    private By signinButton = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[3]/ul/li[2]/a");
    private By emailInput = By.xpath("/html/body/div[1]/div[1]/div/div[3]/div[2]/form/div[1]/input");
    private By mainRegisterButton = By.xpath("/html/body/div[1]/div[1]/div/div[3]/div[2]/form/div[2]/button");

    public MainPage clickRegister(){
        driver.findElement(registerButton).click();
        return this;
    }
    public MainPage typeEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }
    public RegistrationlPage startRegistration(String email){
        this.typeEmail(email);
        return new RegistrationlPage(driver);
    }
    public RegistrationlPage clickMainRegisterButton(){
        driver.findElement(mainRegisterButton).click();
        return new RegistrationlPage(driver);
    }
}
