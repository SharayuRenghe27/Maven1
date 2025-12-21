package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("");

        Alert alt= driver.switchTo().alert();
        alt.accept();
        alt.dismiss();
        alt.getText();
        alt.sendKeys("");
        




    }
}
