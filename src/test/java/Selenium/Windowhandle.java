package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("");

        String currentwindow=driver.getWindowHandle();
        for (String win:driver.getWindowHandles())
            if (!win.equals(currentwindow))
                driver.switchTo().window(win);

    }
}
