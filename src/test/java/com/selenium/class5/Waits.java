package com.selenium.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//implicitwait will be applicable
        driver.findElement(By.linkText("Register")).click();//Find Element By TextLink
        Thread.sleep(3000);

//Explicit wait will be applicable
         WebElement webElement = driver.findElement(By.id("customer.firstName"));
         wait.until(ExpectedConditions.elementToBeClickable(webElement));


        webElement = driver.findElement(By.name("customer.lastName"));
        webElement.sendKeys("Obaydul");//Find Element By name
        wait.until(ExpectedConditions.elementToBeClickable(webElement));

        
        driver.quit();
    }
}

