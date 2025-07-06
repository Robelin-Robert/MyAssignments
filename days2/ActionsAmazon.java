package fourthWeek.days2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionsAmazon {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--start-maximized");
		ChromeDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price']//ancestor::a)[1]"));
		String priceText = price.getText();
		System.out.println(priceText);
		WebElement customer = driver.findElement(By.xpath("(//span[contains(@class,'a-size-small')]//parent::a)[1]"));
		String customerRating = customer.getText();
		System.out.println("print the number of customer Rating:"+" "+customerRating);
		
		driver.findElement(By.xpath("(//h2[contains(@class,'a-size-medium')]//span[text()])[1]")).click();
		Thread.sleep(2000);		
		
		
		File src= driver.getScreenshotAs(OutputType.FILE);
		File des= new File("./snap/phoneimg.png");
		FileUtils.copyFile(src, des);
		
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		WebElement cartText = driver.findElement(By.xpath("(//span[contains(@class,'a-price')]//child::span[@class='a-offscreen'])[1]"));
		String CartValue = cartText.getText();
		System.out.println(CartValue);
		
	
		
	}

}
