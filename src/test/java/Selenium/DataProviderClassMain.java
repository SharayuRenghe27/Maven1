package Selenium;

import org.testng.annotations.Test;

public class DataProviderClassMain {

    @Test(dataProvider = "testdata", dataProviderClass = DataProviderClass.class)
    public void loginTest(String username,String password)
    {
        System.out.println("Testing username ----"+username+" --- "+password);
    }


}
