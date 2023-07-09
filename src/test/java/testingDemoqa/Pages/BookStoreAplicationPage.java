package testingDemoqa.Pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingDemoqa.Base.BaseTest;

import java.awt.print.Book;
import java.util.List;

public class BookStoreAplicationPage extends BaseTest {
    public BookStoreAplicationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(6) > span > div")
    public WebElement bookStoreAppButton;

    @FindBy(css = ".btn.btn-light ")
    public List<WebElement> bsaElements;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]/span")
    public WebElement bookStore;

    public void clickOnBookStore() throws InterruptedException {
        js.executeScript("window.scrollBy(0,350)", "");
        scrollIntoView(bookStore);
        Thread.sleep(2000);
        bookStore.click();
    }
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]")
    public WebElement login;
    public void clickOnLogin() throws InterruptedException {
        js.executeScript("window.scrollBy(0,350)", "");
        scrollIntoView(login);
        Thread.sleep(1000);
        login.click();
    }


    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]")
    public WebElement profile;
    public void clickOnProfile() throws InterruptedException {
        js.executeScript("window.scrollBy(0,350)", "");
        scrollIntoView(profile);
        Thread.sleep(2000);
        profile.click();
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[4]")
    public WebElement bookStoreAPI;
    public void clickOnBookStoreAPI() throws InterruptedException {
        js.executeScript("window.scrollBy(0,350)", "");
        scrollIntoView(bookStoreAPI);
        Thread.sleep(2000);
        bookStoreAPI.click();
    }
    @FindBy (css = "#swagger-ui > section > div.topbar > div > div > a")
    public WebElement swaggerLogo;
}
