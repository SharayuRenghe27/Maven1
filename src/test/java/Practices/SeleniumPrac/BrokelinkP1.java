package Practices.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokelinkP1 {
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.get("");
        driver.manage().window().maximize();

        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(WebElement link:links)
        {
            String Strigurl=link.getAttribute("href");
            if (Strigurl!=null && !Strigurl.isEmpty())
            {
                URL url=new URL(Strigurl);

                HttpURLConnection connection= (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("HEAD");
                connection.setReadTimeout(3000);
                connection.connect();
                int response= connection.getResponseCode();
                if (response>=400)
                    System.out.println(Strigurl+" --Not valid");
                else
                    System.out.println(Strigurl+" --Valid");


            }

        }

driver.close();
    }
}




