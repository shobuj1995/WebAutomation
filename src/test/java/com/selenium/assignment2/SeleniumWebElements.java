package com.selenium.assignment2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");//Call the URl

        driver.findElement(By.linkText("Register")).click();//Find Element By TextLink
        Thread.sleep(3000);

//        driver.findElement(By.partialLinkText("")).click();//Find Element By partial link text
//        Thread.sleep(300);

        driver.findElement(By.id("customer.firstName")).sendKeys("Din Mohammad");//Find Element By ID
        Thread.sleep(3000);

        driver.findElement(By.name("customer.lastName")).sendKeys("Obaydul");//Find Element By name
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Bangladesh");
        driver.findElement(By.id("customer.address.city")).sendKeys("Dhaka");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#customer\\.address\\.state")).sendKeys("Gulsan");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[id=\"customer.address.zipCode\"]")).sendKeys("5000");
        Thread.sleep(3000);


        System.out.println(driver.findElement(By.className("title")).getText());//Find Element By Class Name
        Thread.sleep(3000);


        System.out.println(driver.findElement(By.tagName("title")).getText());//Find Element By tag Name
        Thread.sleep(300);


        driver.quit();
    }
}
