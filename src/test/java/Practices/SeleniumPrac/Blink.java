package Practices.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Blink {
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://in.search.yahoo.com/");
        driver.manage().window().maximize();

        List<WebElement>links= driver.findElements(By.tagName("a"));

        for(WebElement link:links)
        {
            String stringurl=link.getAttribute("href");

            if(stringurl!=null && !stringurl.isEmpty()){

                URL url=new URL(stringurl);

                HttpURLConnection connection= (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("HEAD");
                connection.setReadTimeout(3000);
                connection.connect();

                int respose=connection.getResponseCode();

                if (respose>=400)
                    System.out.println(stringurl+" --Not valid");
                else
                    System.out.println(stringurl+" -- Valid");


            }

        }

        driver.close();

    }
}
