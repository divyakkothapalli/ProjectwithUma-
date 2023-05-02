package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_GreenMountain {

	public static void main(String[] args) throws InterruptedException {
		//Create WebDriver object and open Chromebrowser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://myaccount.greenmountain.com/en_US/register");
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(7000);
		driver.quit();
		

	}

}
