package testingDemoqa.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testingDemoqa.Base.BaseTest;
import testingDemoqa.Pages.BookStoreAplicationPage;
import testingDemoqa.Pages.LoginPage;
import testingDemoqa.Pages.ProfilePage;
import testingDemoqa.Pages.ToolsQAPage;

public class TestBookStoreApplicationPage extends BaseTest {
    public JavascriptExecutor js;
    public BookStoreAplicationPage bookStoreAplicationPage;
    public ToolsQAPage toolsQAPage;
    public LoginPage loginPage;
    public TestLoginPage testLoginPage;
    public String swaggerURL;
    public ProfilePage profilePage;


    @BeforeMethod
    public void pageSetup() {
        loginPage = new LoginPage();
        js = (JavascriptExecutor) driver;
        bookStoreAplicationPage = new BookStoreAplicationPage();
        toolsQAPage = new ToolsQAPage();
        testLoginPage = new TestLoginPage();
        profilePage = new ProfilePage();
        swaggerURL = excelReader.getStringData("URL", 1, 2);
        driver.manage().window().maximize();
        driver.get(toolsQAURL);
        toolsQAPage.clickOnBookStoreApplication();
    }

    @Test
    public void openLogin() throws InterruptedException {
        bookStoreAplicationPage.clickOnLogin();
        scrollIntoView(loginPage.loginButton);
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
        Assert.assertTrue(loginPage.headerLogin.isDisplayed());
    }

    @Test
    public void openBookStore() throws InterruptedException {
        bookStoreAplicationPage.clickOnBookStore();
        scrollIntoView(bookStorePage.firstBook);
        Assert.assertTrue(bookStorePage.firstBook.isDisplayed());
        Assert.assertTrue(bookStorePage.loginButton.isDisplayed());
    }

    @Test
    public void openBookStoreAPI() throws InterruptedException {
        bookStoreAplicationPage.clickOnBookStoreAPI();
        Assert.assertTrue(bookStoreAplicationPage.swaggerLogo.isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(), swaggerURL);

    }

    @Test
    public void openProfile() throws InterruptedException {
        bookStoreAplicationPage.clickOnProfile();
        Assert.assertTrue(profilePage.loginButton.isDisplayed());
        Assert.assertTrue(profilePage.registerButton.isDisplayed());
    }

}
