package testingDemoqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingDemoqa.Base.BaseTest;

public class ProfilePage extends BaseTest {
    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "submit")
    public WebElement logoutButton;
    @FindBy(id = "gotoStore")
    public WebElement goToStoreButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[3]/button")
    public WebElement deleteAllBooks;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/button")
    public WebElement deleteAccountButton;

    public void clickOnLogoutButton() {
        logoutButton.click();
    }

    public void clickOnDeleteAccountButton() {
        deleteAccountButton.click();
    }

    public void clickOnDeleteAllBookButton() {
        scrollIntoView(deleteAllBooks);
        deleteAllBooks.click();
    }

    @FindBy(id = "see-book-Git Pocket Guide")
    public WebElement firstBook;
    @FindBy(css = "#see-book-Learning\\ JavaScript\\ Design\\ Patterns > a")
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
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div/label/a[1]")
    public WebElement loginButton;

    public void clickOnLoginButton() {
        loginButton.click();
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[5]/div/span")
    public WebElement deleteBook1;
    public void deleteBook1(){
        scrollIntoView(deleteBook1);
        deleteBook1.click();
    }
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[5]/div/span")
    public WebElement deleteBook2;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[5]/div/span")
    public WebElement deleteBook3;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[5]/div/span")
    public WebElement deleteBook4;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[5]/div/span")
    public WebElement deleteBook5;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[6]/div/div[5]/div/span")
    public WebElement deleteBook6;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[7]/div/div[5]/div/span")
    public WebElement deleteBook7;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[7]/div/div[5]/div/span")
    public WebElement deleteBook8;
    @FindBy(id = "closeSmallModal-ok")
    public WebElement okButton;
    public void clickOnOK(){
        okButton.click();
    }
    @FindBy(id = "closeSmallModal-cancel")
    public WebElement cancelButton;
    public void clickOnCancelButton(){
        cancelButton.click();
    }
    @FindBy (css = "body > div.fade.modal.show > div > div > div.modal-header > button > span:nth-child(1)")
    public WebElement xButton;
    public void clickOnXButton(){
        xButton.click();
    }
    @FindBy(css = "#notLoggin-label > a:nth-child(2)")
    public WebElement registerButton;

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
