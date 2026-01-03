package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class Keyboard {
    public static void main(String[] args) throws InterruptedException {


            WebDriver driver = new ChromeDriver();


//         public void practice(){
            driver.get("https://awesomeqa.com/practice.html");
            WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.SHIFT).sendKeys(firstname, "the testing academy").keyUp(Keys.SHIFT).build().perform();


        driver.get("https://www.spicejet.com/");
        Thread.sleep(3000);
        WebElement source= driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

//        WebElement smallpopup = driver.findElement(By.tagName("(//div[@class=\"tp-dt-header-icon\"])[2]"));
//        wait.until(ExpectedConditions.visibilityOf(smallpopup));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModel']")));
        WebElement closepopup = driver.findElement(By.tagName("//span[@class=\"commonModal__close\"]"));

//        actions.moveToElement(smallpopup).click().build().perform();// cancel
        actions.moveToElement(closepopup).click().build().perform();//close popup
        WebElement From = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
        actions.moveToElement(From).sendKeys("Mumbai").build().perform();





    }

}
