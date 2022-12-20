package week4.day2.actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActionsDarg {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//dragAndDropBy using Actions 
		WebElement drag = driver.findElement(By.id("form:conpnl_header"));
		Actions builder=new Actions(driver);
		Point axes=drag.getLocation();
		int x=axes.getX();
		int y=axes.getY();
		builder.dragAndDropBy(drag, x, y).perform();
		
		//Draggable  columns using Actions
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Category']"));
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Name']"));
		builder.clickAndHold(element2).moveToElement(element1).perform();
		
		WebElement drag1= driver.findElement(By.xpath("//span[text()='Columns reordered']"));
		
		
		String  text = drag1.getText();
		if (text.contains("Columns reordered")) {
			System.out.println("Record is  succesfully moved");
			
		}
		else {
			System.out.println("Record is  not  moved");
		}
		
	}

}
