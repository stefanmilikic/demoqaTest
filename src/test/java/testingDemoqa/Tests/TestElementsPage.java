package testingDemoqa.Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testingDemoqa.Base.BaseTest;
import testingDemoqa.Base.ExcelReader;
import testingDemoqa.Pages.ElementsPage;
import testingDemoqa.Pages.ToolsQAPage;

import java.io.IOException;

public class TestElementsPage extends BaseTest {
    public ElementsPage elementsPage;
    public ToolsQAPage toolsQAPage;
    public String textBoxURL;
    public String textBoxText;
    public ExcelReader excelReader;
    public String fullName;
    public String email;
    public String currentAddress;
    public String permanentAddress;
    @FindBy(css = "#app > div > div > div.pattern-backgound.playgound-header > div")
    public WebElement textBoxHeader;

    @BeforeMethod
    public void pageSetup() throws InterruptedException, IOException {
        excelReader = new ExcelReader("/Users/stefanmilikic/IdeaProjects/demoqaTest/src/test/java/testingDemoqa/Demoqa.xlsx");
        elementsPage = new ElementsPage();
        toolsQAPage = new ToolsQAPage();
        textBoxURL = excelReader.getStringData("URL", 1, 1);
        textBoxText = excelReader.getStringData("Text", 1, 0);
        fullName = excelReader.getStringData("Text", 1, 1);
        email = excelReader.getStringData("Text", 1, 2);
        currentAddress = excelReader.getStringData("Text", 1, 3);
        permanentAddress = excelReader.getStringData("Text", 1, 4);
        driver.manage().window().maximize();
        driver.get(toolsQAURL);
    }

    @Test
    public void openTextBox() throws InterruptedException {
        toolsQAPage.clickOnElements();
        elementsPage.clickOnTextBox();
        Assert.assertTrue(driver.getCurrentUrl().equals(textBoxURL));
        Assert.assertTrue(elementsPage.fullNameField.isDisplayed());
    }

    @Test
    public void userCanFillInTextBox() throws InterruptedException {
        openTextBox();
        elementsPage.clickOnFullNameField();
        elementsPage.fullNameField.sendKeys(fullName);
        elementsPage.clickOnEmailField();
        elementsPage.emailField.sendKeys(email);
        scrollIntoView(elementsPage.currentAddressField);
        elementsPage.clickOnCurrentAddressField();
        elementsPage.currentAddressField.sendKeys(currentAddress);
        scrollIntoView(elementsPage.permanentAddressField);
        elementsPage.clickOnPermanentAddressField();
        elementsPage.permanentAddressField.sendKeys(permanentAddress);
        elementsPage.clickOnSubmitButton();
        Assert.assertTrue(elementsPage.newField.isDisplayed());
        Assert.assertEquals(elementsPage.newFieldName.getText(), "Name:" + fullName);
    }

    @Test
    public void userCanSubmitWithoutFullName() throws InterruptedException {
        openTextBox();
        elementsPage.clickOnEmailField();
        elementsPage.emailField.sendKeys(email);
        scrollIntoView(elementsPage.currentAddressField);
        elementsPage.clickOnCurrentAddressField();
        elementsPage.currentAddressField.sendKeys(currentAddress);
        scrollIntoView(elementsPage.permanentAddressField);
        elementsPage.clickOnPermanentAddressField();
        elementsPage.permanentAddressField.sendKeys(permanentAddress);
        elementsPage.clickOnSubmitButton();
        Assert.assertTrue(elementsPage.newField.isDisplayed());
        Assert.assertEquals(elementsPage.newEmailField.getText(), "Email:" + email);
    }
    @Test
    public void userCanSubmitWithoutEmail() throws InterruptedException {
        openTextBox();
        elementsPage.clickOnFullNameField();
        elementsPage.fullNameField.sendKeys(fullName);
        scrollIntoView(elementsPage.currentAddressField);
        elementsPage.clickOnCurrentAddressField();
        elementsPage.currentAddressField.sendKeys(currentAddress);
        scrollIntoView(elementsPage.permanentAddressField);
        elementsPage.clickOnPermanentAddressField();
        elementsPage.permanentAddressField.sendKeys(permanentAddress);
        elementsPage.clickOnSubmitButton();
        Assert.assertTrue(elementsPage.newField.isDisplayed());
        Assert.assertEquals(elementsPage.newFieldName.getText(), "Name:" + fullName);
    }
    @Test
    public void userCanSubmitWithoutPermanentAddres() throws InterruptedException {
        openTextBox();
        elementsPage.clickOnFullNameField();
        elementsPage.fullNameField.sendKeys(fullName);
        elementsPage.clickOnEmailField();
        elementsPage.emailField.sendKeys(email);
        scrollIntoView(elementsPage.currentAddressField);
        elementsPage.clickOnCurrentAddressField();
        elementsPage.currentAddressField.sendKeys(currentAddress);
        elementsPage.clickOnSubmitButton();
        Assert.assertTrue(elementsPage.newField.isDisplayed());
        Assert.assertEquals(elementsPage.newFieldName.getText(), "Name:" + fullName);
    }
    @Test
    public void userCannotSubmitWithoutOneThing() throws InterruptedException {
        openTextBox();
        elementsPage.clickOnSubmitButton();
        Assert.assertTrue(elementIsPresent(elementsPage.newField));
    }


}
