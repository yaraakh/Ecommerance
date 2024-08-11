package findPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Search extends Base{
    public Search(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//input[@class='search-box-text ui-autocomplete-input']")
    WebElement SearchTxt;
    @FindBy (xpath = "//button[@class='button-1 search-box-button']")
    WebElement SearchButton;
    @FindBy (linkText = "Apple MacBook Pro 13-inch")
    WebElement enterToElement;
    @FindBy (className = "current-item")
    public WebElement forassert;
    @FindBy (id = "ui-id-1")
    List<WebElement> DropDownList;
    public void userCanSearch(String i){
        SearchTxt.sendKeys(i);
        SearchButton.click();
        enterToElement.click();
    }
    public void searchAuto(String l)  {
        SearchTxt.sendKeys(l);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DropDownList.get(0).click();


    }

}
