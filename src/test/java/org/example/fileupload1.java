package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.time.Duration;

public class fileupload1 {
    public static void main(String []args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

//        List []filename=;

//        driver.findElement(By.id("")).sendKeys("C:\\Users\\omkar\\IdeaProjects\\Maven1\\src\\test\\java\\org\\example\\demo.json");
//        driver.findElement(By.id("file-submit")).click();
//        System.out.println("sent demo file");


        // -----------------------------
        // 1. Get all JSON files in folder
        //-----------------------------
        File folder = new File("C:\\Users\\omkar\\IdeaProjects\\Maven1\\src\\test\\java\\org\\example"  );   // <-- your folder path
        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".json"));

//        if (files == null || files.length == 0) {
//            System.out.println("No JSON files found!");
//            driver.quit();
//            return;
//        }

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


    }
}
