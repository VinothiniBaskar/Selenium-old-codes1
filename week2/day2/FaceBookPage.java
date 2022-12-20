package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Launch URL "https://acme-test.uipath.com/login"
		driver.get("https://en-gb.facebook.com/");

		// Click the create button
		driver.findElement(By.partialLinkText("Create New ")).click();

		// Enter the firstname , lastname,mobile number,password
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vinothini");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Baskaran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8610284950");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("vinothini@123");

		// Dropdown
		WebElement text = driver.findElement(By.id("day"));
		Select s1 = new Select(text);
		s1.selectByIndex(8);

		WebElement text1 = driver.findElement(By.id("month"));
		Select s2 = new Select(text1);
		s2.selectByValue("1");

		WebElement text2 = driver.findElement(By.id("year"));
		Select s3 = new Select(text2);
		s3.selectByVisibleText("1998");

		// Click the Signup button by using xpath
		driver.findElement(By.xpath("//button[@name='websubmit'] ")).click();

		System.out.println(driver.getTitle());

	}

}
