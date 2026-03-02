package alam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelegramAutoPost {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://web.telegram.org/");
        System.out.println("Scan QR Code and Login...");
        Thread.sleep(30000);  
        WebElement search = driver.findElement(By.className("is-empty']"));
        search.sendKeys("New Captions");   // your channel name
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'New Captions')]")).click();
        Thread.sleep(3000);
        WebElement msgBox = driver.findElement(By.xpath("//div[@contenteditable='true']"));
        String caption = "LIVE VIP SESSION STARTS NOW \n"
                + "✅ No gambling\n"
                + "✅ Only smart trading\n"
                + "📈 Join Fast";

        msgBox.sendKeys(caption);
        driver.findElement(By.xpath("//button[@aria-label='Send']")).click();

        System.out.println("Caption Posted Successfully ✅");
    }
	}
