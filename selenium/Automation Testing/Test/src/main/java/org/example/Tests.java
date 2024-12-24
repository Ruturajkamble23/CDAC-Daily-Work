package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
    public static WebDriver dr;
    @Test
    @org.testng.annotations.Parameters({"user_name","password"})
    public void f(String user_name , String password){
        dr.manage().window().maximize();
        dr.findElement(By.id("user-name")).sendKeys(user_name);
        dr.findElement(By.id("password")).sendKeys(password);
        dr.findElement(By.id("login-button")).click();

    }

    @BeforeTest
    public void beforeTest() {
        dr =  new ChromeDriver();
        String url ="https://www.saucedemo.com/v1/";
        dr.get(url);
        System.out.println("Testing Started...");
        System.out.println("All Test Completed .....");
    }

    @Test(priority = 1)
    public void AddChart() throws Exception{
        dr.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void Show() throws Exception{
        dr.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
        Thread.sleep(2500);
    }

    @Test(priority = 3)
    public void CheckOut(){
        dr.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
    }

    @Test(priority = 7)
    public void Tab() throws Exception{
        dr.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void Logout()throws Exception{
        dr.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
        Thread.sleep(1000);
        dr.quit();
    }
    @Test(priority = 4)
    public void Check(){
        dr.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
    }

    @Test(priority = 5)
    @org.testng.annotations.Parameters({"Fname","Lname","Zip"})
   public void Ds(String Fname ,String Lname,String Zip) throws Exception {
        dr.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(Fname);
        dr.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(Lname);
        dr.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(Zip);
        dr.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
    Thread.sleep(5000);
    }

    @Test(priority = 6)
    public void All() throws Exception{
        dr.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
        Thread.sleep(2000);
    }



}
