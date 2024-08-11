import findPages.Home;
import findPages.MyAccount;
import findPages.Registeration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPages.BaseTestCases;

public class MyAccountTestCases extends BaseTestCases {
    Home entertoRegisterObj;
    Registeration userRegisterationObj;
    MyAccount myAccountObj;

    @Test(priority = 1, alwaysRun = true)
    public void userCanRegister() {
        Home entertoRegisterObj = new Home(driver);
        entertoRegisterObj.enterToRegister();
        Registeration userRegisterationObj = new Registeration(driver);
        userRegisterationObj.userRegisteration("salma", "eslam", "salma1@gmail.com", "salma1234", "salma1234");
    }
    @Test(dependsOnMethods = {"userCanRegister"})
    public void userCanChangePassword(){
        myAccountObj = new MyAccount(driver);
        myAccountObj.userEnterToChangePassword();
        myAccountObj.userChangePassword("salma1234","123456/*","123456/*");
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='content']")).getText().contains("Password was changed"));

    }
}
