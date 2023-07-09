package testingDemoqa.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testingDemoqa.Base.BaseTest;
import testingDemoqa.Pages.BookStoreAplicationPage;
import testingDemoqa.Pages.LoginPage;
import testingDemoqa.Pages.ProfilePage;

public class TestProfilePage extends BaseTest {
    public ProfilePage profilePage;
    public LoginPage loginPage;
    public TestLoginPage testLoginPage;
    public BookStoreAplicationPage bookStoreAplicationPage;
    public JavascriptExecutor js;

    @BeforeMethod
    public void pageSetuo() throws InterruptedException {
        bookStoreAplicationPage = new BookStoreAplicationPage();
        loginPage = new LoginPage();
        js = (JavascriptExecutor) driver;
        testLoginPage = new TestLoginPage();
        profilePage = new ProfilePage();
        driver.manage().window().maximize();
        driver.get(toolsQAURL);
        toolsQAPage.clickOnBookStoreApplication();
        loginMethodViaProfile();
    }

    @Test
    public void bookOneCanBeDeleted() throws InterruptedException {
        addBook1();
        waitForVisibility(profilePage.deleteBook1);
        //Thread.sleep(2000);
        profilePage.deleteBook1.click();
        profilePage.clickOnOK();
        driver.navigate().refresh();
        Assert.assertFalse(elementIsPresent(profilePage.firstBook));
    }
    @Test
    public void bookTwoCanBeDeleted() throws InterruptedException {
        addBook2();
        waitForVisibility(profilePage.deleteBook2);
        profilePage.deleteBook2.click();
        profilePage.clickOnOK();
        driver.navigate().refresh();
        Assert.assertFalse(elementIsPresent(profilePage.secondBook));
    }
    @Test
    public void bookThreeCanBeDeleted() throws InterruptedException {
        addBook3();
        scrollIntoView(profilePage.thirdBook);
        Thread.sleep(2000);
       // waitForVisibility(profilePage.deleteBook3);
        profilePage.deleteBook3.click();
        profilePage.clickOnOK();
        driver.navigate().refresh();
        Assert.assertFalse(elementIsPresent(profilePage.thirdBook));
    }
    @Test
    public void bookFourCanBeDeleted() throws InterruptedException {
        addBook4();
        waitForVisibility(profilePage.deleteBook4);
        profilePage.deleteBook4.click();
        profilePage.clickOnOK();
        driver.navigate().refresh();
        Assert.assertFalse(elementIsPresent(profilePage.fourthBook));
    }
    @Test
    public void bookFiveCanBeDeleted() throws InterruptedException {
        addBook5();
        waitForVisibility(profilePage.deleteBook5);
        profilePage.deleteBook5.click();
        profilePage.clickOnOK();
        driver.navigate().refresh();
        Assert.assertFalse(elementIsPresent(profilePage.fifthBook));
    }
    @Test
    public void bookSixCanBeAdded() throws InterruptedException {
        addBook6();
        waitForVisibility(profilePage.deleteBook6);
        profilePage.deleteBook6.click();
        profilePage.clickOnOK();
        driver.navigate().refresh();
        Assert.assertFalse(elementIsPresent(profilePage.sixthBook));
    }
    @Test
    public void bookSevenCanBeDeleted() throws InterruptedException {
        addBook7();
        waitForVisibility(profilePage.deleteBook7);
        profilePage.deleteBook7.click();
        profilePage.clickOnOK();
        driver.navigate().refresh();
        Assert.assertFalse(elementIsPresent(profilePage.seventhBook));
    }
    @Test
    public void bookEightCanBeDeleted() throws InterruptedException {
        addBook8();
        waitForVisibility(profilePage.deleteBook8);
        profilePage.deleteBook8.click();
        profilePage.clickOnOK();
        driver.navigate().refresh();
        Assert.assertFalse(elementIsPresent(profilePage.eighthBook));
    }

    @Test
    public void deleteAllBooks() throws InterruptedException {
        addBook1();
        profilePage.deleteAllBooks.click();
    }
}
