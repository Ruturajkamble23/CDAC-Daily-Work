package tg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class NewTest {
	WebDriver dr = new ChromeDriver();
	
	
	  @Test
	  @org.testng.annotations.Parameters({"user_name","password"})
	  public void f(String user_name , String password) {
		  
		  dr.manage().window().maximize();
		  dr.findElement(By.id("username")).sendKeys(user_name);
		  dr.findElement(By.id("password")).sendKeys(password);
		  dr.findElement(By.id("submit")).click();
	  }
	  @BeforeTest
	  public void beforeTest() {
		  dr.get("https://practicetestautomation.com/practice-test-login/");
		  
	  }

	  @AfterTest
	  public void afterTest() throws Exception {
		  Thread.sleep(2000);
		  dr.close();
	  }
}
