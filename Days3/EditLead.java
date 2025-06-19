package secondWeek.Days3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/.");
		Select sc;
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//child::table//following::input[@class='inputBox'])[1]")).sendKeys("ARC");
		driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//child::table//following::input[@class='inputBox'])[3]")).sendKeys("Jhon");
		driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//child::table//following::input[@class='inputBox'])[4]")).sendKeys("smith");
		driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//child::table//following::input[@class='inputBox'])[5]")).sendKeys("Arc1");
		driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//child::table//following::input[@class='inputBox'])[10]")).sendKeys("probe");
		driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//child::table//following::textarea[@class='inputBox'])[1]")).sendKeys("Enter the correct data");
		driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//child::table//following::input[@class='inputBox'])[20]")).sendKeys("testleaf@123.com");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		
		sc=new Select(dropdown);
		sc.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//child::table//following::textarea[@class='inputBox'])[1]")).sendKeys("data has changed to the perfectdata");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title = driver.getTitle();
		if(title.contains("View Lead")){
			System.out.println("The result page is same");
			
		}else {
			System.out.println("The result page is not same");
		}
		driver.close();
	}

}
