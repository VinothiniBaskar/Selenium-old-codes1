package VerificationSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/");

		// Enter username and password by using id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button by using classname Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click the Text by using LinkText Locator
		driver.findElement(By.linkText("CRM/SFA")).click();

		// print the current page the title by using getTitle|() method
		String title = driver.getTitle();
		System.out.println("The title is :" + title);
		// verify the title
//		if (title.contains("TestLeaf")) {
//			System.out.println("I confirm the title has TestLeaf");
//
//		} else {
//			System.out.println(" The title does not have the word TestLeaf");
//
//		}
		// Get the current system URl of this browser
		String url = driver.getCurrentUrl();
		System.out.println("The URL is :" + url);

		// Get the source code of the last loading page of site ,it returns a DOM
		// elements (Tags link html,body)
//		String src=driver.getPageSource();
//		System.out.println("The source is :"+src);

		// Verify the value of that attribute ,here value is a attribute and TestLeaf is
		// a value of that attribute
//		String w=driver.findElement(By.name("USERNAME")).getAttribute("name");
//		System.out.println(w);
//		String w1=driver.findElement(By.className("decorativeSubmit")).getAttribute("value");
//		System.out.println(w1);

		// Without click the linktext url it is going to predict which page by using
		// getAttribute method
//		String ur1 = driver.findElement(By.linkText("CRM/SFA")).getAttribute("href");
//		System.out.println(ur1);

		// Verify the value of that attribute ,here value is a attribute and TestLeaf is
		// a value of that attribute
//		String w = driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).getAttribute("value");
//		System.out.println(w);

		// Get the color of the attribute in the form of rgba
//		String color = driver.findElement(By.xpath("//form[@id='logout']/input")).getCssValue("background-color");
//		System.out.println(color);

		// Get the text of the attribute or tag
//		String str = driver.findElement(By.linkText("CRM/SFA")).getText();
//		System.out.println(str);

		// Get the location of the page(top left hand and it return s a point of x axes
		// and y axes)
//		Point point=driver.findElement(By.linkText("Create Lead")).getLocation();
//		System.out.println("The Loaction of X and Y is"+point);
		
		//Get the height and width of  the element
//		System.out.println(driver.findElement(By.linkText("Create Lead")).getSize().getHeight());
//		System.out.println(driver.findElement(By.linkText("Create Lead")).getSize().getWidth());
	
	    //Get the tag name of the element
		System.out.println(driver.findElement(By.linkText("Create Lead")).getTagName());
		
		//If the element is there in the DOM it returns true,otherwise it returns false
		System.out.println(driver.findElement(By.linkText("Create Lead")).isDisplayed());
		
//		//If the element is there in the DOM it returns true,otherwise it returns false(error occurred as NOSUCHElement found exception)
//		System.out.println(driver.findElement(By.linkText("Create Lead1")).isDisplayed());

		driver.quit();



	}
  
}
