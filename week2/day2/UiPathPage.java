package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiPathPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch URL "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");

		// Enter email id and password by using Locators
		driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("leaf@12");

		// Click the login button by using xpath
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		// Click the logout button by using Locator
		driver.findElement(By.linkText("Log Out")).click();

		// Print the title of the window
		System.out.println(driver.getTitle());

		// close the browser by using close method
		driver.close();

	}

}
