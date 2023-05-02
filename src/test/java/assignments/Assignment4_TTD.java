package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_TTD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		Thread.sleep(9000);
		driver.findElement(By.linkText("Sign Up")).click();
		//driver.findElement(By.xpath("regist//*[@id='container']/div/div[11]/div[2]/div/div[1]/form/fieldset[5]/span/aration")).click();
		Thread.sleep(9000);
		driver.findElement(By.id("entity")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys("Doubts");
		
	}

}
