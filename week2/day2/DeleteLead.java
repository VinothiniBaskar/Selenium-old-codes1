package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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

		// Click the Find Leads by using LinkText Locator
		driver.findElement(By.linkText("Find Leads")).click();

		// Click the phone
		driver.findElement(By.xpath("//span[text()='Email']")).click();

		// Enter the email id
		driver.findElement(By.name("emailAddress")).sendKeys("vinothini9198@gmail.com");

		// Click the find Leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Click the first data
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();

		// Click the delete button using xpath
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();

		// Print the title of the window
		System.out.println(driver.getTitle());

	}

}
