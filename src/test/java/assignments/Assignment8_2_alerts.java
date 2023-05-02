package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8_2_alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(9000);
//		driver.switchTo().alert().accept();
//		String txt3 = driver.findElement(By.id("confirmResult")).getText();
//		System.out.println("Text from 3rd click:    " +txt3);
		Thread.sleep(5000);	
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Divya");
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		String data = driver.findElement(By.id("promptResult")).getText();
		System.out.println("Entered data is :" +data);
		
		
		
	}

}
