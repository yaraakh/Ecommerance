package testPages;

import findPages.ChangeCurrency;
import findPages.Home;
import org.testng.annotations.Test;

public class ChangeCurrencyTestCases extends BaseTestCases{
    Home currencyOBJ;
    ChangeCurrency changeOBJ;
    @Test
    public void userCanChangeCurrency(){
        currencyOBJ = new Home(driver);
        currencyOBJ.currency();
        changeOBJ = new ChangeCurrency(driver);
    }

}
