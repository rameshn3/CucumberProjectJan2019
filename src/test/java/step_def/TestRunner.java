package step_def;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipseworkspaceAug2018\\January3CucumberFrmwork2019\\src\\main\\java\\Feature\\datatables.feature",
				 glue={"step_def"},
				plugin={"pretty","html:D:\\eclipseworkspaceAug2018\\January3CucumberFrmwork2019\\target", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
				dryRun=false, //mapping between feature & stepdefinition is proper or not
				strict=true, //it will check if any step is not defined in stepdefinition file
				monochrome=true  //display the console output in a proper readable format
		)
public class TestRunner {

}

