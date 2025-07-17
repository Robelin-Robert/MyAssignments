package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests {
public static WebDriver driver;

@BeforeMethod
public void preCondition() {
	ChromeOptions options= new ChromeOptions();
	options.addArguments("guest");
	driver= new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
}

@AfterMethod
public void postCondition() {
	driver.close();
}

}
