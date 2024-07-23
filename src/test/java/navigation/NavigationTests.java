package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManger().goBack();
        getWindowManger().goForword();
        getWindowManger().refreshPage();
        getWindowManger().goTo("https://google.com");
    }
    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManger().switchToTab("New Window");
    }

}
