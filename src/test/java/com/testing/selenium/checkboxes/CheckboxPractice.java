package com.testing.selenium.checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPractice {
	public static void main(String[] args) {
		
		WebDriver web = new ChromeDriver();
		try {
			web.get("https://the-internet.herokuapp.com/checkboxes");
			
			Thread.sleep(2000);
			WebElement c1 = web.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
			System.out.println("Is selected?:"+c1.isSelected());
			c1.click();
			Thread.sleep(1000);
			System.out.println("Is checkbox selected?:"+c1.isSelected());
			
			WebElement c2 =  web.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
			System.out.println("Is checkbox selected?: "+c2.isSelected());
			Thread.sleep(2000);
			
			if(c2.isSelected()) {
				c2.click();
			}
			Thread.sleep(2000);
			
			System.out.println("Is selected?: "+c2.isSelected());
			
		}catch(Exception e) {
			
		}finally {
			web.quit();
		}
	}

}
