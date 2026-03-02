package hayat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first_test {
	@Test
	public void openGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com");
		String title = driver.getTitle();
		System.out.println("Title :"+title);
		driver.quit();
	}
}
