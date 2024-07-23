package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void rightClickTest(){
        var contextPage=homePage.clickContextMenu();
        contextPage.clickBoxField();
        assertEquals(contextPage.alert_getText(),"You selected a context menu","Incorrect Message");
        contextPage.alert_clickaccept();
    }
}
