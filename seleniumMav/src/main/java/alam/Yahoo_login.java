package alam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		//driver.findElement(By.id("login-container")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("username")).sendKeys("mdsanauwaralam");
		driver.findElement(By.name("signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("Sanauwar$001");
		driver.findElement(By.id("login-signin")).click();
		
	}

}
