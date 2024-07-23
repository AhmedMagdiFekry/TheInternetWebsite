package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private WebElement boxField=driver.findElement(By.id("hot-spot"));
    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickBoxField(){
        Actions actions=new Actions(driver);
        actions.contextClick(boxField).perform();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_clickaccept(){
         driver.switchTo().alert().accept();
    }


}
