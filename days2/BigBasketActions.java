package fourthWeek.days2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasketActions {
      public static void main(String[] args) throws InterruptedException, IOException {
		
//    	  ChromeDriver driver=new ChromeDriver();
         
            ChromeOptions options = new ChromeOptions();
 			options.addArguments("--start-maximized");
 			ChromeDriver driver= new ChromeDriver(options);
 			driver.get("https://www.bigbasket.com/");
 			
 			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 			driver.findElement(By.xpath("(//span[text()='Category']//preceding-sibling::span)[2]")).click();
 		
 			Actions ac= new Actions(driver);
 			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
 			WebElement filterFood = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='menu']//nav)[1]//child::ul[1]//following-sibling::li//child::a[contains(text(),'Foodgrains, Oil')]")));
// 			WebElement filterFood=driver.findElement(By.xpath("(//nav[@role='none']//child::ul//following-sibling::li)[5]//child::a[contains(text(),'Foodgrains, Oil')]"));
 			ac.moveToElement(filterFood).build().perform();
 			Thread.sleep(1000);
 			WebElement filterRice=driver.findElement(By.xpath("(//div[@role='menu']//nav)[1]//child::ul[2]//following-sibling::li//child::a[contains(text(),'Rice')]"));
 			ac.moveToElement(filterRice).build().perform();
 			Thread.sleep(1000);
 			
 			driver.findElement(By.xpath("(//div[@role='menu']//nav)[1]//child::ul[3]//following-sibling::li//child::a[contains(text(),'Boiled &')]")).click();
 			File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
 			
 			File des= new File("./snap/boiledrice.png");
 			
 			FileUtils.copyFile(screenshotAs, des);
 			Thread.sleep(1000);
 			
 			driver.quit();
      }
}
