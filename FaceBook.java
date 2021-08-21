package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement CAccount=driver.findElement(By.partialLinkText("Account"));
		CAccount.click();
		
		driver.findElement(By.name("firstname")).sendKeys("Test1");
		driver.findElement(By.name("lastname")).sendKeys("1");
		driver.findElement(By.name("reg_email__")).sendKeys("1111111111");
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");
		
		
		WebElement Date=driver.findElement(By.id("day"));
		Select dat=new Select(Date);
		dat.selectByIndex(9);
		
		WebElement Month=driver.findElement(By.id("month"));
		Select Mon=new Select(Month);
		Mon.selectByValue("4");
		
		WebElement Year=driver.findElement(By.id("year"));
		Select YY=new Select(Year);
		YY.selectByVisibleText("1990");
		
		WebElement Gender=driver.findElement(By.xpath("//input[@value='1']"));
		Gender.click();	
		
		WebElement signup=driver.findElement(By.name("websubmit"));
		signup.click();
		
		
	}

}
