package com.demoautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrnshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		
         TakesScreenshot screenshot= (TakesScreenshot)driver;
		
		File sc=screenshot.getScreenshotAs(OutputType.FILE);
		  
		FileUtils.copyFile(sc, new File("   "));


	}

}