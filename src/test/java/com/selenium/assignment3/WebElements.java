package com.selenium.assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

        //find element by name
        WebElement webElement= driver.findElement(By.name("firstName"));
        webElement.click();
        webElement.sendKeys("Name");
        Thread.sleep(2000);

        //Clear the Name input field
        webElement.clear();
        Thread.sleep(2000);

        //Submit a form
        driver.findElement(By.name("submit")).submit();
        Thread.sleep(3000);



        driver.quit();

    }
}
