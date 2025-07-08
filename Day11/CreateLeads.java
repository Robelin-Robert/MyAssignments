package fifthWeek.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeads extends ParameterizedTestNg{
	@DataProvider(name="getData")
	public String[][] sendData() {
		String[][] dynamic;// declaration of 2D Array 
		dynamic=new String [2][4];// initialization of 2D Array
		
		dynamic[0][0]="Testleaf";
		dynamic[0][1]="bhuvanesh";
		dynamic[0][2]="moorthy";
		dynamic[0][3]="98127";
		dynamic[1][0]="Testleaf1";
		dynamic[1][1]="bhuvva";
		dynamic[1][2]="moor";
		dynamic[1][3]="98407";
		return dynamic;
	}
	@Test(dataProvider = "getData")
	public void createMethod(String cname,String fname, String lname, String phone) {
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
			
			
		}
	}

}
