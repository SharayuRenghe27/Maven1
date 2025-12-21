package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Brokenlink {
    public static void main(String[] args) throws IOException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("file-upload")));

        List<WebElement> links=driver.findElements(By.tagName("a"));

        for(WebElement link:links)
        {
            String Stringurl=link.getAttribute("href");

            if(Stringurl!=null && !Stringurl.isEmpty())
            {
                URL url= new URL(Stringurl);
                HttpURLConnection connection= (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("HEAD");
                connection.setReadTimeout(3000);
                connection.connect();

                int httpResponse= connection.getResponseCode();
                if (httpResponse>=400)
                    System.out.println(Stringurl+" --Not valid");
                else
                    System.out.println(Stringurl+" --Valid");


            }

        }

        driver.close();





    }
}
