package com.selenium.assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InformationTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        WebElement webElement =driver.findElement(By.className("title"));
        System.out.println("isDisplayed: "+webElement.isDisplayed());
        System.out.println("TagName: "+ webElement.getTagName());
        System.out.println("getRect: "+ webElement.getRect().x+" "+webElement.getRect().getY());
        System.out.println("cssValue: "+ webElement.getCssValue("color"));
        System.out.println("TextContent: "+ webElement.getText());
        System.out.println("Attributes: "+ driver.findElement(By.id("customerForm")).getAttribute("action"));
        driver.quit();
    }
}
