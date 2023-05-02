package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		
		
			WebDriver driver;	
			WebDriver Select;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.navigate().to(" https://blazedemo.com/");
			driver.manage().window().maximize();
			//Actions act = new Actions(driver);
			Thread.sleep(3000);
			String fromcity = driver.findElement(By.name("fromPort")).getText();
			System.out.println("From cities:\n " +fromcity);
			Thread.sleep(5000);
			//Select your Departure city from the dropdown list
			String tocity = driver.findElement(By.name("toPort")).getText();
			System.out.println("To cities:\n  " +tocity);
			Thread.sleep(3000);
			Select drpdown = new Select(driver.findElement(By.name("fromPort")));
			drpdown.selectByVisibleText("Philadelphia");
			//Select your destination city from the dropdown list 
			Select drpdown2 =  new Select(driver.findElement(By.name("toPort")));
			drpdown2.selectByVisibleText("Rome");
			//System.out.println(drpdown2);
			driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
			Thread.sleep(5000);
			String txt = driver.findElement(By.xpath("/html/body/div[2]/h3")).getText();
			System.out.println(txt+"\n");  
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("inputName")).sendKeys("divyakanishk");
			driver.findElement(By.id("address")).sendKeys("123 main opp st");
			driver.findElement(By.id("city")).sendKeys("Aldie");
			driver.findElement(By.id("state")).sendKeys("Virginia");
			driver.findElement(By.id("zipCode")).sendKeys("20105");
			Thread.sleep(3000);
			//Selecting the dropdowm list using Xpath.
			Select items = new Select(driver.findElement(By.xpath("//*[@id='cardType']")));
			//getting the list of items using <list>WebElement
		   	List<WebElement> itemlist = items.getOptions();
		   	System.out.println("The dropdown options are: ");
		   	//printing the WebElements using for loop
		    for(WebElement options: itemlist) {
		        System.out.println(options.getText());
		    }
		    //Select the dropdown list by index and printing the option 
		    items.selectByIndex(1);
		    System.out.println("selected option is: "+items.getFirstSelectedOption().getText());
		    driver.findElement(By.id("creditCardNumber")).sendKeys("13281638");
		    driver.findElement(By.id("creditCardMonth")).sendKeys("10");
		    driver.findElement(By.id("creditCardYear")).sendKeys("2022");
		    driver.findElement(By.id("nameOnCard")).sendKeys("Divyakanishk");
		    driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		    String lsttxt = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		    System.out.println(lsttxt +"\n");
		    String displaytxt= driver.findElement(By.xpath("//table[@class='table']")).getText();
		    System.out.println(displaytxt);
		
		

	}

}
