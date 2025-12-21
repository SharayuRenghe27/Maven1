package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("");
    driver.switchTo().frame(0);
    driver.switchTo().parentFrame();
    driver.switchTo().defaultContent();


    }
}
