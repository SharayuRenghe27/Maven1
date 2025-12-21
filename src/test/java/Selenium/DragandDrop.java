package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragandDrop {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions action=new Actions(driver);

        Thread.sleep(3000);

        WebElement source=driver.findElement(By.id("column-a"));
        WebElement dest=driver.findElement(By.id("column-b"));
        action.dragAndDrop(source,dest).perform();
        System.out.println("Done");


    }
}
