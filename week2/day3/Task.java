package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch URL "https://leafground.com/checkbox.xhtml"
		driver.get("www.google.com");
		driver.manage().window().maximize();
	}

}
