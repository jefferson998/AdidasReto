package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;

public class SeleniumWebDriver {
    public static WebDriver driver;

    public static void ChromeWebDriver(String url){
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
        driver = new ChromeDriver(capabilities);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");

        driver=new ChromeDriver(options);
        driver.get(url);


    }

//    public static void MozillaWebDriver(String url){
//        driver = new FirefoxDriver();
//        driver.get(url);
//    }

}
