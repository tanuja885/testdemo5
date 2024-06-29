package com.demoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement Confirmalert = driver.findElement(By.id("confirm"));
		Confirmalert.click(); 
		Thread.sleep(3000);

		org.openqa.selenium.Alert pop = driver.switchTo().alert();
		pop.accept();
		pop.dismiss();

	}

}
