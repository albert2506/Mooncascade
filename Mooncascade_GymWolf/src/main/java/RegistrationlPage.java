import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationlPage {
    WebDriver driver;

    public RegistrationlPage(WebDriver driver){
        this.driver = driver;
    }
   By yourName = By.xpath("/html/body/div[2]/div[2]/div[1]/form/div/div/div[1]/div[2]/div[2]/div/input");
    By genderMale = By.xpath("/html/body/div[2]/div[2]/div[1]/form/div/div/div[1]/div[2]/div[3]/div/label[1]");
    By genderFemale = By.xpath("/html/body/div[2]/div[2]/div[1]/form/div/div/div[1]/div[2]/div[3]/div/label[2]");
    By password = By.xpath("/html/body/div[2]/div[2]/div[1]/form/div/div/div[1]/div[2]/div[5]/div/input");
    By confirmPass = By.xpath("/html/body/div[2]/div[2]/div[1]/form/div/div/div[1]/div[2]/div[6]/div/input");
    By myGym = By.xpath("/html/body/div[2]/div[2]/div[1]/form/div/div/div[1]/div[2]/div[9]/div/input[1]");
    By description = By.xpath("/html/body/div[2]/div[2]/div[1]/form/div/div/div[1]/div[2]/div[10]/div/textarea");
    By profileUrl = By.xpath("/html/body/div[2]/div[2]/div[1]/form/div/div/div[1]/div[2]/div[11]/div/div/input");
    By heading = By.xpath("/html/body/div[2]/div[2]/div[1]/form/div/div/div[1]/h3");
    By saveButton = By.xpath("/html/body/div[2]/div[3]/div[1]/form/div/div/div[1]/div[2]/div[12]/input");

    public RegistrationlPage typeName (String name){
        driver.findElement(yourName).sendKeys(name);
        return this;
    }
    public RegistrationlPage clickGender (){
        driver.findElement(genderFemale).click();
        return this;
    }
    public RegistrationlPage typePassword (String pass){
        driver.findElement(password).sendKeys(pass);
        return this;
    }
    public RegistrationlPage typeConfirmPassword (String pass){
        driver.findElement(confirmPass).sendKeys(pass);
        return this;
    }
    public RegistrationlPage typeMyGym (String text){
        driver.findElement(myGym).sendKeys(text);
        return this;
    }
    public RegistrationlPage typeDescription (String desctext){
        driver.findElement(description).sendKeys(desctext);
        return this;
    }
    public RegistrationlPage typeProfileUrl (String url){
        driver.findElement(profileUrl).sendKeys(url);
        return this;
    }
   /* public RegisterGeneralPage clickSave(){
        driver.findElement(saveButton).click();
        return this;
    }*/
    public RegistrationlPage finalRegistration(String name, String password, String confirmPassword, String myGym, String description, String url){
        this.typeName(name);
        this.typePassword(password);
        this.typeConfirmPassword(confirmPassword);
        this.typeMyGym(myGym);
        this.typeDescription(description);
        this.clickGender();
        driver.findElement(saveButton).click();
        return this;

    }
    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }
}
