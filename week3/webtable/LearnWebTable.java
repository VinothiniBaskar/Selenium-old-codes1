package week3.webtable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).sendKeys("CAPE",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//Print the Header name
		WebElement text=driver.findElement(By.xpath("//table//tr//th[2]"));
//		String str=text.getText();
//		System.out.println("The Header of the name is "+str);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));
			List<String> data=new ArrayList<String>();
			for (WebElement each : rows) {
				String str1=each.getText();
//				System.out.println(str1);
				data.add(str1);
			}
			
			System.out.println(data);


		}
	}


