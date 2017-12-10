package com.kodilla.testin2.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    public final static String CHROME = "CHROME-DRIVER";
    public static WebDriver getDriver(final String driver){
        System.setProperty("webdriver.chrome.driver","C:\\Selenium-drivers\\Chrome\\chromedriver2.exe");

        return new ChromeDriver();
    }
}
