package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		//Verify  the value of that attribute ,here value is a attribute and TestLeaf is a value of that attribute 
		String w=driver.findElement(By.name("USERNAME")).getAttribute("name");
		System.out.println(w);

	}

}
