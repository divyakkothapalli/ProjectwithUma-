package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_CollegeWeek {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriver Select;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(7000);
		driver.findElement(By.name("firstName")).sendKeys("Divya");
		driver.findElement(By.name("lastName")).sendKeys("kotha");
		driver.findElement(By.name("emailAddress")).sendKeys("divya@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("7703645278");		
		driver.findElement(By.name("password")).sendKeys("Kotha@");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Kotha@");
		Select se = new Select(driver.findElement(By.id("country")));
		se.selectByVisibleText("UNITED STATES");
		Select le = new Select(driver.findElement(By.name("attendeeType")));
		le.selectByIndex(1);
		
		
		
		driver.findElement(By.name("questions[q_135]")).click();
		driver.findElement(By.name("questions[q_136]")).click();
		driver.findElement(By.name("questions[q_137]")).click();
		driver.findElement(By.id("submit")).click();
		
		
		

	}

}
