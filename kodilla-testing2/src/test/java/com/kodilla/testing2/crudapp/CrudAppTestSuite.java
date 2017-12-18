package com.kodilla.testing2.crudapp;

import com.kodilla.testin2.google.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CrudAppTestSuite {

    private WebDriver driver;
    private Random generator;

    private static final String BASE_URL = "https://michalbobrowski.github.io/";
    private static final String TASK_TITLE = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
    private static final String TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
    private static final String ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";

    @Before
    public void initTest(){
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

   // @After
    public void cleanUpAfterTests(){
        driver.close();
    }
    public String createCrudAppTestTask() throws InterruptedException{
            String taskName = "Task number " + generator.nextInt(100000);
            String taskContent = taskName + " content";

            WebElement name = driver.findElement(By.xpath(TASK_TITLE));
            name.sendKeys(taskName);

            WebElement content = driver.findElement(By.xpath(TASK_CONTENT));
            content.sendKeys(taskContent);

            WebElement button = driver.findElement(By.xpath(ADD_BUTTON));
            button.click();
            Thread.sleep(2000);

            return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException{
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable_row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable_field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath("//select[1]"));
                    Select select = new Select(selectElement);
                    select.deselectByIndex(1);

                    WebElement buttonCreatedCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                        buttonCreatedCard.click();
                });
        Thread.sleep(10000);
    }

    public boolean checkCardExistInTrello (String taskName) throws InterruptedException{
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("bobrowski92@gmail.com");
        driverTrello.findElement(By.id("password")).sendKeys("Rammstein888@3");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(30000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-title\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Board\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(30000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }

    public void cleanUpCrudApp(String taskName){
        final String formXpath = "//form[@class=\"datatable__row\"]";
        final String pXpath = ".//p[@class = \"datatable__field-value\"]";
        final String deleteButtonXpath = "./div/fieldset[1]/button[4]";

                driver.findElements(By.xpath(formXpath)).stream()
                        .filter(form -> form.findElement(By.xpath(pXpath))
                                .getText().equals(taskName))
                        .forEach(form -> {
                            form.findElement(By.xpath(deleteButtonXpath)).click();
                        });

    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException{
        String taskName = createCrudAppTestTask();
        //sendTestTaskToTrello(taskName);
       // Assert.assertTrue(checkCardExistInTrello(taskName));
        cleanUpCrudApp(taskName);
    }

}
