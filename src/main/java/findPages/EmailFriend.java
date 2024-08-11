package findPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriend extends Base{
    public EmailFriend(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//button[@class='button-2 email-a-friend-button']")
    WebElement emailFriendBTN;
    @FindBy (id = "FriendEmail")
    WebElement friendEmailTxt;
    @FindBy (id = "PersonalMessage")
    WebElement personalmsgTxt;
    @FindBy (xpath = "//button[@class='button-1 send-email-a-friend-button']")
    WebElement sendEmailBTN;
    public void userEmailaFriend(String fet,String pmt){
        emailFriendBTN.click();
        friendEmailTxt.sendKeys(fet);
        personalmsgTxt.sendKeys(pmt);
        sendEmailBTN.click();


    }

}
