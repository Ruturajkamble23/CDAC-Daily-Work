package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElemet {
    public static void main(String[] args) throws Exception{
        WebDriver dr = new ChromeDriver();
        String link = "https://demo.automationtesting.in/Register.html";
        dr.get(link);

        WebElement we = dr.findElement(By.xpath("//input[@placeholder='First Name']"));
        we.sendKeys("Rutu");
        Thread.sleep(5);
        we.clear();

        System.out.println(dr.getTitle());
        String exptitle="Welcome";
        String acttitle= dr.getTitle();
    }
}
