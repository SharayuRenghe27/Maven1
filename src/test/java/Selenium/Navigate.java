package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("www.google.com");
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.navigate().back();

    }
}
