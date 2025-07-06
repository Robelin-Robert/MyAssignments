package fourthWeek.days2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAlert {
	
	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions ac= new Actions(driver);
		WebElement findElement = driver.findElement(By.xpath("//li[@class='nav_first']//following::a[contains(text(),'Conditions')]"));
		ac.scrollToElement(findElement).perform(); 
		String text = driver.findElement(By.xpath("//li[@class='nav_first']//following::a[contains(text(),'Conditions')]")).getText();
		System.out.println("Test of the clicked webelement: " +text);
		
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
		File des= new File("./snap/amazoncontacts.png");
		
		FileUtils.copyFile(screenshotAs, des);
		
		driver.close();
	}

}
