package mapfre.tron.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath="//input[@placeholder='Username']")
    WebElement usernameValue;
    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement passwordValue;
    @FindBy(id="txt-username")
    WebElement usernameField;
    @FindBy(id="txt-password")
    WebElement passwordField;
    @FindBy(id="btn-login")
    WebElement loginBtn;


    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setCredentials() {
        String username = usernameValue.getAttribute("value");
        String password = passwordValue.getAttribute("value");

        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginBtn.click();
    }
}
