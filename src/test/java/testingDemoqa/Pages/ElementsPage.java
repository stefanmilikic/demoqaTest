package testingDemoqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingDemoqa.Base.BaseTest;

import java.util.List;

public class ElementsPage extends BaseTest {
    public ElementsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".btn.btn-light")
    public List<WebElement> elements;

    @FindBy(xpath = "//*[@id=\"userName\"]")
    public WebElement fullNameField;

    public void clickOnFullNameField() {
        fullNameField.clear();
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input")
    public WebElement emailField;

    public void clickOnEmailField(){
        emailField.clear();
    }
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/textarea")
    public WebElement currentAddressField;

    public void clickOnCurrentAddressField(){
        currentAddressField.clear();
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[4]/div[2]/textarea")
    public WebElement permanentAddressField;

    public void clickOnPermanentAddressField(){
        permanentAddressField.clear();
    }
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div")
    public WebElement newField;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button")
    public WebElement submitButton;
    public void clickOnSubmitButton(){
        submitButton.click();
    }
    @FindBy(css = ".border.col-md-12.col-sm-12")
    public WebElement newFieldName;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement newEmailField;
    @FindBy(xpath = "//*[@id=\"currentAddress\"]")
    public WebElement newCurrenAddresField;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[3]")
    public WebElement newPermanentAddressField;
    public void clickOnTextBox() throws InterruptedException {
        for (WebElement element : elements) {
            if (element.getText().equals("Text Box")) {
                scrollIntoView(element);
                element.click();
                break;
            }
        }
    }

    public void clickOnCheckBox() throws InterruptedException {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Check Box")) {
                scrollIntoView(elements.get(i));
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnRadioButton() throws InterruptedException {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Radio Button")) {
                scrollIntoView(elements.get(i));
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnWebTables() throws InterruptedException {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Web Tables")) {
                scrollIntoView(elements.get(i));
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnButtons() throws InterruptedException {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Buttons")) {
                scrollIntoView(elements.get(i));
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnLinks() throws InterruptedException {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Links")) {
                scrollIntoView(elements.get(i));
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnBrokenLinks() throws InterruptedException {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Broken Links - Images")) {
                scrollIntoView(elements.get(i));
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnUploadAndDownload() throws InterruptedException {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Upload and Download")) {
                scrollIntoView(elements.get(i));
                elements.get(i).click();
                break;
            }
        }
    }

    public void clickOnDynamicProperties() throws InterruptedException {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("Dynamic Properties")) {
                scrollIntoView(elements.get(i));
                elements.get(i).click();
                break;
            }
        }
    }

}
