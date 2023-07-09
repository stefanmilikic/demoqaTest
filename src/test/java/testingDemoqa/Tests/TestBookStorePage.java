package testingDemoqa.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testingDemoqa.Base.BaseTest;
import testingDemoqa.Base.ExcelReader;
import testingDemoqa.Pages.*;

public class TestBookStorePage extends BaseTest {
    public BookStorePage bookStorePage;
    public ToolsQAPage toolsQAPage;
    public BookStoreAplicationPage bookStoreAplicationPage;
    public LoginPage loginPage;
    public String validUsername;
    public String validPassword;
    public TestLoginPage testLoginPage;
    public JavascriptExecutor js;
    public ProfilePage profilePage;

    @BeforeMethod
    public <bookStorePage> void pageSetup() throws InterruptedException {
        testLoginPage = new TestLoginPage();
        bookStorePage = new BookStorePage();
        profilePage = new ProfilePage();
        toolsQAPage = new ToolsQAPage();
        js = (JavascriptExecutor) driver;
        bookStoreAplicationPage = new BookStoreAplicationPage();
        loginPage = new LoginPage();
        testLoginPage = new TestLoginPage();
        driver.manage().window().maximize();
        driver.get(toolsQAURL);
        toolsQAPage.clickOnBookStoreApplication();
        loginMethodViaLogin();
        Thread.sleep(2000);
        bookStoreAplicationPage.clickOnBookStore();
    }

    @Test
    public void book1canBeAdded() throws InterruptedException {
        waitForClickability(bookStorePage.firstBook);
        bookStorePage.clickOnFirstBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        bookStoreAplicationPage.clickOnProfile();
        waitForVisibility(profilePage.firstBook);
        scrollIntoView(profilePage.firstBook);
        Assert.assertTrue(profilePage.firstBook.isDisplayed());
        Assert.assertTrue(profilePage.deleteBook1.isDisplayed());
    }

    @Test
    public void book2canBeAdded() throws InterruptedException {
        waitForClickability(bookStorePage.secondBook);
        bookStorePage.clickOnSecondBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        bookStoreAplicationPage.clickOnProfile();
        waitForVisibility(profilePage.secondBook);
        scrollIntoView(profilePage.secondBook);
        Assert.assertTrue(profilePage.secondBook.isDisplayed());
    }

    @Test
    public void book3canBeAdded() throws InterruptedException {
        waitForClickability(bookStorePage.thirdBook);
        bookStorePage.clickOnThirdBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        waitForVisibility(profilePage.thirdBook);
        scrollIntoView(profilePage.thirdBook);
        Assert.assertTrue(profilePage.thirdBook.isDisplayed());
    }

    @Test
    public void book4canBeAdded() throws InterruptedException {
        waitForClickability(bookStorePage.fourthBook);
        bookStorePage.clickOnFourthBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        waitForVisibility(profilePage.fourthBook);
        scrollIntoView(profilePage.fourthBook);
        Assert.assertTrue(profilePage.fourthBook.isDisplayed());
    }

    @Test
    public void book5canBeAdded() throws InterruptedException {
        waitForClickability(bookStorePage.fifthBook);
        bookStorePage.clickOnFifthBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        waitForVisibility(profilePage.fifthBook);
        scrollIntoView(profilePage.fifthBook);
        Assert.assertTrue(profilePage.fifthBook.isDisplayed());
    }

    @Test
    public void book6canBeAdded() throws InterruptedException {
        waitForClickability(bookStorePage.sixthBook);
        bookStorePage.clickOnSixthBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        waitForVisibility(profilePage.sixthBook);
        scrollIntoView(profilePage.sixthBook);
        Assert.assertTrue(profilePage.sixthBook.isDisplayed());
    }

    @Test
    public void book7canBeAdded() throws InterruptedException {
        waitForClickability(bookStorePage.seventhBook);
        bookStorePage.clickOnSeventhBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        waitForVisibility(profilePage.seventhBook);
        scrollIntoView(profilePage.seventhBook);
        Assert.assertTrue(profilePage.seventhBook.isDisplayed());
    }

    @Test
    public void book8canBeAdded() throws InterruptedException {
        waitForClickability(bookStorePage.eighthBook);
        bookStorePage.clickOnEighthBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        waitForVisibility(profilePage.eighthBook);
        scrollIntoView(profilePage.eighthBook);
        Assert.assertTrue(profilePage.eighthBook.isDisplayed());
    }

    @Test
    public void addAllBooks() throws InterruptedException {
        addBook1();
        addBook2();
        addBook3();
        addBook4();
        addBook5();
        scrollIntoView(bookStorePage.sixthBook);
        addBook6();
        scrollIntoView(bookStorePage.seventhBook);
        addBook7();
        scrollIntoView(bookStorePage.eighthBook);
        addBook8();

    }
}
