package com.demoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameDemo {
	public static void main(String[] args) {
		
     WebDriver driver = new ChromeDriver ();
	 driver.get("https://omayo.blogspot.com");
	 driver.manage().window().maximize();
	 
	//finding total frame with tagname method and size
	 
	 int totalFrame =driver.findElements (By.tagName("iframe")).size();
	 System.out.println(totalFrame);
	 
	 //handling frame in 3 ways(id/name,index,webelement(x path))with (switchTo.frame )method
	 
	 driver.switchTo().frame("iframe1");   //using  id or name 
	 
	 driver.switchTo().frame(0);   //using index
	 
	 WebElement frameweb=driver.findElement(By.xpath("//iframe[@id='iframe1']"));
	 driver.switchTo().frame(frameweb);  // using WebElement/xpath
	
	
	  

	}

}
