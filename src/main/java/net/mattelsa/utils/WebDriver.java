package net.mattelsa.utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriver {
    private static ChromeDriver driver;

    public WebDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/files/chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito","--star-maximized", "--disable-infobars");
        driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static  WebDriver driver() {
        return new WebDriver();
    }

    public ChromeDriver Pagina(String url){
        driver.get(url);
        driver.manage().window().maximize();
        return  driver;
    }
}
