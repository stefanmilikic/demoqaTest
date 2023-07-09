package testingDemoqa.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import testingDemoqa.Pages.*;

import java.awt.print.Book;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public ExcelReader excelReader;
    public static WebDriver driver;
    public WebDriverWait wait;

    public String toolsQAURL;

    public JavascriptExecutor js = (JavascriptExecutor) driver;

    public ToolsQAPage toolsQAPage;
    public ElementsPage elementsPage;
    public LoginPage loginPage;
    public BookStoreAplicationPage bookStoreAplicationPage;
    public BookStorePage bookStorePage;
    public String validUsername;
    public String validPassword;
    public ProfilePage profilePage;

    @BeforeClass
    public void setup() throws IOException {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverManager.chromedriver().setup();
        excelReader = new ExcelReader("/Users/stefanmilikic/IdeaProjects/demoqaTest/src/test/java/testingDemoqa/Demoqa.xlsx");
        toolsQAURL = excelReader.getStringData("URL", 1, 0);
        toolsQAPage = new ToolsQAPage();
        loginPage = new LoginPage();
        bookStorePage = new BookStorePage();
        profilePage = new ProfilePage();
        bookStoreAplicationPage = new BookStoreAplicationPage();
        validUsername = excelReader.getStringData("Login", 1, 0);
        validPassword = excelReader.getStringData("Login", 1, 1);
    }

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitForURL(String URL) {
        wait.until(ExpectedConditions.urlToBe(URL));
    }

    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickability(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void openNewTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
    }
    public boolean elementIsPresent(WebElement element) {
        boolean nonExistingElement = false;
        try {
            nonExistingElement = element.isDisplayed();
        } catch (Exception ignored) {
        }
        return nonExistingElement;
    }

    @AfterClass
    public void tearDown() {
        driver.manage().deleteAllCookies();
        //  driver.quit();
    }

    public void openTexBox() throws InterruptedException {
        toolsQAPage.clickOnElements();
        elementsPage.clickOnTextBox();
    }

    public void loginMethodViaLogin() throws InterruptedException {
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
    }

    public void loginMethodViaProfile() throws InterruptedException {
        bookStoreAplicationPage.clickOnProfile();
        profilePage.clickOnLoginButton();
        loginPage.clickOnUsernameField();
        loginPage.usernameField.sendKeys(validUsername);
        loginPage.clickOnPasswordField();
        loginPage.passwordField.sendKeys(validPassword);
        waitForClickability(loginPage.loginButton);
        scrollIntoView(loginPage.loginButton);
        loginPage.clickOnLoginButton();
    }

    public void loginMethodViaBookStore() throws InterruptedException {
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
    }

    public void addBook1() throws InterruptedException {
        Thread.sleep(2000);
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.firstBook);
        bookStorePage.clickOnFirstBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        bookStoreAplicationPage.clickOnProfile();
    }

    public void addBook2() throws InterruptedException {
        Thread.sleep(2000);
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.secondBook);
        bookStorePage.clickOnSecondBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
        bookStoreAplicationPage.clickOnProfile();
    }
    public void addBook3() throws InterruptedException {
        Thread.sleep(2000);
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.thirdBook);
        bookStorePage.clickOnThirdBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
    }
    public void addBook4() throws InterruptedException {
        Thread.sleep(2000);
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.fourthBook);
        bookStorePage.clickOnFourthBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
    }
    public void addBook5() throws InterruptedException {
        Thread.sleep(2000);
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.fifthBook);
        bookStorePage.clickOnFifthBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
    }
    public void addBook6() throws InterruptedException {
        Thread.sleep(2000);
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.sixthBook);
        bookStorePage.clickOnSixthBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
    }
    public void addBook7() throws InterruptedException {
        Thread.sleep(2000);
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.seventhBook);
        bookStorePage.clickOnSeventhBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
    }
    public void addBook8() throws InterruptedException {
        Thread.sleep(2000);
        bookStoreAplicationPage.clickOnBookStore();
        waitForClickability(bookStorePage.eighthBook);
        bookStorePage.clickOnEighthBook();
        waitForClickability(bookStorePage.addToCollection);
        scrollIntoView(bookStorePage.addToCollection);
        bookStorePage.addToCollection.click();
        driver.navigate().refresh();
        bookStorePage.backToStoreButton.click();
    }
}
