package tests;

import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class LoginTest extends TestBase {

    AllPages allPages = new AllPages();

    @Test
    public void logon (){
        allPages.mainPage().login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }
}
