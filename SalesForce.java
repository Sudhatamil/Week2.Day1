package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Sudha");
		driver.findElement(By.name("UserLastName")).sendKeys("Moorthy");
		driver.findElement(By.name("UserEmail")).sendKeys("sudhatamilselvan7@gmail.com");
		
		WebElement jobtitle=driver.findElement(By.name("UserTitle"));
		Select sel=new Select(jobtitle);
		sel.selectByVisibleText("Sales Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Inurance Company");
		WebElement employess=driver.findElement(By.name("CompanyEmployees"));
		Select selemployees=new Select(employess);
		selemployees.selectByValue("75");

		driver.findElement(By.name("UserPhone")).sendKeys("6380738621");
		WebElement country=driver.findElement(By.name("CompanyCountry"));
		Select selcountry=new Select(country);
		selcountry.selectByVisibleText("India");
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		
		
		

	}

}
