package com.testing.selenium.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPractice {
	public static void main(String[] args) throws Exception {
		WebDriver web = new ChromeDriver();
		
		web.get("https:www.saucedemo.com");
		WebElement username = web.findElement(By.id("user-name"));
		
		//isDisplayed();
		System.out.println("Is Displayed method: "+ username.isDisplayed());
		
		//isEnabled()
		System.out.println("Is it is enabled: "+ username.isEnabled());
		Thread.sleep(3000);	
		
		username.sendKeys("standard_user");
		
		//getAttribute
		System.out.println("Attribute:" + username.getAttribute("placholder"));
		
		//clear input
		username.clear();
		Thread.sleep(2000);
		
		username.sendKeys("standard_user");
		
		
		WebElement password = web.findElement(By.id("password"));
		
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		web.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		
		WebElement heading = web.findElement(By.className("title"));
		
		System.out.println("Title:" +heading.getText());
		
		web.close();
		
	}

}
