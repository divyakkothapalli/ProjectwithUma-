package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7_2_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup");
		Thread.sleep(6000);
		Select se =	new Select(driver.findElement(By.xpath("//*[@id='register']/div[4]/div[2]/div/div/select")));
		se.selectByVisibleText("Student Looking for Graduate Degree");
		Thread.sleep(6000);
		List <WebElement> op = se.getOptions();
		int size = op.size();
		for (WebElement webElement : op) {
			String abc = webElement.getText();
			System.out.println(abc);
			
		}
		
		

		
		

	}

}
