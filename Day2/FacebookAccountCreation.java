package secondWeek.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Select sc;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		
		
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("test2");
		driver.findElement(By.name("reg_email__")).sendKeys("9790123423");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Today@007");
		
		WebElement dropdown=driver.findElement(By.id("day"));
		sc= new Select(dropdown);
		sc.selectByVisibleText("16");	
		
		WebElement dropdown1=driver.findElement(By.id("month"));
		sc= new Select(dropdown1);
		sc.selectByValue("6");	
		
		WebElement year=driver.findElement(By.id("year"));
		sc= new Select(year);
		sc.selectByIndex(4);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.close();
		
		}

}
