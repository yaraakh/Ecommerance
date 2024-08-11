package findPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registeration extends Base {
    public Registeration(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gender-female")
    WebElement FeMale;
    @FindBy(id = "FirstName")
    WebElement Firstname;
    @FindBy(id = "LastName")
    WebElement Lastname;
    //BIRTH OF DATE
    @FindBy(id = "Email")
    WebElement Email;
    @FindBy(id = "Password")
    WebElement Password;
    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPassword;
    @FindBy(id = "register-button")
    WebElement Register;
   /* @FindBy(css = "div.result")
    public WebElement SuccessMessage;*/
   @FindBy (xpath = "//a[@href='/logout']")
   WebElement LogoutButton;
   @FindBy(xpath = "//a[@href='/customer/info']")
   WebElement MyAccountButton;

    public void userRegisteration(String f, String l, String e, String p, String c) {
        FeMale.click();
        Firstname.sendKeys(f);
        Lastname.sendKeys(l);
        Email.sendKeys(e);
        Password.sendKeys(p);
        ConfirmPassword.sendKeys(c);
        Register.click();
    }
    public void logOutSuccessfully(){
        LogoutButton.click();
    }
    public void goToMyAccount(){
        MyAccountButton.click();
    }
}
