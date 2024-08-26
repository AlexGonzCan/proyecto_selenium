package mapfre.tron.testSuits;

import mapfre.Utils.WebDriverConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PruebaPiloto {

   WebDriver driver;
   @BeforeMethod
    public void beforeTest(){
       driver = WebDriverConfig.createChromeDriver();
       driver.get("X");
       driver.manage().window().maximize();
   }

   @Test(description = "2025 - Póliza con Promotor, Ejecutivo y Gestor", priority = 0)
   public void Test(){}
}
