package secondWeek.Days3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		String text=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if(text.equalsIgnoreCase("checked")) {
			System.out.println("The expected message is displayed");
		}else {
			System.out.println("The expected message is not displayed");
		}
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'col')]//div[@class='ui-chkbox ui-widget'])[6]")).click();
		
		String text1=driver.findElement(By.xpath("//span[text()='State has been changed.']")).getText();
		if(text1.equalsIgnoreCase("State")) {
			System.out.println("The expected message is displayed");
		}else {
			System.out.println("The expected message is not displayed");
		}
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String text3=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if(text3.equalsIgnoreCase("checked")) {
			System.out.println("The expected message is displayed");
		}else {
			System.out.println("The expected message is not displayed");
		}
		
		boolean displayed = driver.findElement(By.xpath("(//div[contains(@class,'col')]//div[contains(@class,'ui-selectbooleancheckbox')])[3]")).isDisplayed();	
		if(displayed == false) {
			System.out.println("check box is display");
		}else {
			System.out.println("check box is not display");
		}
	}

}
