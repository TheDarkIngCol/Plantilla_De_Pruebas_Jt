package utils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import java.util.HashMap;
import java.util.Map;

public class BasePage {

    private static WebDriverWait wait;
    public static WebDriver driver;
    private static String status = "PASSED";
    private static String reason = "SUCCESS TEST";


    @BeforeClass
    public static void setUpDriver(){
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        options.addArguments("start-maximized","--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void text(String locator){
        Find(locator).getText();
    }

    public void shadowClick(By root, By element) {
        WebElement preRoot = driver.findElement(root);
        SearchContext locator = preRoot.getShadowRoot();
        locator.findElement(element).click();
    }

    public void shadowSendKeys(By root, By element, String data) {
        WebElement preRoot = driver.findElement(root);
        SearchContext locator = preRoot.getShadowRoot();
        locator.findElement(element).clear();
        locator.findElement(element).sendKeys(data);
    }

    public void shadowClear(By root, By element) {
        WebElement preRoot = driver.findElement(root);
        SearchContext locator = preRoot.getShadowRoot();
        locator.findElement(element).clear();
    }

    public static String ShadowGetText(By root, By element) {
        WebElement preRoot = driver.findElement(root);
        SearchContext locator = preRoot.getShadowRoot();
        return locator.findElement(element).getText();
    }

    public static WebElement ShadowGetIcon(By root, By element) {
        WebElement preRoot = driver.findElement(root);
        SearchContext locator = preRoot.getShadowRoot();
        return locator.findElement(element);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void getText(By locator) {
        driver.findElement(locator).getText();
    }

    public void sendKeysTablet(By element, String data) {
        WebElement webElement = driver.findElement(element);
        Actions actions = new Actions(driver);
        actions.click(webElement).sendKeys(Keys.chord()).perform();
        webElement.sendKeys(data);
    }


    public void sendKeys(By element, String data) {
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(data);
    }

    public void sendKeysEnter(By element, String data, Keys enter) {
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(data);
    }


    public void checkIfButtonIsEnabled(By element) {
        WebElement button = driver.findElement(element);
        if (button.isEnabled()) {
            System.out.println("El botón está habilitado, puedes interactuar con él.");
        } else {
            System.out.println("El botón está deshabilitado, no puedes interactuar con él.");
        }
    }

    public void uploadFile(By element, String filePath) {
        WebElement fileInput = driver.findElement(element);
        fileInput.sendKeys(filePath);
        System.out.println("Archivo cargado exitosamente: " + filePath);
    }

    public void downloadFile(By element, String downloadPath) {
        // Configurar las preferencias del navegador para manejar la descarga
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("safebrowsing.enabled", true);

        // Configurar las opciones de Chrome con las preferencias
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
    }

    public void marketBrowser(WebDriver driver){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": " + "{\"status\": \"" + status + "\", \"reason\": \"" + reason + "\"}}");
    }
}
