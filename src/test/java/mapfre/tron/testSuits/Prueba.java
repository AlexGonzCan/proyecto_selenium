package mapfre.tron.testSuits;

import mapfre.Utils.WebDriverConfig;
import mapfre.tron.pageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Prueba {

    WebDriver driver;
    @BeforeMethod
    public void beforeTest(){
        //driver = WebDriverConfig.createChromeDriver();
        //driver.get("https://www.youtube.com/");
        //driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.baseUrl();
    }

    @Test(description = "prueba de acceso a google", priority = 0)
    public void testPageTitle(){


    }


}
