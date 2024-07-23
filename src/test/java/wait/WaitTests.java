package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
        var loadedPage=homePage.clickDynamicLoading().clickExample1();
        loadedPage.clickStart();
        assertEquals(loadedPage.getLoadedText(),"Hello World!","the message is incorrect");
    }
}
