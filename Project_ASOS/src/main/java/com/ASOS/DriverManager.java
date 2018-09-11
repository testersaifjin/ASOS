package com.ASOS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    public DriverManager()
    {
        PageFactory.initElements(driver, this);
    }


    public static WebDriver driver;
    static String browser;
    static String url;

    public void getProperties() throws IOException
    {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\config.properties");
        properties.load(fis);
        browser = properties.getProperty("browser");
        url = properties.getProperty("url");

//        System.out.println("browser"+browser);
//        System.out.println("url"+url);
    }


    public void openBrowser()
    {

        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sjain1\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
//            System.setProperty("webdriver.gecko.driver", "C:\\Users\\sjain1\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);



    }


    public void closeBrowser()
    {
        driver.quit();

    }
}
