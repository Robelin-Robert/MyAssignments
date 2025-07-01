package fourthWeek.Days1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//label[text()='FLIGHTS']/parent::a)[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> tabs= new ArrayList(windowHandles);
		driver.switchTo().window(tabs.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Best")) {
			driver.switchTo().window(tabs.get(0));
			driver.close();
			
		}
		
		
		
		
	}

}
