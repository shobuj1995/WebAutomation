package com.selenium.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class JavaScriptsAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(("https://demoqa.com/alerts"));

        //Alert
        driver.findElement(By.id("alertButton")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.switchTo().alert().accept();
//        Thread.sleep(3000);
//
//        //Confirmation
        WebElement webElement = driver.findElement(By.id("confirmButton"));
        webElement.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);

        webElement.click();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
//
//
//        //Prompt
        WebElement prompt = driver.findElement(By.id("promtButton"));
        prompt.click();
        Thread.sleep(3000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.dismiss();
        Thread.sleep(3000);

        prompt.click();
        Thread.sleep(3000);
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Knowedge Exploler");
        promptAlert.accept();
        Thread.sleep(3000);


        driver.quit();

    }
}
