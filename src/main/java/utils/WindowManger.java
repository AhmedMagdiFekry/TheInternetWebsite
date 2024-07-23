package utils;

import org.openqa.selenium.WebDriver;

public class WindowManger {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManger(WebDriver driver){
        this.driver=driver;
        navigate=driver.navigate();
    }
    public void goBack(){
        navigate.back();
    }
    public void goForword(){
        navigate.forward();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void goTo(String url){
        navigate.to(url);
    }
    public void switchToTab(String tabTitle){
       var windows= driver.getWindowHandles();
       System.out.println("Number Of Windows : "+ windows.size());
       System.out.println("Window Handles");
       windows.forEach(System.out::println);
       for (String window :windows){
           System.out.println("Switching To Window : "+ window);
           driver.switchTo().window(window);
           System.out.println("The Current Window : "+ driver.getTitle());
           if(tabTitle.equals(driver.getTitle())){
               break;
           }
       }

    }
}
