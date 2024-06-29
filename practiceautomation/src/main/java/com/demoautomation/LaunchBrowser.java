package com.demoautomation; 

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException //(when we use thread method we have to declare throw Interrupedexception)
	{
//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1).zip\\chromedriver.Application");
WebDriver driver =new ChromeDriver();      // create chrome object for luanching chrome browser
		driver.get("https://www.facebook.com/");      // enter url using "get" method
		driver.manage().window().maximize();      // for current brower maximize
		Thread.sleep(3000);        //for sleep mood using "Thread" method
		//driver.close();       //for close browser
	
			}
}
