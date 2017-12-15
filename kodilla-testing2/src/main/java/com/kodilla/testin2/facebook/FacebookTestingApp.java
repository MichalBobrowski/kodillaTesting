package com.kodilla.testin2.facebook;

import com.kodilla.testin2.google.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public final static String nameInput= "u_0_n";
    public final static String lastNameInput= "u_0_p";
    public final static String dayCombo = "//span[@id = \"u_0_11\"]/span/select[1]";
    public final static String monthCombo = "//span[@id = \"u_0_11\"]/span/select[2]";
    public final static String yearCombo = "//span[@id = \"u_0_11\"]/span/select[3]";
    public final static String dayId ="day";

    public static void main(String[] args) {
        String test = WebDriverConfig.CHROME;
        WebDriver driver = WebDriverConfig.getDriver(test);
        driver.get("https://www.facebook.com");

        WebElement searchNameInput = driver.findElement(By.id(nameInput));
        searchNameInput.sendKeys("Antares");

        WebElement searchLastNameInput = driver.findElement((By.id(lastNameInput)));
        searchLastNameInput.sendKeys("Loren");

        while (!driver.findElement(By.id(dayId)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath(dayCombo));
        Select select1Day = new Select(selectDay);
        select1Day.selectByIndex(23);

        WebElement selectMonth = driver.findElement(By.xpath(monthCombo));
        Select select1Month = new Select(selectMonth);
        select1Month.selectByIndex(3);

        WebElement selectYear = driver.findElement(By.xpath(yearCombo));
        Select select1Year = new Select(selectYear);
        select1Year.selectByIndex(1992);
    }
}
