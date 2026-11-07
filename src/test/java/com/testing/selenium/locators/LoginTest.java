package com.testing.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver web = new ChromeDriver();
		Thread t = new Thread();
		t.sleep(2000);
		web.get("https:www.saucedemo.com");
//		
//		web.findElement(By.id("user-name"))
//		.sendKeys("standard_user");
//		
//		t.sleep(2000);
//		web.findElement(By.id("password"))
//		.sendKeys("secret_sauce");
//		
//		Thread.sleep(2000);
//		web.findElement(By.id("login-button"))
//		.click();
//		
//		t.sleep(5000);
//		System.out.println("Url: "+web.getCurrentUrl());
//		System.out.println("title: "+web.getTitle());
		
		
		web.findElement(By.cssSelector("#user-name"))
		.sendKeys("standard_user");
		t.sleep(3000);
		
		web.findElement(By.cssSelector("input[type='password']"))
		.sendKeys("secret_sauce");
		t.sleep(3000);
		Thread.sleep(2000);
		web.findElement(By.id("login-button"))
		.click();
		
		t.sleep(5000);
		System.out.println("Url: "+web.getCurrentUrl());
		System.out.println("title: "+web.getTitle());
		
		web.quit();
		
	}

}
