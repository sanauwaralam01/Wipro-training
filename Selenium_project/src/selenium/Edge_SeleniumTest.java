package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.edge.driver","C:\\Users\\Md Sanauwar Alam\\Downloads\\edgedriver_win64\\msedgedriver.exe");)
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.Google.com");
		System.out.println("Title: "+ driver.getTitle());
		driver.quit();*/
		WebDriver driver = new EdgeDriver();
		try {
			driver.manage().window().maximize();
		    driver.get("https://www.YOUTUBE.com");
		    
		    String title =driver.getTitle();
		    System.out.println("Page Title: " + title);
		
		    if(title.contains("YouTube"))
		    {
		    	System.out.println("Test Pass");
		    }
		    else
		    {
		    	System.out.println("Test Fail");
		    	Thread.sleep(20000);
		    }
		} catch(Exception e)
		{
		System.out.println("Exception occured : " + e.getMessage());
		}
		/*finally{
		
			driver.quit();
		}*/
		
		driver.quit();
		}
		

}
