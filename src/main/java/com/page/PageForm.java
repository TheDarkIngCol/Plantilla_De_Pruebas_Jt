package com.page;

import com.utilities.BasePage;
import org.openqa.selenium.By;

import static com.utilities.Constants.FIRST_NAME;

public class PageForm extends BasePage {

    public PageForm() {
        super();
    }

    private By inputFirstName = By.id("firstName");

    public void completeForms() {
        sendKeys(inputFirstName, FIRST_NAME);
    }
}