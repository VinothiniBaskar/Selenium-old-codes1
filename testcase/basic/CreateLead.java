package testcase.basic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClassBasic {
	
	
	@Test
	public void createLead() {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vasanth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("89");
		driver.findElement(By.name("submitButton")).click();

	}

}
 
