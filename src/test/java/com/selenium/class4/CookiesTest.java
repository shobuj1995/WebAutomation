package com.selenium.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Set;

public class CookiesTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(("https://demoqa.com/alerts"));

        driver.manage().addCookie(new Cookie("Learner","44444"));
        driver.manage().addCookie(new Cookie("Explorer","44555"));
        driver.manage().addCookie(new Cookie("Explorer2","445556"));

        System.out.println(driver.manage().getCookieNamed("Explorer"));
        System.out.println("=====================================================================");

        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies){
            System.out.println(driver.manage().getCookieNamed(cookie.getName()));
        }
        System.out.println("=====================================================================");

        driver.manage().deleteCookieNamed("Explorer");


        cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies){
            System.out.println(driver.manage().getCookieNamed(cookie.getName()));
        }

        System.out.println("=====================================================================");
        driver.manage().deleteAllCookies();

        cookies =driver.manage().getCookies();
        System.out.println("Print the size of Cookies set: "+ cookies.size());




        driver.quit();
    }
}
