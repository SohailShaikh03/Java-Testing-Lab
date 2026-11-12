package com.testing.selenium.radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {

	
	public static void main(String[] args) {
		WebDriver web = new ChromeDriver();
		try {
			web.get("https://demoqa.com/radio-button");
			WebElement r1 = web.findElement(By.xpath("//*[@id=\"yesRadio\"]"));
			
			WebElement r2 = web.findElement(By.xpath("//*[@id=\"impressiveRadio\"]"));
			
			Thread.sleep(1000);
			
			r1.click();
			
			System.out.println("Is yes selected?:" +web.findElement(By.id("yesRadio")).isSelected());
			
			System.out.println("Is impressive selected?: "+web.findElement(By.id("impressiveRadio")).isSelected());
			Thread.sleep(2000);
			
			r2.click();
			System.out.println("Is impressive selected?: "+web.findElement(By.id("impressiveRadio")).isSelected());
			
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}finally {
		}
			web.quit();
		}
	}

