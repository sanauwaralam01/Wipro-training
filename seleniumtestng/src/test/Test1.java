package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public  void googleTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Page title: "+driver.getTitle());
		driver.quit();
	}

}
