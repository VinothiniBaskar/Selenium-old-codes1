package week3.day3.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//find the element by using xpath
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		//create an Alert interface and use switchTo method ,its for move to the alert box
		Alert alert=driver.switchTo().alert();
		//enter the text in the textbox
		alert.sendKeys("TestLeaf");
		//Accept the option in alert box
		alert.accept();
		//Get the text after the accept the alert
		String text=driver.findElement(By.id("result1")).getText();
		//print the accepted alert message
		System.out.println("The Alert message is :"+text);

	}

}
