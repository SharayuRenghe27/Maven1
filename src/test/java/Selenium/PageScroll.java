package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class PageScroll {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
       WebElement ele= driver.findElement(By.id(""));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.ScrollBy(0,500);");

        js.executeScript("arguments[0].scrollIntoView(true);",ele);

        Actions action=new Actions(driver);
        action.scrollByAmount(0,500).perform();

        action.sendKeys(Keys.PAGE_DOWN).perform();


    }
}
