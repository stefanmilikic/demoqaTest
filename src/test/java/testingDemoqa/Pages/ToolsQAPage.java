package testingDemoqa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingDemoqa.Base.BaseTest;

import java.util.List;

public class ToolsQAPage extends BaseTest {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public ToolsQAPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".card.mt-4.top-card")
    public List<WebElement> cards;
    @FindBy(className = "banner-image")
    public WebElement join;

    public void clickOnJoin() {
        join.click();
    }

    public void clickOnElements() throws InterruptedException {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Elements")) {
                scrollIntoView(cards.get(i));
                cards.get(i).click();
                break;
            }
        }
    }

    public void clickOnForms() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Forms")) {
                scrollIntoView(cards.get(i));
                cards.get(i).click();
                break;
            }
        }
    }

    public void clickAlertsFrameWindows() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Alerts, Frame & Windows")) {
                scrollIntoView(cards.get(i));
                cards.get(i).click();
                break;
            }
        }
    }

    public void clicOnkWidgets() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Widgets")) {
                scrollIntoView(cards.get(i));
                cards.get(i).click();
                break;
            }
        }
    }

    public void clickOnInteractions() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Interactions")) {
                scrollIntoView(cards.get(i));
                cards.get(i).click();
                break;
            }
        }
    }

    public void clickOnBookStoreApplication() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Book Store Application")) {
                scrollIntoView(cards.get(i));
                cards.get(i).click();
                break;
            }
        }
    }


}
