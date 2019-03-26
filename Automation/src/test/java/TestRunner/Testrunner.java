package TestRunner;
	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	public class Testrunner {

	@RunWith(Cucumber.class)
	@CucumberOptions(  
		    features = "src/test/java/Features",
		    glue="StepDefination")
	public class TestRunner   {

	}


}