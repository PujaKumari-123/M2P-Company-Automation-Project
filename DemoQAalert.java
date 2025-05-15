package com.masai;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAalert {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Click the button to trigger alert
        driver.findElement(By.id("alertButton")).click();

        // Switch to alert and capture text
        Alert alert = driver.switchTo().alert();
        
        String alertText = alert.getText();

        // Validate alert text
        if (alertText.equals("You clicked a button")) {
            System.out.println("Alert text validation passed: " + alertText);
        } else {
            System.out.println("Alert text validation failed: " + alertText);
        }

        // Accept the alert
        alert.accept();

        driver.quit();
		
	}

}
