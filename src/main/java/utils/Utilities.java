package utils;

import utils.driver.Driver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utilities extends Driver {

    public void navigate(String url){driver.get(url);}

    public void predeterminedNavigate(String pageName){
        Properties properties = new Properties();
        String url;
        try{
            properties.load(new FileReader("src/main/resources/test.properties"));
            url = properties.getProperty("url."+pageName);
        }
        catch (IOException exception) {return;}
        driver.get(url);
    }

    public void waitFor(double seconds) {
        try {Thread.sleep((long) (seconds*1000));}
        catch (InterruptedException ignored){}
    }

}
