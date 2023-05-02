package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5_JustRechargeIt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.justrechargeit.com/");
		//Click on Create new Account
		driver.findElement(By.id("signup-link9")).click();
		//Enter Dummy name 
		driver.findElement(By.name("signup_name")).sendKeys("dummy");
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		
		
		
		
		
		
		

	}

}
