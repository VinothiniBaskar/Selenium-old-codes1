package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://www.leafground.com/select.xhtml");
		

		// Give the implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement text = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select s = new Select(text);
		
		
		List<WebElement> options=s.getOptions();
//		//select all the options
//		for (int i = 1; i < options.size(); i++) {
//			options.get(i).click();
//			System.out.println(options.get(i).getText());			
//		}
		//Select 2 
		for (int i = 1; i < options.size(); i++) {
			if(i==2)
			options.get(i).click();
			
		}
//		for (int i = 1; i < options.size(); i++) {
//			if(i==2 && i==3)
//			options.get(i).click();
//			
//		}
		
       
	}

}
