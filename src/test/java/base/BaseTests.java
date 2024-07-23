package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WindowManger;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
        homePage=new HomePage(driver);

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE== result.getStatus()){
            var camera=(TakesScreenshot)driver;
            File screenShot=camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot,new File("resources/screenshots/" + result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public WindowManger getWindowManger(){
        return new WindowManger(driver);
    }


}




//        driver.manage().window().maximize();
//        System.out.println(driver.getTitle());
//      //WebElement shiftLink=  driver.findElement(By.linkText("Shifting Content"));
//      //shiftLink.click();
//        driver.findElement(By.linkText("Shifting Content")).click();
//     WebElement example= driver.findElement(By.linkText("Example 1: Menu Element"));
//     example.click();
//     List<WebElement> menu=driver.findElements(By.tagName("li"));
//     System.out.println(menu.size());
     /*  List<WebElement> links= driver.findElements(By.tagName("a"));
       System.out.println(links.size());;
       WebElement inputLink= driver.findElement(By.linkText("Inputs"));
       inputLink.click();*/
//   driver.quit();