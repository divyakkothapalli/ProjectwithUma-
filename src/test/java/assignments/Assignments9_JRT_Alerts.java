package assignments;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignments9_JRT_Alerts {
	
			public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.justrechargeit.com/SignIn.aspx");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.name("txtUserName")).sendKeys("divyakkothapalli@gmail.com");
			driver.findElement(By.name("txtPasswd")).sendKeys("082516");
			Thread.sleep(20000);
			Scanner s = new Scanner(System.in);
			Thread.sleep(5000);
			driver.findElement(By.name("txtCaptcha")).sendKeys(s.next());
			Thread.sleep(3000);
			driver.findElement(By.name("imgbtnSignin")).click();	
			driver.findElement(By.xpath("//*[@id='listingtable_btnGridDelete_4']")).click();
			String abc = driver.switchTo().alert().getText();
			System.out.println(abc);
			driver.switchTo().alert().accept();
			
		
		
		

	}

}
