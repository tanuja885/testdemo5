package com.demoautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatores {
	
	public static void main (String[]args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//Locator id 
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("hello testing");

		//Locator Name
		
		WebElement prelodaedText =driver.findElement(By.name("Fname"));
		prelodaedText.sendKeys(" Hello Automation");
		
		//Locator LinkText
		WebElement LinkText = driver.findElement(By.linkText("B"));
		LinkText.click();
		
		//Locator PartialLinktext
		WebElement partialLinktext =driver.findElement(By.partialLinkText("C"));
		partialLinktext.click();
		
		//Locator TagName
		
		List <WebElement> tagname =driver.findElements(By.tagName("a"));
		for (WebElement t: tagname) {
			System.out.println(t.getText());
		}
		
		// Css selectore
		
		driver.findElement(By.cssSelector("textarea#ta1")).sendKeys("tanuajjaaaa");
		
		////you can code another way too in cssselectore
		
		WebElement text = driver.findElement(By.cssSelector("input#textbox1"));
		text.clear();
		text.sendKeys("After clear text");
		
		//ClassName
		
		WebElement className =driver.findElement(By.className("input"));
		className.sendKeys("helloSelenium");
		
		driver.findElement(By.className("input")).sendKeys("hello selenium");
		
		//locater Xpath
		
		WebElement SearchBoxXpath = driver.findElement(By.xpath("(//input[@title='search'])[1]"));
		SearchBoxXpath.sendKeys("Title Search");
		
		driver.findElement(By.xpath("(//input[@title='search'])[1])")).click();
		
	}
	
	

}
