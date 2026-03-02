package alam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_login {
	public static void main (String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:Instagram.com/");
		driver.findElement(By.name("email")).sendKeys("sanauwar562");
		driver.findElement(By.name("pass")).sendKeys("Hayat@$786");
		// driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[4]/div/div/div/div[1]/div/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div")).click();
		driver.findElement(By.className("x1lliihq x1n2onr6 x5n08af")).click();
	}

}
