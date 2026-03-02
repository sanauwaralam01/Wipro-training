package alam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

// import io.github.bonigarcia.wdm.WebDriverManager;

public class First_maven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.YouTube.com");
		String title = driver.getTitle();
		System.out.println("title: "+ title);
		driver.findElement(By.name("search_query")).sendKeys("Wo bhi apne na huye ");
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		driver.findElement(By.xpath("//*[@id=\"inline-preview-player\"]/div[1]/video")).click();
		
		// FOR  EDGE BROWSER 
		/*WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.YouTube.com");
		System.out.println("Title: "+driver.getTitle());*/
		
	}

}
