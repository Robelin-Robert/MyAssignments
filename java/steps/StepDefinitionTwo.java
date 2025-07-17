package steps;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionTwo extends ProjectSpecificMethod {
	
	
	@When("the user clicks the crmsfa link")
	public void the_user_clicks_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("two"+driver);
	}
	@When("the user clicks the lead Module")
	public void the_user_clicks_the_lead_module() {
		driver.findElement(By.linkText("Leads")).click();
		
	}

	@When("the user clicks to create Lead from the shortcuts menu")
	public void the_user_clicks_to_create_lead_from_the_shortcuts_menu() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("the user enter the company name as TestLeaf")
	public void the_user_enter_the_company_name_as_test_leaf() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	}

	@When("the user enter the first name as Robelin")
	public void the_user_enter_the_first_name_as_robelin() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Robelin12");
	}

	@When("the user enter the last name as Rob")
	public void the_user_enter_the_last_name_as_rob() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rob");
	}

	@When("the user enter the phone number")
	public void the_user_enter_the_phone_number() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98127");
	}

	@When("the user clicks the createLead button")
	public void the_user_clicks_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("the user should be navigated to the view lead Page")
	public void the_user_should_be_navigated_to_the_view_lead_page() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


}
	@When("the user will get the error message")
	public void the_user_will_get_the_error_message() {
	    System.out.println("The following required parameter is missing");
	}

}
