package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPage_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");
			String title = driver.getTitle();
			System.out.println("title: "+ title);
			if(title.contains("Selenium")) {
				System.out.println("pass");
			}else {
				System.out.println("Fail");
				Thread.sleep(20000);
			}	
		}catch(Exception e) {
			System.out.println("Exception occured: "+e.getMessage());
		}

}
}
