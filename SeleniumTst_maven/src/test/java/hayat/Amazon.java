package hayat;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.in");
    }

    @Test
    public void amazonPurchaseFlow() throws InterruptedException {
        
        driver.findElement(By.id("nav-link-accountList")).click();
        
        WebElement phoneField = driver.findElement(By.id("ap_email"));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='6209309893';", phoneField); 
        
        driver.findElement(By.id("continue")).click();
        
       
        driver.findElement(By.id("ap_password")).sendKeys("");
        driver.findElement(By.id("signInSubmit")).click();

        
        WebElement categoryDropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoryDropdown);
        select.selectByVisibleText("Electronics");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

     
        driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium')])[1]")).click();
        
       
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }
       
        driver.findElement(By.id("add-to-cart-button")).click();

     
        driver.findElement(By.name("proceedToRetailCheckout")).click();


        Actions action = new Actions(driver);
        WebElement accountMenu = driver.findElement(By.id("nav-link-accountList"));
        action.moveToElement(accountMenu).perform(); 
        driver.findElement(By.id("nav-item-signout")).click();
    }

    @AfterClass
    public void tearDown() {
       
        driver.quit(); 
    }
}
