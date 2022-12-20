package testcase.test.read.excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String ExcelFileName) throws IOException {
		// Declare a class for the excel sheet and set the path
		XSSFWorkbook wBook = new XSSFWorkbook("data/"+ExcelFileName+".xlsx");
		// enter in to the sheet -->indext 0 is denotes sheet1 (getSheetAt(index))
		// Read the first sheet1
		XSSFSheet sheet = wBook.getSheetAt(0);

		// From the sheet to get the number of rows in sheet using (getLastRowNum)
		int rowCount = sheet.getLastRowNum();
		System.out.println("The Number of Rows is :" + rowCount);

		// To get number of columns in the sheet
		// From the first row to get last cell count -->we get the number of coumns
		// getRow(0)--> Header -->no need
		// We need getRow(1) and getLastCellNum();
		short columnCount = sheet.getRow(1).getLastCellNum();
		System.out.println("The Number of columns is :" + columnCount);

		// Header data to be printed -->index of row is 0 and column index is 0
		// For row using getRow(0) and getCell(0)-->company name
		XSSFCell headerData = sheet.getRow(0).getCell(0);
		System.out.println("Header1 name  is :" + headerData);
		// header 2 data -->First name
		System.out.println("Header2 name is :" + sheet.getRow(0).getCell(1));
		// header 3 data --->Last name
		System.out.println("Header3 name is :" + sheet.getRow(0).getCell(2));
		// header 4 data --->Phone Number
		System.out.println("Header4 name is :" + sheet.getRow(0).getCell(3));

		// First data to be printed --> index of row is 1 and column 0
		// For row using getRow(1) and getCell(0)-->TestLeaf
		XSSFCell firstData = sheet.getRow(1).getCell(0);
		System.out.println("Company name  is :" + firstData);

		// second data getRow(1) and getCell(1)--->Vinothini
		XSSFCell secondData = sheet.getRow(1).getCell(1);
		System.out.println("First  name  is :" + secondData);

		// Third data getRow(1) and getCell(2)--->Baskaran
		XSSFCell ThirdData = sheet.getRow(1).getCell(2);
		System.out.println("Last name  is :" + ThirdData);

		// Fourth data getRow(1) and getCell(3)--->99.0
		// In excel 99 is staring 99.0 -->To convert it to string give '99
		XSSFCell fourthData = sheet.getRow(1).getCell(3);
		System.out.println("Phone number  is :" + fourthData);

		//Declare a list for storing data
		List<String> list = new ArrayList<String>();
		String[][] data = new String[rowCount][columnCount];
		// Using For Loop we get print all the datas
		// i=0 -->it is 1st row --> Header -->Header data is not needed
		// i=1 get the 2nd row
		for (int i = 1; i <= rowCount; i++) {
			// Create a loop for to get the row value
			XSSFRow row = sheet.getRow(i);
			// System.out.println(row);
			// Create a loop for to get the column data value
			for (int j = 0; j < columnCount; j++) {
				// From the row to get the column data using row.getCell()
				XSSFCell cell = row.getCell(j);
				// System.out.println(cell);
				// Get the text of rows and columns using getStringCellValue()
				String stringCellValue = cell.getStringCellValue();
				list.add(stringCellValue);
				data[i-1][j]=stringCellValue;				// Print the data
				// System.out.println("The Data of the sheet is :" + stringCellValue);

			}
		}
		//Print the data
		System.out.println("Datas are printed using for loop" + list);
		wBook.close();
		return data;
	}

}
