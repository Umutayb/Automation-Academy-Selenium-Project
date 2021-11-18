package utils.driver;

import org.openqa.selenium.WebDriver;

public class Driver {

    public static WebDriver driver;

    public void initialize(){driver = DriverFactory.getDriver("chrome");}

    public void terminate(){driver.quit();}
}
