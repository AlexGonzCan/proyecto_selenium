package mapfre.tron.pageObjects;

import mapfre.Utils.WebDriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    //urlBase : https://tron-pre-ca.reef.mapfre.net/fuji/#/home
    String baseUrl = "https://www.google.es/"; //prueba

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void baseUrl(){
        driver = WebDriverConfig.createChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }



}
