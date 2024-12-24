package src.tg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
public class NewTest3 {
public static	 WebDriver dr;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	 dr =  new ChromeDriver();
	  String url ="https://www.saucedemo.com/v1/";
	  dr.get(url);
	  System.out.println("Open");
	  }

  @Test(priority=1)
  public void afterTest() {
	 // throw new SkipException("Error");
	  dr.findElement(By.id("user-name")).sendKeys("problem_user");
	  
  }
  
 // @Test(priority=2, enabled=false)
  @Test(priority=2)
  public void Password() {
	  dr.findElement(By.id("password")).sendKeys("secret_sauce");
	  
  }
  
  @Test(priority=3)
  public void Login() {
	 // throw new SkipException("Error");
	  dr.findElement(By.id("login-button")).click();
	  
  }
}
