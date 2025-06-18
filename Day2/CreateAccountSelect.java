package secondWeek.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/.");
	Select ss;
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	
	driver.findElement(By.id("accountName")).sendKeys("Test40");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	WebElement industry = driver.findElement(By.name("industryEnumId"));
	ss=new Select(industry);
	ss.selectByIndex(2);
	
	
	WebElement owner = driver.findElement(By.name("ownershipEnumId"));
	ss=new Select(owner);
	ss.selectByVisibleText("S-Corporation");
	
	WebElement source = driver.findElement(By.name("dataSourceId"));
	ss=new Select(source);
	ss.selectByValue("LEAD_EMPLOYEE");
	
	
	WebElement market = driver.findElement(By.name("marketingCampaignId"));
	ss=new Select(market);
	ss.selectByIndex(5);
	
	
	
	WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
	ss=new Select(state);
	ss.selectByValue("TX");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String text = driver.findElement(By.xpath("//span[contains(text(),'Test')]")).getText();
	String[] split = text.split(" ");
	if(split[0].equals("Test40")) {
		
		System.out.println("The created account name is same");
		
	}else {
		System.out.println("The created account name is not same");
	}
	
	driver.close();
	
}
}
