package com.masai;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));;
		
		WebElement registration = driver.findElement(By.className("ico-register"));
		
		registration.click();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Johnn");
		
		driver.findElement(By.id("LastName")).sendKeys("Doee");
		
		driver.findElement(By.id("Email")).sendKeys("johndoe111222@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("John123");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("John123");
	
	    driver.findElement(By.id("register-button")).click();
	    
	    // Step 2: Go to Login Page
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("johndoe111222@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("John123");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();

        // Step 3: Search for laptop
        driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
        driver.findElement(By.cssSelector("input.button-1.search-box-button")).click();

        System.out.println("Registration, login and search completed");

        driver.findElement(By.xpath("//*[@class='button-2 product-box-add-to-cart-button']")).click();
        
        
        
        driver.quit();
    
     
	
	}

}
