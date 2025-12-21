package Practices.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class linkBroken {
    public static void main(String[] args) throws IOException {

        WebDriver driver=new
                ChromeDriver();
        driver.get("");

        List<WebElement> links=driver.findElements(By.id("a"));

        for (WebElement link:links)
        {
          String  StringUrl=link.getAttribute("href");

          if (StringUrl!=null && !StringUrl.isEmpty()){

              URL url=new URL(StringUrl);

              HttpURLConnection connection= (HttpURLConnection) url.openConnection();
              connection.setRequestMethod("HEAD");
              connection.setReadTimeout(3000);
              connection.connect();
              int response=connection.getResponseCode();
              if(response>=400){
                  System.out.println(StringUrl+"  --Not vaid");
              }
              else
                  System.out.println(StringUrl+"  --Valid ");



          }



        }



    }
}
