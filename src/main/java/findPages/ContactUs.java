package findPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends Base{
    public ContactUs(WebDriver driver) {
        super(driver);
    }
    @FindBy (linkText = "Contact us")
    WebElement ContactLink;
    @FindBy (id = "FullName")
    WebElement nameTxt;
    @FindBy(id = "Email")
    WebElement emailTxt;
    @FindBy (id = "Enquiry")
    WebElement enquiryTxt;
    @FindBy (name = "send-email")
    WebElement submit;
    public void userContactUs(String nt,String et,String enqt){
        ContactLink.click();
        nameTxt.sendKeys(nt);
        emailTxt.sendKeys(et);
        enquiryTxt.sendKeys(enqt);
        submit.click();

    }
}
