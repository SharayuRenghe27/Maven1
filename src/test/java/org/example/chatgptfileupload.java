package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.io.File;
import java.time.Duration;

public class chatgptfileupload {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/upload");   // <-- replace with your URL

        // -----------------------------
        // 1. Get all JSON files in folder
        //-----------------------------
                File folder = new File("C:\\JsonFolder");   // <-- your folder path
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
            WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("fileUpload")));

            uploadBtn.sendKeys(jsonFile.getAbsolutePath());
            Thread.sleep(1000);


            // -----------------------------
            // Click NEXT button 3 times
            // -----------------------------
            By nextBtn = By.xpath("//button[text()='Next']");

            for (int i = 1; i <= 3; i++) {
                WebElement next = wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
                next.click();
                Thread.sleep(1000);
            }


            // -----------------------------
            // Click SUBMIT button once
            // -----------------------------
            WebElement submitBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))
            );

            submitBtn.click();
            System.out.println(jsonFile.getName() + " uploaded successfully!");

            Thread.sleep(2000); // optional wait


            // -----------------------------
            // Refresh or navigate back
            // -----------------------------
            driver.navigate().refresh();
            Thread.sleep(2000);
        }

        System.out.println("==== All JSON files uploaded successfully! ====");
        driver.quit();
    }
}

