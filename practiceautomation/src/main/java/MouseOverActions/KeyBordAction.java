package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBordAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement textareafield = driver.findElement(By.id("ta1"));
		 Actions action= new Actions (driver);
		 action.moveToElement(textareafield).sendKeys(textareafield,"automation").keyDown(Keys.ENTER);
		 action.keyDown(Keys.ENTER);
		 action.moveToElement(textareafield).sendKeys(textareafield, "testing").build().perform();
		
		
		
		

	}

}
