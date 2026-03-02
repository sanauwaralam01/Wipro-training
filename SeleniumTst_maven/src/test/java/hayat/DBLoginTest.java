package hayat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DBLoginTest {
	 public static void main(String[] args) throws Exception {

	        String url = "jdbc:mysql://localhost:3306/testdb";
	        String dbUsername = "root";
	        String dbPassword = "root@001";  
	        Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM login_data");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        while (rs.next()) {

	            String username = rs.getString("username");
	            String password = rs.getString("password");

	            System.out.println("Testing: " + username + " / " + password);

	            driver.get("https://practicetestautomation.com/practice-test-login/");

	            driver.findElement(By.id("username")).clear();
	            driver.findElement(By.id("username")).sendKeys(username);

	            driver.findElement(By.id("password")).clear();
	            driver.findElement(By.id("password")).sendKeys(password);

	            driver.findElement(By.id("submit")).click();
	        }

	      
	        rs.close();
	        stmt.close();
	        con.close();
	        driver.quit();
	    }


}
