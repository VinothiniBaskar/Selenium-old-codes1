package week4.day2.actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActions {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement kidsDress = driver.findElement(By.linkText("KIDS"));
		Actions builder=new Actions(driver);
		builder.moveToElement(kidsDress).perform();
		WebElement toy = driver.findElement(By.linkText("Soft Toys"));
		builder.click(toy).perform();
		
		WebElement image = driver.findElement(By.xpath("//div[@class='imgHolder']"));
		builder.moveToElement(image).perform();
		
		WebElement findElement = driver.findElement(By.xpath("//div[@class='imgHolder']//div"));
		String text=findElement.getText();
		System.out.println(text);
		
		
		
	}

}
