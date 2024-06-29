package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.name("textboxn"));  
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",textbox); 
		
		
		
		
		Actions action = new Actions (driver); 
		action.contextClick(textbox).perform();   // for textbox right click using contextclick(textbox).perfom();

	}

}
