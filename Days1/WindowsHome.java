package fourthWeek.Days1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHome {
	
	public static void main(String[] args) {
		
		//initialize the chromedriver
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//pass the credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@id='label']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//selecting contact and merge contact tab
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		
		// select the first widget and selecting the data from the list 
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> tabs= new ArrayList(windowHandles);
		driver.switchTo().window(tabs.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3')]//following::a[@class='linktext'])[1]")).click();
		
		// back to the parent window
		driver.switchTo().window(tabs.get(0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Select the second widget
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> tabs1= new ArrayList(windowHandles1);
		driver.switchTo().window(tabs1.get(1));
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3')]//following::a[@class='linktext'])[1]")).click();
		
		//back to the parent window
		driver.switchTo().window(tabs1.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert ac=driver.switchTo().alert();
		ac.accept();
		String title = driver.getTitle();
		System.out.println("This will the print the current title: "+title);
	}

}
