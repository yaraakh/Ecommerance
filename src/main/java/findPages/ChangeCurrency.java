package findPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeCurrency extends Base{
    public ChangeCurrency(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath ="//span[@class='price-value-4']")
    WebElement confirmEuro;



}
