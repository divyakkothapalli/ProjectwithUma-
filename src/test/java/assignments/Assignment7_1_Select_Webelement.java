package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7_1_Select_Webelement {

	public static void main(String[] args) throws InterruptedException {
		//Create a Driver object
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("speed"))).selectByVisibleText("Fast");
		
		new Select(driver.findElement(By.id("files"))).selectByVisibleText("PDF file");
		new Select(driver.findElement(By.id("number"))).selectByVisibleText("4");
		Select a = new Select(driver.findElement(By.id("products")));
		a.selectByVisibleText("Iphone");
		WebElement ele = a.getFirstSelectedOption();
		String selectedoption = ele.getText();
		System.out.println(selectedoption);
		//System.out.println(a);
		Select  e = new Select(driver.findElement(By.id("animals")));
		e.selectByVisibleText("Baby Cat");
		WebElement abc = e.getFirstSelectedOption();
		String option = abc.getText();
		System.out.println(option);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
