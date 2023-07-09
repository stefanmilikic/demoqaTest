package testingDemoqa.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testingDemoqa.Base.BaseTest;
import testingDemoqa.Pages.ToolsQAPage;

public class TestToolsQAPage extends BaseTest {
    public ToolsQAPage toolsQAPage;
    @BeforeClass
    public void pageSetup(){
        toolsQAPage = new ToolsQAPage();
        driver.manage().window().maximize();
        driver.get(toolsQAURL);
    }
    @Test
    public void openJoin(){
        toolsQAPage.clickOnJoin();

    }
    @Test
    public void openElements() throws InterruptedException {
        toolsQAPage.clickOnElements();
    }
    @Test
    public void openForms(){
        toolsQAPage.clickOnForms();
    }
    @Test
    public void openAlertsFrameWindows(){
        toolsQAPage.clickAlertsFrameWindows();
    }
    @Test
    public void openWidgets(){
        toolsQAPage.clicOnkWidgets();
    }
    @Test
    public void openInteractions(){
        toolsQAPage.clickOnInteractions();
    }
    @Test
    public void openBookStoreApplication(){
        toolsQAPage.clickOnBookStoreApplication();
    }
}
