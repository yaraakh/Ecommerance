package testPages;

import findPages.ContactUs;
import findPages.Home;
import org.testng.annotations.Test;

public class ContactUsTestCases extends BaseTestCases{
    Home scrollObj;
    ContactUs contactObj;
    @Test
    public void userCanContact(){
        scrollObj = new Home(driver);
        scrollObj.enterToContactUs();
        contactObj = new ContactUs(driver);
        contactObj.userContactUs("Salma","salma1@gmail.com","MacBook");
    }
}
