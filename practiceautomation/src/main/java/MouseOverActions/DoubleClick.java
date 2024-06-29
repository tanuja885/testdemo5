package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement bikeRedioButton =driver.findElement(By.xpath("(//input[@name='vehicle'])[1]\")"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",bikeRedioButton);
		
		
		WebElement buttonDoubleClick = driver.findElement(By.id("testdoubleclick"));
		
		Actions action = new Actions(driver);
		action.doubleClick(buttonDoubleClick).perform();
			
	

	}

}
  