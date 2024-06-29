package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
	     driver.get("https://omayo.blogspot.com");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     WebElement blogs = driver.findElement(By.id("blogsmenu"));
	     
	     Actions action =new Actions(driver);
	     action.moveToElement(blogs).build().perform();
	     
	     WebElement SeleniumByArun =driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
	     SeleniumByArun.click();
	     
	     
	     
	     
	     String titlename = driver.findElement(By.xpath("//h1[text()[normalize-space()='Selenium-By-Arun']]\")")).getText();
	     System.out.println(titlename);
	}

}
