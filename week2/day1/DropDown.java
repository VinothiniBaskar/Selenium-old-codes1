package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Enter username and password by using id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button by using classname Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click the Text by using LinkText Locator
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click the Lead button by using LinkText Locator
		driver.findElement(By.linkText("Leads")).click();

		// Click the CreateLead button by using LinkText Locator
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter company name,first name,last name,department name,description,email id
		// by using Locators
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Elpis IT Solutions");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinothini");
		;

		// Click the CreateLead button by using name Locator
		driver.findElement(By.name("submitButton")).click();

		// Dropdown

		WebElement text = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select s1 = new Select(text);
		s1.selectByIndex(2);
		

		WebElement text1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select s2 = new Select(text1);
		s2.selectByValue("IND_RETAIL");
		
		WebElement text2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s3 = new Select(text2);
		s3.selectByVisibleText("Alaska"); 
  
	}

}
