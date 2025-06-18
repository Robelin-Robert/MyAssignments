package secondWeek.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAccount {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/.");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("demo");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("name");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation");
		String title2=	driver.getTitle();
		if(title2.contains("Creat")) {
			System.out.println("The page is matached");
		}else {
			System.out.println("The page is not matached");
		}
		driver.close();
	}

}
