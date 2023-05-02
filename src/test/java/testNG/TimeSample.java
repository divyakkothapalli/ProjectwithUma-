package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TimeSample {
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://e.ggtimer.com/");
	  Thread.sleep(5000);
	  driver.findElement(By.id("EggTimer-start-time-input-text")).sendKeys("20");
	  driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/main/div[1]/button")).click();
	  Thread.sleep(10);
	  String gettime = driver.findElement(By.xpath("/html/body/div/div/main/div[1]/div/div[2]/p/span")).getText();
	  System.out.println("Capture time: " +gettime);
	  Thread.sleep(10000);
	  String aftertime = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[1]/div/div[2]/p/span")).getText();
	  System.out.println("After 10sec " +aftertime);
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
