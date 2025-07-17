package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends ProjectSpecificMethod {
//	WebDriver driver;
	@Given("the user establishes the environment")
	public void the_user_establishes_the_environment() {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("guest");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}

	@Given("the user loads url")
	public void the_user_loads_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("one"+driver);
	}

	@When("the user enters the username as DemoSalesManager")
	public void the_user_enters_the_username_as_demo_sales_manager() {
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

	@When("the user enters the password as crmsfa")
	public void the_user_enters_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("the user should be navigated to the Welecome page")
	public void the_user_should_be_navigated_to_the_welecome_page() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	

		}


