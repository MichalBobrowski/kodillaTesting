package com.kodilla.testin2.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public final static String SEARCHFIELD = "lst-ib";


    public static void main(String[] args){
        String test = WebDriverConfig.CHROME;
        String test2 = "FIREFOX_DRIVER";
        WebDriver driver = WebDriverConfig.getDriver(test2);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
