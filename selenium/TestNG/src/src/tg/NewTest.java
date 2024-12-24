package src.tg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("I am tester");
  }
  
  @Test
  public void f2() {
	  System.out.println("I am tester");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before run After");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After run Before ");
  }

  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Test after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" TEst Before class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test lass");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After  suit");
  }

}
