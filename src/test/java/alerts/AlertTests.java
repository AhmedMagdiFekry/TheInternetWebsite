package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlertTests extends BaseTests {
    @Test
    public void alertTest(){
      var alertPage=  homePage.clickJavascriptAlerts();
      alertPage.triggerAlert();
      alertPage.alert_clickToAccept();
      assertEquals(alertPage.getResult(),
              "You successfully clicked an alert",
              "the Alerts messsage is incorrecr");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertPage=homePage.clickJavascriptAlerts();
        alertPage.triggerConfirm();
        String text=alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text,
                "I am a JS Confirm",
                "the message is incorrect");
    }
    @Test
    public void setInputInAlert(){
       var alertPage= homePage.clickJavascriptAlerts();
       alertPage.triggerPrompt();
       String text="Testing The button";
       alertPage.alert_setInput(text);
       alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You entered: "+text,"Result is Incorrect");
    }
}
