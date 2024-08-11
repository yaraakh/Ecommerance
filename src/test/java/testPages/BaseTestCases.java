package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTestCases {
    public WebDriver driver;
    @BeforeSuite

    public void SetUpDriver() throws InterruptedException {


        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(8000);

    }

}
