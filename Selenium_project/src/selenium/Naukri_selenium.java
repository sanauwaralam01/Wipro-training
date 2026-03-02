package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Tausif Akmal");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("mdtausifakmal@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("tausif@001");
		Thread.sleep(1000);
		driver.findElement(By.id("mobile")).sendKeys("62039554885");
		Thread.sleep(1000);
		driver.findElement(By.className("main-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ico resman-icon resman-icon-check-box")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).sendKeys("C:\\Users\\Md Sanauwar Alam\\Downloads\\Md Sanauwar Alam.-1.pdf");
		Thread.sleep(1500);
		
		/*driver.findElement(By.className("google")).click();
		Thread.sleep(1500);
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("mdtausifakmal@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();*/
		

	}

}
