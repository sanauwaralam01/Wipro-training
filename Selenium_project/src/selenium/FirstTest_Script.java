package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Sanauwar Alam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.YOUTUBE.com");
		System.out.println("Title: "+ driver.getTitle());
		driver.quit();*/
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
		    driver.get("https://www.google.com");
		    
		    String title =driver.getTitle();
		    System.out.println("Page Title" + title);
		
		    if(title.contains("Google"))
		    {
		    	System.out.println("Test Pass");
		    }
		    else
		    {
		    	System.out.println("Test Fail");
		    }
		} catch(Exception e)
		{
		System.out.println("Exception occured : " + e.getMessage());
		}
		finally
		{
			driver.quit();
		}

	}

}
