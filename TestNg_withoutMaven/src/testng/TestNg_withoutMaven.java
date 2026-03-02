package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_withoutMaven {
	WebDriver driver;
	@Test
	public void openYoutube() {
		driver = new ChromeDriver();
		driver.get("https://www.Youtube.com");
		String title = driver.getTitle();
		System.out.println("title: "+title);
		
	}
	@Test
	public void searchVideo() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("kahani Meri");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("video-title")).click();
	}
}
