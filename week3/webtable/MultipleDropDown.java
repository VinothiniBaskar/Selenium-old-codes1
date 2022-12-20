package week3.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testleaf.herokuapp.com/pages/Dropdown.html");
		
		 WebElement dropDown=driver.findElement(By.xpath("//div[@class='example'][6]//select"));
		  Select s3=new Select(dropDown);
		  
		  List<WebElement> options=s3.getOptions();
		  
		  for (int i = 0; i < options.size(); i++) {
			  options.get(i).click();
			System.out.println(options.get(i).getText());
		}
		
	}

}
