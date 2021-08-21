package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String titleofthepage = driver.getTitle();
		System.out.println(titleofthepage);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		String HomePageTitle = driver.getTitle();
		System.out.println(HomePageTitle);

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestleafTraining");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sudha");

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceselect = new Select(source);
		sourceselect.selectByIndex(1);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sudha");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("seleniumTraining");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QAEngineer");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");

		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sourceInd = new Select(Industry);
		sourceInd.selectByValue("IND_AEROSPACE");

		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sourceOwn = new Select(Ownership);
		sourceOwn.selectByVisibleText("Partnership");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("624083");
		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("Monitor and supervises a group of employees to acheive a goal");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Skill in Selenium and Java");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Moorthy");

		WebElement marketingcampaginId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select selmarketcampaginId = new Select(marketingcampaginId);
		selmarketcampaginId.selectByVisibleText("Affiliate Sites");

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Moorthy");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/04/1990");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		WebElement selcurency = driver.findElement(By.name("currencyUomId"));
		Select selcur = new Select(selcurency);
		selcur.selectByValue("USD");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Positive");

		// Contact Information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("USA");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("United states of America");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sudhatamilselvan7@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6380738621");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("James");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://gmail.com");

		// Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sudha");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("West car street");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("united states");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("624001");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("US");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("john");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("East Car Street");

		WebElement leadState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateselect = new Select(leadState);
		stateselect.selectByVisibleText("Alabama");

		WebElement selcountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select selcountryoflead = new Select(selcountry);
		selcountryoflead.selectByVisibleText("United States");

		driver.findElement(By.name("submitButton")).click();

		WebElement fname = driver.findElement(By.id("viewLead_firstName_sp"));
		System.out.println("Firstname:" + fname.getText());

		String resultingpage = driver.getTitle();
		String titleofresultpage = "View Lead | opentaps CRM";
		if (titleofresultpage.equalsIgnoreCase(resultingpage)) {
			System.out.println("title is matched");
		} else {
			System.out.println("title is not matched");
		}

	}
}
