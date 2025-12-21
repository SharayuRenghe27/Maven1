package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class demo1{

    public static void main(String []args) throws InterruptedException {


//        Open chromdriver

        WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.cersai.org.in/CERSAI/home.prg");
        Thread.sleep(8000);

//      Close pop up
        WebElement closepop = driver.findElement(By.xpath("//span[@class=\"popup-close\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closepop);
        Thread.sleep(3000);


        driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
        Thread.sleep(3000);
        System.out.println("Clicked on Login button ");

        driver.findElement(By.xpath("//input[@id=\"j_username\"]")).sendKeys("Abc123");
        driver.findElement(By.xpath("//input[@id=\"pwd1\"]")).sendKeys("Abc123");

        System.out.println("Enter Captcha ");
        Thread.sleep(5000);


        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(10000);
        System.out.println("Logged in ...wooohooo");

        Thread.sleep(6000);

//        Click on tab
        driver.findElement(By.xpath("")).click();

//        Click on list option
        driver.findElement(By.xpath("")).click();

//        Click on sub list option
        driver.findElement(By.xpath("")).click();
        Thread.sleep(4000);


//        File upload Process --- 1st file upload UI is different so xpath is different
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\omkar\\IdeaProjects\\Maven1\\src\\test\\java\\org\\example\\demo.json");
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(2000);


        // -----------------------------
        // 1. Get all JSON files in folder
        //-----------------------------
        File folder = new File("C:\\Users\\omkar\\IdeaProjects\\Maven1\\src\\test\\java\\org\\example");   // <-- your folder path
        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".json"));

        if (files == null || files.length == 0) {
            System.out.println("No JSON files found!");
            driver.quit();
            return;
        }

        // -----------------------------
        // 2. Loop through all JSON files
        // -----------------------------
        for (File jsonFile : files) {

            System.out.println("Processing File: " + jsonFile.getName());

            // -----------------------------
            // Upload current JSON file
            // -----------------------------
            WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("file-upload")));

            uploadBtn.sendKeys(jsonFile.getAbsolutePath());//upload file
            driver.findElement(By.id("file-submit")).click();// submit it
            Thread.sleep(1000);
            driver.navigate().back();//refresh
            Thread.sleep(3000);


        }


        driver.close();









    }
}
