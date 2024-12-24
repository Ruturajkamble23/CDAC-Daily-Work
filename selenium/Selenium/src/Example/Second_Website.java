package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Second_Website {
    public static void main(String[] args) {
        WebDriver dr = new ChromeDriver();
        String link = "https://demo.automationtesting.in/Register.html";
        dr.get(link);
        // //input[@placeholder='Last Name']
        dr.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ruturaj");
        dr.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("K");
        dr.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("At Mumbai , Bandra West");
        dr.findElement(By.xpath("//input[@type='email']")).sendKeys("example@gmail.com");
        dr.findElement(By.xpath("//input[@type='tel']")).sendKeys("7845982447");
        dr.findElement(By.xpath("//input[@value='Male']")).click();
        dr.findElement(By.xpath("//input[@value='Cricket']")).click();
        dr.findElement(By.xpath("//input[@value='Movies']")).click();

        WebElement we = dr.findElement(By.xpath("//Select[@id='Skills']"));
        Select so = new Select(we);
        so.selectByIndex(5);
//        so.selectByVisibleText("");
//        so.selectByValue("");

        WebElement we1 = dr.findElement(By.xpath("//select[@placeholder='Year']"));
        Select so1 = new Select(we1);
        so1.selectByValue("1999");
        WebElement we2 = dr.findElement(By.xpath("//select[@placeholder='Month']"));
        Select so2 = new Select(we2);
        so2.selectByValue("August");
        WebElement we3 = dr.findElement(By.xpath("//select[@placeholder='Day']"));
        Select so3 = new Select(we3);
        so3.selectByValue("23");

        dr.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Ruturaj");
        dr.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Ruturaj");






        /*
        hanndel to Automate Drop down list will select class
         WebElement(it is interface we cant create object)
        use for three purpose 1 --> to handle drop down list
        2--> to perform multiple operation 3--> tp fetch data that enter into the text box
        number = select value


        How to Perform Multiple Operation =
        clik
        enter
        clear
        new enter
         */
    }
}
