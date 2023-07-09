package testingDemoqa.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testingDemoqa.Base.BaseTest;
import testingDemoqa.Base.ExcelReader;
import testingDemoqa.Pages.*;

import java.io.IOException;

public class TestLoginPage extends BaseTest {
    public LoginPage loginPage;
    public ToolsQAPage toolsQAPage;
    public BookStoreAplicationPage bookStoreAplicationPage;
    public BookStorePage bookStorePage;
    public String validUsername;
    public String validPassword;
    public String invalidUsername;
    public String invalidPassword;
    public ExcelReader excelReader;
    public ProfilePage profilePage;


    @BeforeMethod
    public void pageSetup() throws IOException, InterruptedException {
        profilePage = new ProfilePage();
        loginPage = new LoginPage();
        toolsQAPage = new ToolsQAPage();
        bookStorePage = new BookStorePage();
        bookStoreAplicationPage = new BookStoreAplicationPage();
        excelReader = new ExcelReader("/Users/stefanmilikic/IdeaProjects/demoqaTest/src/test/java/testingDemoqa/Demoqa.xlsx");
        validUsername = excelReader.getStringData("Login", 1, 0);
        validPassword = excelReader.getStringData("Login", 1, 1);
        invalidUsername = excelReader.getStringData("Login", 1, 2);
        invalidPassword = excelReader.getStringData("Login", 1, 3);
        driver.manage().window().maximize();
        driver.get(toolsQAURL);
        toolsQAPage.clickOnBookStoreApplication();

    }

    @Test
    public void userCanLoginViaLogin() throws InterruptedException {
        bookStoreAplicationPage.clickOnLogin();
        waitForClickability(loginPage.loginButton);
        loginPage.loginButton.click();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(validUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(validPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.clickOnLoginButton();
        waitForClickability(bookStorePage.logoutButton);
        Assert.assertTrue(bookStorePage.logoutButton.isDisplayed());
        Assert.assertTrue(bookStorePage.headerText.isDisplayed());
    }

    @Test
    public void userCannotLoginWithInvalidUsernameViaLogin() throws InterruptedException {
        bookStoreAplicationPage.clickOnLogin();
        waitForClickability(loginPage.loginButton);
        loginPage.loginButton.click();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(invalidUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(validPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.clickOnLoginButton();
        waitForVisibility(loginPage.message);
        scrollIntoView(loginPage.message);
        Assert.assertTrue(loginPage.message.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @Test
    public void userCannotLoginWithInvalidPasswordViaLogin() throws InterruptedException {
        bookStoreAplicationPage.clickOnLogin();
        waitForClickability(loginPage.loginButton);
        loginPage.loginButton.click();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(validUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(invalidPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.clickOnLoginButton();
        waitForVisibility(loginPage.message);
        scrollIntoView(loginPage.message);
        Assert.assertTrue(loginPage.message.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @Test
    public void UserCannotLoginWithoutValidCredentialsViaLogin() throws InterruptedException {
        bookStoreAplicationPage.clickOnLogin();
        waitForClickability(loginPage.loginButton);
        loginPage.loginButton.click();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(invalidUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(invalidPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.clickOnLoginButton();
        waitForVisibility(loginPage.message);
        scrollIntoView(loginPage.message);
        Assert.assertTrue(loginPage.message.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @Test
    public void userCanLoginViaBookStore() throws InterruptedException {
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.loginButton);
        bookStorePage.clickOnLoginButton();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(validUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(validPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.loginButton.click();
        Assert.assertTrue(bookStorePage.headerText.isDisplayed());
        waitForVisibility(bookStorePage.logoutButton);
        Assert.assertTrue(bookStorePage.logoutButton.isDisplayed());
    }

    @Test
    public void UserCannotLoginWithoutValidCredentialsViaBookStore() throws InterruptedException {
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.loginButton);
        bookStorePage.clickOnLoginButton();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(invalidUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(invalidPassword);
        waitForClickability(loginPage.loginButton);
        loginPage.loginButton.click();
        waitForVisibility(loginPage.message);
        scrollIntoView(loginPage.message);
        Assert.assertTrue(loginPage.message.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @Test
    public void userCannotLoginWithInvalidPasswordViaBookStore() throws InterruptedException {
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.loginButton);
        bookStorePage.clickOnLoginButton();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(invalidUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(invalidPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.loginButton.click();
        waitForVisibility(loginPage.message);
        scrollIntoView(loginPage.message);
        Assert.assertTrue(loginPage.message.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @Test
    public void userCannotLoginWithInvalidUsernameViaBookStore() throws InterruptedException {
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.loginButton);
        bookStorePage.clickOnLoginButton();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(invalidUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(validPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.loginButton.click();
        waitForVisibility(loginPage.message);
        scrollIntoView(loginPage.message);
        Assert.assertTrue(loginPage.message.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @Test
    public void userCanLoginViaProfile() throws InterruptedException {
        bookStoreAplicationPage.clickOnProfile();
        profilePage.clickOnLoginButton();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(validUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(validPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.clickOnLoginButton();
        waitForClickability(bookStorePage.logoutButton);
        Assert.assertTrue(bookStorePage.logoutButton.isDisplayed());
        Assert.assertTrue(bookStorePage.headerText.isDisplayed());
    }
    @Test
    public void userCannotLoginWithInvalidUsernameViaProfile() throws InterruptedException {
        bookStoreAplicationPage.clickOnProfile();
        profilePage.clickOnLoginButton();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(invalidUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(validPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.clickOnLoginButton();
        waitForVisibility(loginPage.message);
        scrollIntoView(loginPage.message);
        Assert.assertTrue(loginPage.message.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
    @Test
    public void userCannotLoginWithInvalidPasswordViaProfile() throws InterruptedException {
        bookStoreAplicationPage.clickOnProfile();
        profilePage.clickOnLoginButton();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(validUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(invalidPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.clickOnLoginButton();
        waitForVisibility(loginPage.message);
        scrollIntoView(loginPage.message);
        Assert.assertTrue(loginPage.message.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
    @Test
    public void userCannotLoginWithoutValidCredentialsViaProfile() throws InterruptedException {
        bookStoreAplicationPage.clickOnProfile();
        profilePage.clickOnLoginButton();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(invalidUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(invalidPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.clickOnLoginButton();
        waitForVisibility(loginPage.message);
        scrollIntoView(loginPage.message);
        Assert.assertTrue(loginPage.message.isDisplayed());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @Test
    public void userCanLogout() throws InterruptedException {
        loginMethodViaBookStore();
        waitForClickability(bookStorePage.logoutButton);
        bookStorePage.clickOnLogout();
        Assert.assertTrue(loginPage.passwordField.isDisplayed());
        Assert.assertTrue(loginPage.usernameField.isDisplayed());
    }




}
