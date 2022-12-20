package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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

		// Click the contact button by using id Locator
		driver.findElement(By.linkText("Create Contact")).click();

		// Enter the firstname,lastname by using Id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Vinothini");
		driver.findElement(By.id("lastNameField")).sendKeys("Baskaran");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Vino");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Baskar");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("B.Tech IT");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vinothini9198@gmail.com");
		driver.findElement(By.name("description"))
				.sendKeys("I am completed B.Tech IT and currenly  doing Selenium WebDriver course");

		// Drop Down
		WebElement w = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select s1 = new Select(w);
		s1.selectByVisibleText("New York");

		// Click the create contact button using name Locator
		driver.findElement(By.name("submitButton")).click();

		// Click the edit button by using id Locator
		driver.findElement(By.linkText("Edit")).click();

		// Clear the description field by using CLear method
		driver.findElement(By.name("description")).clear();

		// Enter the important note by using id Locator updateContactForm_importantNote
		driver.findElement(By.id("updateContactForm_importantNote"))
				.sendKeys("I am interested to learn Software Testing");

		// click the update button by using xpath
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		// Print the title of the window
		System.out.println(driver.getTitle());

	}

}
