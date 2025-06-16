package com.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.utilities.Constants.URL;

public class Driver extends BasePage {

    public static void getDriver() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(URL);
            waitDriver = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void quitDriver() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit();
            driver = null;
        }
    }
}
