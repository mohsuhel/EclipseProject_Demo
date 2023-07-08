package com.selenium.script.test_addressbook_selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        System.out.println( "Hello World!" );
        
        //setup webdriver
        System.setProperty("webdriver.chrome.driver", "D:\\suhel d drive\\StarAgile\\chromedriver.exe");
        
       // System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--remote-allow-origins=*");
        //Initialize web driver with chrome
        WebDriver driver = new ChromeDriver(chromeOptions);
        System.out.println("Scripted Started");
        // open the app url
        //driver.get("http://34.238.85.215:8081/addressbook-2.0/");
        driver.get("http://54.144.126.236:8081/addressbook-2.0/");
        // wait for application to load
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        
        //locate web elements and interact
        driver.findElement(By.className("v-button")).click();
        
        //enter the details in the form
        driver.findElement(By.id("gwt-uid-5")).sendKeys("Sam");
        
      
        
        driver.findElement(By.id("gwt-uid-7")).sendKeys("Singh");
        
       
        
        driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
        
    
        
        driver.findElement(By.id("gwt-uid-11")).sendKeys("sam@gmail.com");
        
       
        
        driver.findElement(By.id("gwt-uid-13")).sendKeys("06/07/2023,");
        
     
        driver.findElement(By.className("v-button-primary")).click();
        
        Thread.sleep(3000);
        

		  TakesScreenshot scrShot = ((TakesScreenshot)driver);
		  
		  File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
		  
		  File destFile = new File("screenshot.png");
		  
		  FileUtils.copyFile(screenShot, destFile);
		 
		  System.out.println("reports stored at : " + destFile.getAbsolutePath().toString());
      
      Thread.sleep(3000);
  
        
        
        driver.quit();
        
        System.out.println("Script executed successfully");
        
        
    }
}
