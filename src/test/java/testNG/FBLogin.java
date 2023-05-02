package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FBLogin {
	
	  @Test
	  public void f() throws AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("divyakkothapalli@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("L0veur$elf");
		driver.findElement(By.name("login")).click();
//		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_WINDOWS);
//		rb.keyPress(KeyEvent.VK_PRINTSCREEN);
//		rb.keyRelease(KeyEvent.VK_PRINTSCREEN);
//		rb.keyRelease(KeyEvent.VK_WINDOWS);
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(".\\Screenshots\\fbscr.png"));
		
  }
}
