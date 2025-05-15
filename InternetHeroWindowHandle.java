package com.masai;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetHeroWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		driver.findElement(By.xpath("//*[.='Click Here']"));
		
	    //Switch to new window
	    Set<String> allWindows = driver.getWindowHandles();
	    
	     for (String win : allWindows) {
	    driver.switchTo().window(win);
	     }

	    // Print the new tab title
	    System.out.println("New Tab Title: " + driver.getTitle());

	    // Scroll to bottom of the page using JavaScript
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(500, document.body.scrollHeight);");

	    Thread.sleep(2000);
	    System.out.println("Scroll action completed.");

	  	driver.quit();
	}

}
