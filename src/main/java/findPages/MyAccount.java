package findPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends Base{
    public MyAccount(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "My account")
    WebElement ChangePasswordButton;
    @FindBy(xpath = "//a[@href='/customer/changepassword']")
    WebElement Changetext;
    @FindBy(id = "OldPassword")
    WebElement OldPasswordText;
    @FindBy(id = "NewPassword")
    WebElement NewPasswordText;
    @FindBy(id = "ConfirmNewPassword")
    WebElement ConfirmPasswordText;
    @FindBy(xpath = "//button[@class='button-1 change-password-button']")
    WebElement enterChange;
    public void userEnterToChangePassword(){
        ChangePasswordButton.click();
    }
    public void userChangePassword(String Old,String New,String Confirm){
        Changetext.click();
        OldPasswordText.sendKeys(Old);
        NewPasswordText.sendKeys(New);
        ConfirmPasswordText.sendKeys(Confirm);
        enterChange.click();
    }
}
