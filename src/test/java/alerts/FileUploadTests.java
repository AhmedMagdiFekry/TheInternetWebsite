package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage=homePage.clickFileUpload();
        uploadPage.uploadFile(
                "C:\\Users\\Ahmed Magdi\\IdeaProjects\\webdriver_java\\resources\\assignment.PNG");
        assertEquals(uploadPage.getUploadedFileText(),"assignment.PNG","the uploaded message is incorrect");
    }
}
