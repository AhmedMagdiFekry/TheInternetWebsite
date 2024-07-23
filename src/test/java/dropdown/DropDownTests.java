package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectedOption(){
       var dropDown= homePage.clickDropDown();
       String option="Option 1";
       dropDown.selectFromDropDown(option);
      var selectedOption= dropDown.getSelectedOptions();
     assertEquals(selectedOption.size(),1,"Incorrect number of selection");
     assertTrue(selectedOption.contains(option),"Incorrect Selection");
    }
}
