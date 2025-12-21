package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("");
        //Immplicit wait-apply globally
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Explicit wait-Wait for a specific condition for a specific element.
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(""))).click();

        //fluent wait-Same as explicit wait, but with polling frequency and ignored exceptions.
//        Wait<WebDriver> fwait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(20))
//                .pollingEvery(Duration.ofMillis(500))
//                .ignoring(NoSuchElementException.class);
//
//        fwait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));




    }
}
