package building;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;//
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class BuildingMozila {
    private WebDriver driver;
    DesiredCapabilities desc;

    public void setup() throws MalformedURLException {



    //  System.setProperty("webdriver.gecko.driver", "Downloads/geckodriver.exe");//
        desc = DesiredCapabilities.chrome();
        //URL grid_url = new URL("http://10.171.97.175:4444/wd/hub");
        driver = new RemoteWebDriver(new URL("http://10.171.97.175:4444/wd/hub"),desc);
       driver = new ChromeDriver();
       // driver =  new ChromeDriver();
        driver.get("https://www.google.com");
        //to make the window maximize//
        // driver.manage().window().maximize(); //

        //To make the window size full screen//
        driver.manage().window().fullscreen();


        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]) throws MalformedURLException {
        BuildingMozila test = new BuildingMozila();
        test.setup();

    }



}

