package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		String Alerttext = driver.switchTo().alert().getText();
		System.out.println(Alerttext);
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
