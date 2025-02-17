package pages;

import org.openqa.selenium.By;
import utils.BasePage;
import java.time.Duration;

public class PaginaPrueba extends BasePage {
    public PaginaPrueba(){
        super(driver);
    }

    By macBook = By.xpath("//a[normalize-space()='MacBook']");
    By textMacBook = By.xpath("//p[contains(text(),'Intel Core 2 Duo processor')]");
    By price = By.xpath("(//p[@class='price'])[1]");

    public void formsPage() throws Exception {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String textMacDevice = driver.findElement(macBook).getText();
        String textMacInfo = driver.findElement(textMacBook).getText();
        String textPrice = driver.findElement(price).getText();
        if(textMacDevice.equals("MacBook")){
            System.out.println("El texto encontrado es: " + textMacDevice);
            System.out.println("El texto del " + textMacDevice + " es: " + textMacInfo);
            System.out.println("El precio del " + textMacDevice + " es: " + textPrice);
            Thread.sleep(2000);
        }
    }
}
