package alam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("title: "+title);
		Thread.sleep(2000);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email_login")).sendKeys("mdsanauwaralam02@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("password")).sendKeys("Sanauwar#001"); 
		driver.findElement(By.className("a-button-input")).click();
		/*driver.findElement(By.id("ap_customer_name")).sendKeys("Tausif Akmal");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Tausif@786");
		Thread.sleep(1000);
		driver.findElement(By.id("ap_password_check")).sendKeys("Tausif@786");
		Thread.sleep(1000);
		driver.findElement(By.className("a-button-input")).click();*/
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.name("submit.addToCart")).click();
		driver.findElement(By.className("a-button-text")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		WebElement checkbox = driver.findElement(By.id("rememberMe"));
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		 driver.findElement(By.className("a-icon a-icon-checkbox")).click();

	}

}
