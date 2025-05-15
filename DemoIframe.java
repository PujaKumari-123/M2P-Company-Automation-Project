package com.masai;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIframe {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame("frame1");
		
		WebElement heading = driver.findElement(By.id("sampleHeading"));;
		
		String text = heading.getText();
		
		if (text.equals("This is a sample page")) {
			
			System.out.println("Text matched:"+ text);
		} else {
			System.out.println("Text did not match:"+ text);
		}
		
		//Switch back to main page after working with iframe
	
	   driver.switchTo().defaultContent();
	   
	   driver.quit();
	
	}

}
