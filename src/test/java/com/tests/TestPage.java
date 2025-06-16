package com.tests;

import com.page.PageForm;
import com.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage {

    PageForm pageForm = new PageForm();

    @BeforeMethod
    public void startTest() {
        Driver.getDriver();
    }

    @Test
    public void testE2E() {
        pageForm.completeForms();
    }

    @AfterMethod
    public void finish() throws InterruptedException {
        Driver.quitDriver();
    }
}
