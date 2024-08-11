package findPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Base{
    public Login(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "Email")
    WebElement EmailforLogin;
    @FindBy (id = "Password")
    WebElement PasswordforLogin;
    @FindBy (id = "RememberMe")
    WebElement RememberMe;
    @FindBy (xpath = "//button[@class='button-1.login-button']")
    WebElement Login;
    public void logIn(String E,String P){
        EmailforLogin.sendKeys(E);
        PasswordforLogin.sendKeys(P);
        RememberMe.click();
        Login.click();
    }
}
