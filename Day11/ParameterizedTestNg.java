package fifthWeek.Day11;

import java.sql.Driver;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class ParameterizedTestNg {
	
	public static RemoteWebDriver driver;
	
	@Parameters({"url","uname","pname","browser"})
	@BeforeMethod
	
	public void precondition(String url,String uname, String pname, String browser) {
	System.out.println("Test data is pass from the xml file is \n url: "+url +"\n username: "+uname +"\n password: "+pname+"\n browser is:"+browser );
	switch (browser.toLowerCase()) {
	case "edge":
		driver= new EdgeDriver();
		break;
	case "firefox":
		driver= new FirefoxDriver();
		break;	
	default:
		ChromeOptions option= new ChromeOptions();
		option.addArguments("guest");
		driver= new ChromeDriver(option);
		
		break;
	}
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pname);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	
}
	@AfterMethod
	public void postcondition() {
		driver.quit();
	}
}
