package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichTo {
    public static void main(String[] args) {

       WebDriver dr = new ChromeDriver();
       String pw = dr.getWindowHandle();
//       dr.get("https://www.facebook.com/");
//        dr.switchTo().newWindow(WindowType.TAB);
//        String ch =dr.getWindowHandle();
//        dr.get("https://www.gmail.com/");
//        dr.close();



    dr.get("https://www.facebook.com/");
    String second = dr.getWindowHandle();
    dr.switchTo().newWindow(WindowType.TAB);


    dr.get("https://www.instagram.com/");
    String th = dr.getWindowHandle();
    dr.switchTo().newWindow(WindowType.TAB);


    dr.get("https://www.google.com/");
    dr.switchTo().newWindow(WindowType.TAB);
    String four = dr.getWindowHandle();
    dr.get("https://www.gmail.com");

    dr.switchTo().window(second);
    dr.switchTo().window(th);
    dr.switchTo().window(four);
    dr.switchTo().window(second);
        dr.close();
        dr.quit();
    }
}
