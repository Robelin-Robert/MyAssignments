package secondWeek.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBookLogin {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		
		System.out.println(title);
		if(title.contains("Log")) {
			System.out.println("The title is matached ");
		}else {
			System.out.println("The title is not matached ");
		}
		
		driver.close();
		
	}
	
	

}
