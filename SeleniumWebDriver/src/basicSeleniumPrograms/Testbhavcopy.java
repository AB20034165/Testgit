package basicSeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbhavcopy {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium program\\SeleniumWebDriver\\drivers\\chromedriver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mcxindia.com/market-data/bhavcopy");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		driver.findElement(By.xpath("//select[@title='Change the month']")).click();
		
		driver.findElement(By.xpath("//option[contains(text(),'October')]")).click();
		
		driver.findElement(By.xpath("//select[@title='Change the year']")).click();
		
		driver.findElement(By.xpath("//option[contains(text(),'2018')]")).click();
		
		driver.findElement(By.xpath("//a[@title='Select Tuesday, Oct 2, 2018']")).click();
		
		driver.findElement(By.xpath("//a[@id='btnShowDatewise']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//a[@id='cph_InnerContainerRight_C001_lnkExpToExcel']")).click();
		
		System.out.println("File is downloaded");
		
		

	}

}
