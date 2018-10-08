package basicSeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Takefacebooksnap {

	public static void main(String[] args) throws IOException {
		
        System.setProperty("webdriver.chrome.driver", "E:\\selenium program\\SeleniumWebDriver\\drivers\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.id("email")).click();
		
		driver.findElement(By.id("email")).sendKeys("a1995singh@gmail.com");
		
driver.findElement(By.id("pass")).sendKeys("abhisingh1234");
		
		driver.findElement(By.id("loginbutton")).click();
		
		//driver.findElement(By.id("userNavigationLabel")).click();
		
		System.out.println("User is logged in successfully");
		
		/*WebDriverWait wait = new WebDriverWait(driver,60);
		
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Settings') and @class='_54nh']")));
		
	    driver.findElement(By.xpath("//span[contains(text(), 'Log') and @class='_54nh']")).click();			
		
		System.out.println(" 2 User is loggedout successfully");*/
		
		File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile (scrFile, new File("./Screenshots/facebook.png"));
		
	}

}
