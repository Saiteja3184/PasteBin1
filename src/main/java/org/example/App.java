package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class App {

    WebDriver driver;

    @BeforeTest
    public void test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void checkLocator() throws InterruptedException {
        driver.get("https://pastebin.com/");
        driver.findElement(By.xpath("//form[@id='w0']/div[3]/textarea")).sendKeys("git config --global user.name  \"New Sheriff in Town\"\ngit reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\ngit push origin master --force");
        //JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
        //javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        //Thread.sleep(2000);
        WebElement ps = driver.findElement(By.xpath("//*[@id=\"select2-postform-format-container\"]"));
        ps.click();

        driver.findElement(By.xpath("/html/body/span[2]/span/span[2]/ul/li[2]/ul/li[1]")).click();
        driver.findElement(By.xpath("//form[@id='w0']/div[5]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/span[2]/span/span[2]/ul/li[3]")).click();
        Thread.sleep(2000);
        //javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        driver.findElement(By.id("postform-name")).sendKeys("how to gain dominance among developer");
        driver.findElement(By.xpath("//form[@id='w0']/div[5]/div[1]/div[8]/button")).click();
    }
}

