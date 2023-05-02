package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8_1_alerts2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(9000);
		String Text = driver.switchTo().alert().getText();
		System.out.println(Text);
		driver.switchTo().alert().accept();
		driver.quit();
		
		
		
		
	}

}
