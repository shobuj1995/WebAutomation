package com.selenium.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WindowsOrTabsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(("https://demoqa.com/browser-windows"));

        String originalWindow = driver.getWindowHandle();

//        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://demoqa.com/sample");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(3000);
        driver.close();

        System.out.println("Please Open the previous window");
        driver.switchTo().window(originalWindow);
        System.out.println(driver.findElement(By.className("main-header")).getText());

        Thread.sleep(3000);

        driver.quit();

    }
}
