package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplusPro",Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='a-price-whole']")).click();
//		driver.findElement(By.xpath("//span[text()='29,990']")).getText();
        String text=driver.findElement(By.xpath("//span[text()='29,990']")).getText();
        System.out.println(text);

       
		
		

	}

}
