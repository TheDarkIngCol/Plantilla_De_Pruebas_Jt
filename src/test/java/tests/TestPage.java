package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PaginaPrueba;
import utils.BasePage;
import static utils.Constans.*;

public class TestPage extends BasePage {
    public TestPage(){
        super(driver);
    }

    PaginaPrueba page = new PaginaPrueba();

    @BeforeMethod
    public static void startTest(){
    }

    @Test()
    public void testE2E() throws Exception {
        driver.get(PAGEURL);
        page.formsPage();
    }

    @AfterMethod
    public static void finish(){
        driver.quit();
    }

}
