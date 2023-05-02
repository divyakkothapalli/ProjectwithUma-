package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Blazedemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Paris");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
		driver.findElement(By.id("inputName")).sendKeys("Atharva");
		driver.findElement(By.name("address")).sendKeys("1243 Mitcham road");
		driver.findElement(By.name("city")).sendKeys("Khammam");
		driver.findElement(By.id("state")).sendKeys("Jersey");
		driver.findElement(By.name("zipCode")).sendKeys("20134");
		new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("American Express");
		driver.findElement(By.name("creditCardNumber")).sendKeys("123456789101");
		driver.findElement(By.name("creditCardMonth")).sendKeys("10");
		driver.findElement(By.name("creditCardYear")).sendKeys("2023");
		driver.findElement(By.id("nameOnCard")).sendKeys("Jaydev");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		String Textmsg = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		System.out.println(Textmsg);
		String Tabledata = driver.findElement(By.xpath("//table[@class='table']")).getText();
		System.out.println(Tabledata);
		//driver.switchTo().alert().dismiss();
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
