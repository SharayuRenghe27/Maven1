package Selenium;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider
    public Object[][] testdata(){

        return new Object[][]{
                {"user1","pass1"},
                {"user2","pass2"},
                {"user3","pass3"},

        };
    }

//    @DataProvider
//    public Object[][] testdata() {
//        return new Object[][]{};
//    }
}
