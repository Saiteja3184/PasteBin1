package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {
    @Test
    public void checkLocator() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Teja\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");
        driver.findElement(By.xpath("//form[@id='w0']/div[3]/textarea")).sendKeys("Hello from WebDriver");
        JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form[@id='w0']/div[5]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/span[2]/span/span[2]/ul/li[3]")).click();
        Thread.sleep(2000);
        javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        driver.findElement(By.id("postform-name")).sendKeys("helloweb");
        driver.findElement(By.xpath("//form[@id='w0']/div[5]/div[1]/div[8]/button")).click();
    }
}

