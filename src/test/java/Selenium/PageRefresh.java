package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.security.Key;

public class PageRefresh {

//    public int reresh(){
//        int i=10;
//        return i;
//
//    }
//    public static void main(String[] args) {

    @Test
    public void refresh() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        //1st
        driver.navigate().refresh();
        //2nd
        driver.get(driver.getCurrentUrl());
        //3rd
        driver.navigate().to(driver.getCurrentUrl());
        Thread.sleep(2000);
        //4th
//        driver.findElement(By.id("(//span[@class=\"yt-icon-shape style-scope yt-icon ytSpecIconShapeHost\"])[2]")).sendKeys(Keys.F5);
        Thread.sleep(4000);

        //5th
//        driver.findElement(By.id("(//span[@class=\"yt-icon-shape style-scope yt-icon ytSpecIconShapeHost\"])[2]")).sendKeys("/uE035");

    }




    }
//}
