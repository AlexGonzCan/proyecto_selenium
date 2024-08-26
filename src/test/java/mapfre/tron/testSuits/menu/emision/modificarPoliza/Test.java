package mapfre.tron.testSuits.menu.emision.modificarPoliza;

import mapfre.Utils.WebDriverConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class Test {
    WebDriver driver;
    @BeforeMethod
    public void beforeTest(){
        driver = WebDriverConfig.createChromeDriver();
        driver.get("X");
        driver.manage().window().maximize();
    }
    @org.testng.annotations.Test(description = "2025 - Póliza con Promotor, Ejecutivo y Gestor", priority = 0)
    public void Test1(){}


    @org.testng.annotations.Test(description = "2043 - Suplemento para modificar el tipo de gestor - voluntario a DB o TA", priority = 0)
    public void Test2(){}

}
