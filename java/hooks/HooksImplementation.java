package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.ProjectSpecificMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksImplementation extends ProjectSpecificMethod{
	
	
	
	@BeforeStep
	public void slowMo() throws InterruptedException {
		Thread.sleep(500);
	}
	
	
}
