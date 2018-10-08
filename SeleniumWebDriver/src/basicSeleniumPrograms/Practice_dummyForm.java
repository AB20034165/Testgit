package basicSeleniumPrograms;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Practice_dummyForm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium program\\SeleniumWebDriver\\drivers\\chromedriver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		
		driver.manage().window().maximize();
		
        String QA = driver.getTitle();
        
        if(QA.equals("Demo Form for practicing Selenium Automation"))
        	
        {
        	System.out.println("Test Passes");
        }
        
        else{
        	
        	System.out.println("Test Fails");
        }
		
		System.out.println("Title is :"+QA);
		
        WebDriverWait wait = new WebDriverWait(driver,60);
		
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("DEMO SITES")));
		
		
		WebElement element = driver.findElement(By.linkText("DEMO SITES"));
		 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Automation Practice Form")));
 
        driver.findElement(By.linkText("Automation Practice Form")).click();
		
		
	}

	
	

}
