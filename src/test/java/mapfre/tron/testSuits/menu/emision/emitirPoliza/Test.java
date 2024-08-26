package mapfre.tron.testSuits.menu.emision.emitirPoliza;

import mapfre.Utils.WebDriverConfig;
import mapfre.tron.pageObjects.HomePage;
import mapfre.tron.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class Test {

    WebDriver driver;
    @BeforeMethod
    public void beforeTest(){
        HomePage homePage = new HomePage(driver);
        homePage.baseUrl();
    }
    @org.testng.annotations.Test(description = "2025 - Póliza con Promotor, Ejecutivo y Gestor", priority = 0)
    public void Test1(){
        LoginPage   loginPage = new LoginPage(driver);
        loginPage.setCredentials();
        loginPage.clickLogin();
    }
}
