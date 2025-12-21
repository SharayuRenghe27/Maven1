package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("");
        WebElement ele=driver.findElement(By.id("abc"));
        WebElement ele2 =driver.findElement(By.id("abc"));
        Actions action= new Actions(driver);
        action.moveToElement(ele2).clickAndHold().moveToElement(ele2).release().perform();
        action.contextClick().perform();//right click
        action.doubleClick().perform();
        action.dragAndDrop(ele,ele2).perform();
    }
}
