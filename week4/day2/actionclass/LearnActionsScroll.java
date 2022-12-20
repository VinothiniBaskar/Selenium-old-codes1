package week4.day2.actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActionsScroll {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement scroll = driver
				.findElement(By.xpath("//div[@class='navFooterLinkCol navAccessibility'][2]//div[1]"));
		Actions builder = new Actions(driver);
//		builder.scrollToElement(scroll).perform();
		String text = scroll.getText();
		System.out.println(text);

	}

}
