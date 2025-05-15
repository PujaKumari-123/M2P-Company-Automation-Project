package com.masai;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumapp {

	public static void main(String[] args) {
	
		 ChromeDriver driver = new ChromeDriver();
		 
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	        driver.get("https://www.selenium.dev");

	        // Validate the title
	        String title = driver.getTitle();
	        
	        if (title.contains("Selenium")) {
	            System.out.println("Title validation passed: " + title);
	        } else {
	            System.out.println("Title validation failed: " + title);
	        }

	        // Step 2: Click on the "Downloads" link using XPath
	        driver.findElement(By.xpath("//nav//a[normalize-space()='Downloads']")).click();

	        // Validate that the URL contains "/downloads"
	        String currentUrl = driver.getCurrentUrl();
	        
	        if (currentUrl.contains("/downloads")) {
	            System.out.println("URL validation passed: " + currentUrl);
	        } else {
	            System.out.println("URL validation failed: " + currentUrl);
	        }

	      
	        // Close browser
	        driver.quit();

  }

	}


