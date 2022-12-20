package week3.webtable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// xpath for get the header of WebElements
		List<WebElement> header = driver.findElements(By.xpath("//table//th"));
		// Get the number of headers in table
		int size = header.size();
		System.out.println("The size of the header is :" + size);

		System.out.println("====================");

		System.out.println("The Header data are");
		System.out.println("====================");

		// Get the text of the all the headers by using for each
		for (WebElement headerData : header) {
			// Get the text of the header
			String text = headerData.getText();
			// print the text
			System.out.println(text);
		}

		// Table Row
		System.out.println("====================");
		System.out.println("The Row data are");
		// xpath for get the row of WebElements
		List<WebElement> rowData = driver.findElements(By.xpath("//table//tr"));
		// Get the number of rows in table
		System.out.println("The number of rows in the table :" + rowData.size());
		// create a empty list
		List<String> listRowData = new ArrayList<String>();
		// create a for loop for printing the data of rows
		// 1st way
		for (int i = 1; i < rowData.size(); i++) {
			// get the data of all the row and store in WebElement
			WebElement eachRow = rowData.get(i);
			// Get the text of row data
			String text2 = eachRow.getText();
			// System.out.println(text2);

			// The data are add in to the list
			listRowData.add(text2);
		}
		// 2 way
//		for (WebElement rowdataeach :rowData ) {
//			String text = rowdataeach.getText();
//			// print the text
//			System.out.println(text);
//		}
//		//3rd way
//		for (int i = 0; i < rowData.size(); i++) {
//			driver.findElement(By.xpath("//table//tr["+i+"]//td["+i+"]"));
//			
//		}
		// print the row data in the list
		System.out.println(listRowData);

		// Get the single value of the particular row--->interview question
		// Here we getting single element so we are using findElement -->2nd row and 1st
		// data
		WebElement firstRowSignleData = driver.findElement(By.xpath("//table//tr[2]//td[1]"));
		String data = firstRowSignleData.getText();
		System.out.println("The first data of 2nd row is :" + data);

		// Get the single value of the particular row--->interview question
		// Here we getting single element so we are using findElement -->2nd row and 2nd
		// data
		WebElement secondRowSignleData = driver.findElement(By.xpath("//table//tr[2]//td[2]"));
		String data1 = secondRowSignleData.getText();
		System.out.println("The second data of 2nd row is :" + data1);

//		// Number of columns and data
//		List<WebElement> columnsData=driver.findElements(By.xpath("//table//tr//td[1]"));
//		List<String> listcolumnsData = new ArrayList<String>();
//		for (int i = 1; i < rowData.size(); i++) {
//			WebElement eachcolumn = columnsData.get(i);
//			String text = eachcolumn.getText();
//			// print the text
////			System.out.println(text);
//			listcolumnsData.add(text);
//		}
//
//		System.out.println(listcolumnsData);

		// Print all the rows and columns in the table
		//iterating the row data using for loop
		for (int i = 1; i <= rowData.size(); i++) {
			//Get the column data in list of web element
			List<WebElement> cols = driver.findElements(By.xpath("//table//tr[" + i + "]//td"));
			//iterating the column data from list of row and cols  list of web element
			for (int j = 1; j <=cols.size(); j++) {
				//Get the text from the  list of web element column data
				String columnData = driver.findElement(By.xpath("//table//tr[" + i + "]//td[" + j + "]")).getText();
				//print the columndata
				System.out.println(columnData);
			}

		}

		// Get the number of Columns in the table by using XPath
		List<WebElement> noOfColumns = driver.findElements(By.xpath("//table//tr//td"));
		// Get the size of the Columns
		int columnsSize = noOfColumns.size();
		System.out.println("The Number of Columns in the Table is :" + columnsSize);
	}

}
