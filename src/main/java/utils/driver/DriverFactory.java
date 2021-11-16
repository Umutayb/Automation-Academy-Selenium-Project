package utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver getDriver(String driverName, WebDriver driver){
        Properties properties = new Properties();

        try{properties.load(new FileReader("src/main/resources/test.properties"));}
        catch (IOException ignored){}

        if (driverName == null)
            driverName = properties.getProperty("browser");

        switch (driverName.toLowerCase()){
            case "safari":
                SafariOptions safariOptions = new SafariOptions();
                //safariOptipns.set(x,y,z);
                System.setProperty("webdriver.chrome.driver","/usr/bin/safaridriver");
                driver = new SafariDriver(safariOptions);
                break;

            default:
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("disable-notifications");
                System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
                driver = new ChromeDriver(chromeOptions);
                break;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        return driver;
    }
}
