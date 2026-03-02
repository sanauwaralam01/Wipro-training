package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Md Sanauwar Alam\\Downloads\\Content page1.pdf");
		Thread.sleep(1500);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(1000);
		

	}

}
