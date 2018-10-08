package basicSeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_PopHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium program\\SeleniumWebDriver\\drivers\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		
		driver.manage().window().maximize();
		
WebDriverWait wait = new WebDriverWait(driver,60);
		
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("DEMO SITES")));
		
		
		WebElement element = driver.findElement(By.linkText("DEMO SITES"));
		 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Automation Practice Form")));
 
        driver.findElement(By.linkText("Automation Practice Form")).click();
		
		//driver.quit();
	}

}
