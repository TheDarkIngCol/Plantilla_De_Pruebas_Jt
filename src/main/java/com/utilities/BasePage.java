package com.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    protected static WebDriverWait waitDriver;

    public WebElement find(By locator){
        return waitDriver.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void sendKeys(By locator, String data) {
        WebElement element = find(locator);
        scroll(element);
        element.sendKeys(data);
    }

    public String getText(By locator) {
        WebElement element = find(locator);
        scroll(element);
        return element.getText();
    }

    public void scroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
    }
}
