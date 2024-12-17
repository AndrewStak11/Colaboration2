package org.example;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Clickable {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://new.skillfactory.ru/corporativnoye-obuchenye?_gl=1*ikhsjf*_gcl_aw*R0NMLjE3MzQxNDM5MzYuQ2owS0NRaUEwLS02QmhDQkFSSXNBRFlxeUxfclYwYW1uaXM4RjMxOE8yRzdKNUpUWVhUcjZhekZ0SlZpalJFME9kdmxBR1dHNzVRSzB0VWFBcU11RUFMd193Y0I.*_gcl_au*NjM3Njc4ODgyLjE3MzM3ODIwNjI.*_ga*MTIzMTc1MzM5NC4xNzMzNzgyMDYz*_ga_X08SF39ELF*MTczNDM3MzQzNy4xMy4xLjE3MzQzNzM4NjMuNTguMC4w");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.cssSelector("#rec424361045 > div > div > div.t396__elem.tn-elem.tn-elem__4243610451647456524784 > a")).click();
            driver.findElement(By.id("input_1495810359387")).sendKeys("Имя");
            driver.findElement(By.id("input_1495810354468")).sendKeys("email@mail.ru");
            driver.findElement(By.id("input_1495810410810")).sendKeys("9999999999");
            driver.findElement(By.id("input_1495810410810")).sendKeys(Keys.RETURN);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}