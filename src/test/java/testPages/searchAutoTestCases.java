package testPages;

import findPages.Search;
import org.testng.annotations.Test;

public class searchAutoTestCases extends BaseTestCases{
    Search searchObj ;
    @Test
    public void SearchAutoCom(){
        searchObj = new Search(driver);
        searchObj.searchAuto("mac");
    }

}
