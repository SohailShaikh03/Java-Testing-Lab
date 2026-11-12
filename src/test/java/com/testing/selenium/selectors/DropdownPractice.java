package com.testing.selenium.selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {
public static void main(String[] args) {
	WebDriver web = new ChromeDriver();
	
	web.get("https://the-internet.herokuapp.com/dropdown");
	
	try {
		Thread.sleep(2000);
		WebElement dropdown = web.findElement(By.id("dropdown"));
		
		//Select obj
		Select sel = new Select(dropdown);
		
		//by visible text
		sel.selectByVisibleText("Option 1");
		Thread.sleep(1000);
		System.out.println("Selected item is:"+sel.getFirstSelectedOption().getText());
		
		//by index value
		sel.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Selected item is:" +sel.getFirstSelectedOption().getText());
	
		//by value
		sel.selectByValue("1");
		Thread.sleep(1000);
		System.out.println("Selected item is: "+sel.getFirstSelectedOption().getText());
	
		//get all options
		System.out.println("All options are: "+sel.getOptions().toString());
	
	} catch (Exception e) {
		
	}
	finally {
		web.quit();
	}
	
	
	
}
}
