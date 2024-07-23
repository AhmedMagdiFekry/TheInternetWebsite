package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

private WebDriver driver;
public HomePage(WebDriver driver){
    this.driver=driver;
}
public LoginPage clickformAuthantication(){
    clickLink("Form Authentication");
    return new LoginPage(driver);
}
public DropDownPage clickDropDown(){
    clickLink("Dropdown");
    return new DropDownPage(driver);
}
public KeyPressesPage clickKeyPresses(){
    clickLink("Key Presses");
    return new KeyPressesPage(driver);
}
public HorizontalSliderPage clickHorizotol(){
    clickLink("Horizontal Slider");
    return new HorizontalSliderPage(driver);
}
public AlertPage clickJavascriptAlerts(){
    clickLink("JavaScript Alerts");
    return new AlertPage(driver);
}
public HoversPage clickHovers(){
    clickLink("Hovers");
    return new HoversPage(driver);
    }
public  FileUploadPage clickFileUpload(){
    clickLink("File Upload");
    return new FileUploadPage(driver);
}
public ContextMenuPage clickContextMenu(){
    clickLink("Context Menu");
    return new ContextMenuPage(driver);
}
public DynamicLoadingPage clickDynamicLoading(){
    clickLink("Dynamic Loading");
return new DynamicLoadingPage(driver);
}
public LargeAndDeepDomPage clickLargeAndDeep(){
    clickLink("Large & Deep DOM");
    return new LargeAndDeepDomPage(driver) ;
}
public MultipleWindowsPage clickMultipleWindows(){
    clickLink("Multiple Windows");
    return new MultipleWindowsPage(driver);
}

private void clickLink(String textLink){
    driver.findElement(By.linkText(textLink)).click();
}

}
