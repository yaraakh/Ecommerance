package testPages;

import findPages.EmailFriend;
import findPages.Home;
import findPages.Registeration;
import findPages.Search;
import org.testng.annotations.Test;

public class EmailFriendTestCases extends BaseTestCases{
   EmailFriend emailfriendOBJ;
    Home entertoRegisterObj;
    Registeration userRegisterationObj;
    Search searchObj ;
    @Test(priority = 1,alwaysRun = true)
    public void userCanRegister() {
        entertoRegisterObj = new Home(driver);
        entertoRegisterObj.enterToRegister();
        userRegisterationObj = new Registeration(driver);
        userRegisterationObj.userRegisteration("salma", "eslam", "salmaa45@gmail.com", "salma1234", "salma1234");
    }
        @Test(priority = 2)
        public void SearchAutoCom(){
            searchObj = new Search(driver);
            searchObj.searchAuto("mac");
        }

   @Test(priority = 3)
    public void userCanEmailFriend() throws InterruptedException {
       Thread.sleep(8000);

       emailfriendOBJ = new EmailFriend(driver);
        emailfriendOBJ.userEmailaFriend("friend123@gmail.com","This is nice");
        //assert



    }

}
