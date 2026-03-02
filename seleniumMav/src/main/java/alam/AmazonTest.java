package alam;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	@Test
	public void amazonLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("title: "+ title);
		

	}

}
