package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By alertResult=By.id("result");
    private By triggerAlertButton= By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton =By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton=By.xpath(".//button[text()='Click for JS Prompt']");
    public AlertPage(WebDriver driver){
        this.driver=driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public String getResult(){
        return driver.findElement(alertResult).getText();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }


}
