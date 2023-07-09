package testingDemoqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingDemoqa.Base.BaseTest;

import java.util.List;

public class BookStorePage extends BaseTest {
    public BookStorePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login")
    public WebElement loginButton;
    @FindBy(id = "submit")
    public WebElement logoutButton;
    @FindBy(css = "#app > div > div > div.pattern-backgound.playgound-header")
    public WebElement headerText;

    @FindBy(css = ".text-right.fullButton")
    public WebElement addToCollection;

    @FindBy(css = ".text-left.fullButton")
    public WebElement backToStoreButton;

    @FindBy(id = "see-book-Git Pocket Guide")
    public WebElement firstBook;
    @FindBy(id = "see-book-Learning JavaScript Design Patterns")
    public WebElement secondBook;

    @FindBy(id = "see-book-Designing Evolvable Web APIs with ASP.NET")
    public WebElement thirdBook;

    @FindBy(id = "see-book-Speaking JavaScript")
    public WebElement fourthBook;
    @FindBy(id = "see-book-You Don't Know JS")
    public WebElement fifthBook;
    @FindBy(id = "see-book-Programming JavaScript Applications")
    public WebElement sixthBook;
    @FindBy(id = "see-book-Eloquent JavaScript, Second Edition")
    public WebElement seventhBook;
    @FindBy(id = "see-book-Understanding ECMAScript 6")
    public WebElement eighthBook;

    public void clickOnLogout(){
        logoutButton.click();
    }
    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void clickOnFirstBook() {
        scrollIntoView(firstBook);
        firstBook.click();
    }

    public void clickOnSecondBook() {
        scrollIntoView(secondBook);
        secondBook.click();
    }

    public void clickOnThirdBook() {
        scrollIntoView(thirdBook);
        thirdBook.click();
    }

    public void clickOnFourthBook() {
        scrollIntoView(fourthBook);
        fourthBook.click();
    }

    public void clickOnFifthBook() {
        scrollIntoView(fifthBook);
        fifthBook.click();
    }

    public void clickOnSixthBook() {
        scrollIntoView(sixthBook);
        sixthBook.click();
    }

    public void clickOnSeventhBook() {
        scrollIntoView(seventhBook);
        secondBook.click();
    }

    public void clickOnEighthBook() {
        scrollIntoView(eighthBook);
        eighthBook.click();
    }

}
