package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.webextension.WebExtension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Listbox {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement list1=driver.findElement(By.id("dropdown"));
//        Select s1=new Select(driver.findElement(By.id("")));
        Select s1=new Select(list1);

        s1.selectByIndex(2);
        System.out.println();
        WebElement first=s1.getFirstSelectedOption();
        System.out.println(first);

        s1.selectByVisibleText("Option 1");
        System.out.println();
        s1.selectByValue("");
        s1.selectByContainsVisibleText("");
        s1.getAllSelectedOptions();
        s1.deselectAll();
        s1.deselectByIndex(1);
        s1.deselectByValue("");
        s1.getOptions();

        // customized drop down list handle cant be handel by  select class
//    Approch1     use sendkey
        driver.findElement(By.id("")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("")).sendKeys(Keys.ARROW_LEFT);
        driver.findElement(By.id("")).sendKeys(Keys.ARROW_RIGHT);
        driver.findElement(By.id("")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.id("")).sendKeys(Keys.ENTER);

        //    Approch2    use sendkey
        driver.findElement(By.id("")).sendKeys("Banglore");



    }
}
