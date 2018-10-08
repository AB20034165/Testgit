package basicSeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/

public class TestFacebook_Login_Page {
			
		
		public static void main(String[] args) throws InterruptedException{
			
			
		System.setProperty("webdriver.chrome.driver", "E:\\selenium program\\SeleniumWebDriver\\drivers\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//boolean b = driver.findElement(By.xpath("//blueBarDOMInspector]/div/div/div/div[1]/h1/a/i")).isDisplayed();
		
		//System.out.println(b);
		
		driver.findElement(By.id("email")).click();
		
		driver.findElement(By.id("email")).sendKeys("a1995singh@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("abhisingh1234");
		
		driver.findElement(By.partialLinkText("Log In")).click();
		
		driver.findElement(By.id("email")).click();
		
		driver.findElement(By.id("email")).sendKeys("a1995singh@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("abhisingh1234");
		
		driver.findElement(By.id("loginbutton")).click();
		
		driver.findElement(By.id("userNavigationLabel")).click();
		
		System.out.println("User is logged in successfully");
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Settings') and @class='_54nh']")));
		
	    driver.findElement(By.xpath("//span[contains(text(), 'Log') and @class='_54nh']")).click();			
		
		System.out.println(" 2 User is loggedout successfully");
		
		//driver.close();
	
	}
}
