package testPages;


import findPages.Home;
import findPages.Login;
import findPages.Registeration;
import org.testng.annotations.Test;

public class RegistrationTestCases extends BaseTestCases{
    Home entertoRegisterObj;
    Registeration userRegisterationObj;
    Login userLoginObj;
    @Test(priority = 1,alwaysRun = true)
    public void userCanRegister(){
         entertoRegisterObj = new Home(driver);
        entertoRegisterObj.enterToRegister();
         userRegisterationObj = new Registeration(driver);
        userRegisterationObj.userRegisteration("salma","eslam","salma2345@gmail.com","salma1234","salma1234");
        //Assert.assertTrue(driver.findElement(By.xpath("//div[@class='result']")).getText().contains("Your registration completed"));
        //Assert.assertTrue(entertoRegisterObj.SuccessMessage.getText().contains("Your registration completed"));
    }
    @Test(dependsOnMethods = {"userCanRegister"})
    public void userCanLogout(){
        userRegisterationObj.logOutSuccessfully();
    }
    @Test(dependsOnMethods = {"userCanLogout"})
    public void userCanLogin(){
        Home entertoRegisterObj = new Home(driver);
        entertoRegisterObj.enterToLogin();
         userLoginObj = new Login(driver);
        userLoginObj.logIn("salma2345@gmail.com","salma1234");

    }
}
