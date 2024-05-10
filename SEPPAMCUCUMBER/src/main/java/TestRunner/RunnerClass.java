package TestRunner;




import io.cucumber.junit.CucumberOptions;
@CucumberOptions(
	features = {"src/test/resources/Features/Seppam.feature"},
		dryRun = !true,
		//snippets = SnippetType.CAMELCASE,
		monochrome = true,
		glue = { "StepDefinition"},
		plugin = {"json:target/cucumber.json", "pretty", "html:target/cucumber-reports"})
			//	plugin = { "pretty","html:target/cucumber-report.html","json:JSON_OUTPUT"}
		/*plugin =  {"pretty","html:target/Seppam-Reports/index.html",
				"json:report/result.json",
		"junit:report/result.xml"}
	//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
//		plugin = {"pretty", "html:CucumberReports",
//				"json:reports/result.json",
//				"junit:reports/result.xml"}
//		tags = {"@smoke and  @reg"}*/
	
public class RunnerClass  {

}
