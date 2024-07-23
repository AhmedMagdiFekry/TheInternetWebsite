package horizontal;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalTests extends BaseTests {
    @Test
    public void sliderTest(){
       var horizontalPage= homePage.clickHorizotol();
       horizontalPage.moveSliderTo(4);
       assertEquals(horizontalPage.getRangeValue(),"4");
    }
}
