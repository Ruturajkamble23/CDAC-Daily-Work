package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
    public static void main(String[] args) throws Exception {
        //web driver is an interface used in selenium
        WebDriver dr = new ChromeDriver(); // openning browser
        //now we want to open webpage
        dr.get("https://www.google.co.in/");
        Thread.sleep(4000);
        // will first open google and then gmail in same window
        dr.get("https://workspace.google.com/intl/en-US/gmail/");
        dr.navigate().back();
        Thread.sleep(5000);
        dr.close();
        WebDriver dr1 = new ChromeDriver();
        // will open new window
        dr1.get("https://workspace.google.com/intl/en-US/gmail/");

        dr1.manage().window().maximize();
    }
}
