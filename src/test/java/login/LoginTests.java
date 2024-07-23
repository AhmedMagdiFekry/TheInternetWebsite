package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testsuccessfullogin(){
       LoginPage loginPage= homePage.clickformAuthantication();
       loginPage.setUsernameField("tomsmith");
       loginPage.setPasswordField("SuperSecretPassword!");
     SecureArea secureAreaPage= loginPage.clickLoginButton();
    assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!")
            ,"Alert Message is inCorrect");
    }
}
