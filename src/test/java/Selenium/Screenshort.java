package Selenium;

//import jdk.jpackage.internal.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshort {
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.get("");
        driver.findElement(By.id("")).sendKeys("");

        TakesScreenshot tk= (TakesScreenshot) driver;
        File src=tk.getScreenshotAs(OutputType.FILE);
        File des= new File("F/:facebook.png");
        FileHandler.copy(src,des);


    }
}
