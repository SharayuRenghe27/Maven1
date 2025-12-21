package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ChildBrowerpopup {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("");

        String parent=driver.getWindowHandle();
        Set<String>  handles=driver.getWindowHandles();

        for (String win:handles)
        {
            if (!win.equals(parent)){
                driver.switchTo().window(win);
            }
        }
        driver.close();
        driver.switchTo().window(parent);
    }
}
