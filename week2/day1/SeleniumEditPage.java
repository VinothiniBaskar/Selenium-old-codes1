package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumEditPage {

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
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Baskaran");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("B.Tech IT");
		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("I am completed B.Tech IT and currenly  doing Selenium WebDriver course");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinothini9198@gmail.com");

		// Click the CreateLead button by using name Locator
		driver.findElement(By.name("submitButton")).click();

		// Click the Edit button by using LinkText Locator
		driver.findElement(By.linkText("Edit")).click();

		// Clear the description field by using id Locator and Clear method
		driver.findElement(By.id("updateLeadForm_description")).clear();

		// Enter the importantNote by using id Locator
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("I am interested to learn Software Testing");

		// Click the update by using name Locator
		driver.findElement(By.name("submitButton")).click();
		
		String title=driver.getTitle();
		System.out.println(title);


	}

}
