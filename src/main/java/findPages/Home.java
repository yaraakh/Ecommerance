package findPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Home extends Base{

        public Home(WebDriver driver) {
            super(driver);
            jse= (JavascriptExecutor) driver;
        }
    @FindBy (xpath = "//a[@href='/register?returnUrl=%2F']")
    WebElement registerHeader ;

        public void enterToRegister(){
        registerHeader.click();
    }
    @FindBy (linkText = "Log in")
    WebElement loginHeader;
    public void enterToLogin() {
        loginHeader.click();
    }
    public void enterToContactUs(){
        scrollToBottom();

        }
    @FindBy (id = "customerCurrency")
    WebElement dropDown;
    public void currency(){
        select = new Select(dropDown);
        select.selectByVisibleText("Euro");

    }

}

