package testScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotex {

		
		public static void main() throws InterruptedException, AWTException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://tirupatibalaji.ap.gov.in/#/login");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='container']/div/div[11]/div[2]/div/div[1]/ul/li[1]/a")).click();
			
//			Robot rb = new Robot();
//			rb.keyPress(KeyEvent.VK_WINDOWS);
//			rb.keyPress(KeyEvent.VK_PRINTSCREEN);
//			rb.keyRelease(KeyEvent.VK_PRINTSCREEN);
//			rb.keyRelease(KeyEvent.VK_WINDOWS);
				
			
			
			
			

	}

}
