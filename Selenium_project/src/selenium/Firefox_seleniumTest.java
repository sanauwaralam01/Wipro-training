package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_seleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			String title = driver.getTitle();
			System.out.println("Page Title: "+title);
			if(title.contains("Google")) {
				System.out.println("Test pass");
				Thread.sleep(10000);
			}else {
				System.out.println("Test fail");
			}
		}catch(Exception e) {
			System.out.println("Exception occured "+e.getMessage());
		}
		
		

	}

}
