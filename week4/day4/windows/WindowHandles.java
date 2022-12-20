package week4.day4.windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0oj7dltffmqes117xjpyw1f2h2369358.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Parent window
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		String title = driver.getTitle();
		System.out.println("The Parent window title is :" + title);

		// to get all the window handles
		Set<String> windowHandles = driver.getWindowHandles();
		// convert it to list for getting particular window
		List<String> handles = new ArrayList<String>(windowHandles);
//		System.out.println(handles);

		// move the control to the second window
		driver.switchTo().window(handles.get(1));
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
		
		
		//Get the title of second window           
		String title1 = driver.getTitle();
		System.out.println("The child window title is :" + title1);
		
		if (title.equals(title1)) {
			System.out.println("Controls stay in same page");
			
		}
		else {
			System.out.println("Controls switched to  next page");

		}
		
		//It is used to close the last opended window
		driver.close();
		//It is used to close the all the window
		driver.quit();

	}

}
