package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void TestHoverUser1(){
       var hoversPage= homePage.clickHovers();
      var caption= hoversPage.hoverOverFigure(1);
      assertTrue(caption.isCaptionDisplayed(),"Caption Not Displayed");
      assertEquals(caption.getTitle(),"name: user1","Caption Title Is Incorrect");
      assertEquals(caption.getLinkText(),"View profile","Caption Link Text Is Not Correct");
      assertTrue(caption.getLink().endsWith("/users/1"),"Link Is Incorrect");
    }
    @Test
    public void TestHoverUser2(){
      var hoverPage=  homePage.clickHovers();
     var caption= hoverPage.hoverOverFigure(2);
     assertTrue(caption.isCaptionDisplayed(),"Caption Is Not Displayed");
     assertEquals(caption.getTitle(),"name: user2","Caption Title is Incorrect");
     assertEquals(caption.getLinkText(),"View profile","Caption Link Text Is Not Correct");
     assertTrue(caption.getLink().endsWith("/users/2"),"Link Is Incorrect");
    }
}
