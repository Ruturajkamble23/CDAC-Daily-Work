package Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver dr = new ChromeDriver();
        dr.get("https://demo.automationtesting.in/Alerts.html");
        dr.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        Alert a= dr.switchTo().alert();
        Thread.sleep(2000);
        a.accept();
    }
}
