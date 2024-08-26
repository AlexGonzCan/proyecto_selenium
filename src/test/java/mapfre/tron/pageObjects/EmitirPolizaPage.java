package mapfre.tron.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmitirPolizaPage {
    private WebDriver driver;
    //Boton del menu Emision
    @FindBy(id="x")
    WebElement emisionBtn;
    @FindBy(id = "X")
    WebElement emitirPolizaBtn;
    @FindBy(id = "X")
    WebElement table

    public EmitirPolizaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickEmitirPoliza() {
        emisionBtn.click();
        emitirPolizaBtn.click();

    }
    public void showTable(){

    }
}
