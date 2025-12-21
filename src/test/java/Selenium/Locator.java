package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.findElement(By.id("a"));
        driver.findElement(By.tagName("href"));
        driver.findElement(By.className(""));
        driver.findElement(By.name(""));
        driver.findElement(By.linkText(""));
        driver.findElement(By.partialLinkText(""));
        driver.findElement(By.cssSelector(""));
        driver.findElement(By.xpath("(//[@class='III'])[10]"));



    }
}
