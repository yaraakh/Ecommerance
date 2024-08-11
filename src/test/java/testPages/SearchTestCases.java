package testPages;

import findPages.Search;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTestCases extends BaseTestCases{
    Search searchObj ;
    @Test
    public void searchForItems(){
        searchObj = new Search(driver);
        searchObj.userCanSearch("Apple MacBook Pro 13-inch");
        Assert.assertTrue(searchObj.forassert.getText().contains("Apple MacBook Pro 13-inch"));


    }

}
