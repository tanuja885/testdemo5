 package com.demoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelection {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement OrangeCheckBox = driver.findElement(By.id("checkbox1"));
		WebElement BlueCheckBox = driver.findElement(By.id("checkbox2"));
		
		if(OrangeCheckBox.isSelected()) {
			BlueCheckBox.click();
				
		}
		else 
		{
			OrangeCheckBox.click();
			BlueCheckBox.click();
		}
		

	
		Thread.sleep(3000);

	}

}
