package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Position;

public class WindowSize {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("");

        Dimension d=new Dimension(100,200);
        driver.manage().window().setSize(d);

        Point p= new Point(1000,2000);
        driver.manage().window().setPosition(p);

        driver.manage().window().minimize();
        driver.manage().window().maximize();

        WebElement ele=driver.findElement(By.id("a"));
        //get position
        Point p1=ele.getLocation();
        int x=p1.getX();
        System.out.println("X="+x);
        int y=p1.getY();
        System.out.println("Y="+y);
        //get size
        Dimension d1=ele.getSize();
        int width=d1.getWidth();
        System.out.println("width="+width);
        int height=d1.getHeight();
        System.out.println("Height="+height);

        driver.close();
        driver.quit();

    }
}
