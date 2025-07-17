package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {"src/test/java/features/CreateLeadModule.feature"},glue = {"steps","hooks"},
dryRun=false,monochrome = true, publish = true,tags = "@negative" )
public class Tc001_CreatLead extends ProjectSpecificMethod{

	
	
}
