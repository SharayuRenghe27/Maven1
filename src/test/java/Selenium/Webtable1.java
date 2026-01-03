package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class Webtable1 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement table=driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

        List<WebElement> rows= table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> th = row.findElements(By.tagName("th"));
            List<WebElement> td = row.findElements(By.tagName("td"));
            for (WebElement thead:th){
                System.out.print("\n"+thead.getText()+" Detials-\n");
            }
            for (WebElement tddata : td) {
                System.out.print(tddata.getText()+"\t");
            }
        }
driver.quit();


    }
}
