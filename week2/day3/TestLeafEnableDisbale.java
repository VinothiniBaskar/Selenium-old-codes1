package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafEnableDisbale {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");

		
		//ISENABLED METHOD
		// If the the field is editable ,it returns true
		System.out.println("The Given field is editable :" + driver.findElement(By.name("username")).isEnabled());

		// If the the field is not editable ,it returns False
		System.out.println("The Given field is not  editable :"
				+ driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input"))
						.isEnabled());
		
		//ISDISPLYED METHOD
		//If the element is displayed in DOM it returns true,otherwise returns NOSUCHELEMENT error in console
		
		System.out.println("The Element is diaplyed in DOM :"+driver.findElement(By.id("email")).isDisplayed());
		
		//NOSUCHELEMENT error in console
		System.out.println("The Element is not  diaplyed in DOM :"+driver.findElement(By.id("email1")).isDisplayed());


		
	}
}
