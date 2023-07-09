package testingDemoqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingDemoqa.Base.BaseTest;

public class LoginPage extends BaseTest {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login")
    public WebElement loginButton;
    @FindBy(id = "userName")
    public WebElement usernameField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "newUser")
    public WebElement newUserButton;

    @FindBy(id = "name")
    public WebElement message;
    @FindBy(css = "#app > div > div > div.pattern-backgound.playgound-header")
    public WebElement headerLogin;


    public void clickOnUsernameField(){
        usernameField.clear();
    }
    public void clickOnPasswordField(){

        passwordField.clear();
    }
    public void clickOnLoginButton(){
        loginButton.click();
    }


}
