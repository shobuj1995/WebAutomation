package com.selenium.assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Select select =new Select(driver.findElement(By.name("country")));
        select.selectByIndex(2);
        Thread.sleep(3000);

        select.selectByValue("ARMENIA");
        Thread.sleep(3000);

        select.selectByVisibleText("BASSA DE INDIA");
        Thread.sleep(3000);

        List<WebElement> webElements = select.getOptions();
        for(WebElement element:webElements){
            System.out.println(element.getAttribute("value")+ ": "+element.getText());
        }

        driver.navigate().to("https://demoqa.com/select-menu");
        Select select1 =new Select(driver.findElement(By.id("cars")));
        select1.selectByIndex(1);
        select1.selectByIndex(2);
        Thread.sleep(3000);

        driver.quit();

    }
}
