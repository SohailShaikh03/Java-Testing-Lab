package com.testing.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	WebDriver web = new ChromeDriver();
	
	try {
		//navigate to google
		web.get("https://www.google.com");
		
		//get the page title
		
		System.out.println("Title: "+ web.getTitle());
		
		//get the url
		System.out.println("Url: "+ web.getCurrentUrl());
		
		//get the browser name
		System.out.println("Browser: "+web.getClass().getSimpleName());
	}catch(Exception e) {
		System.out.println(" Error..!");
	}
	finally {
		web.close();
	}
}
}
