package com.demoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("httpsbcwbcsbcbscb");
		driver.manage().window().maximize();
		
		WebElement dropdownbutton =driver.findElement(By.id("drop1"));
		Select s=new Select (dropdownbutton);
		s.selectByIndex(3);
		s.selectByValue("def");
		s.selectByVisibleText("doc3");
		
	}

}
