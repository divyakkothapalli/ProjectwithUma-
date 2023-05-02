package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class TTDAnnotations {
		WebDriver driver;
		
	  @BeforeClass
	  public void beforeClass() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	
	  @Test
	  public void f() throws InterruptedException {
		  driver.get("https://tirupatibalaji.ap.gov.in/#/login");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='container']/div/div[11]/div[2]/div/div[1]/ul/li[1]/a")).click();
			Thread.sleep(6000);
	  }
	  @AfterMethod
	  public void afterMethod() throws IOException {
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(".\\Screenshots\\testeg.png"));
	  }


  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
