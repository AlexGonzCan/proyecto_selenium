package mapfre.tron.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FujiPage {


    @FindBy(linkText = "https://tron-pre-ca.reef.mapfre.net/fuji/")
    WebElement urlFuji;
    //@FindBy(id = "")
    //WebElement usernameField
    //@FindBy(id = "")
    //WebElement passwordField


    private WebDriver driver;
    public FujiPage() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.navigate().to(String.valueOf(this.urlFuji));
        Assert.assertTrue(urlFuji.getAttribute("href").contains("/fuji"));

    }




}
