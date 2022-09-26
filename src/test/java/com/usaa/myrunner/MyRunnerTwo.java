package com.usaa.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "./Features",
		glue = "com.usaa.stepdef"
		//tags = "@Smoke"
		
		
		)

public class MyRunnerTwo extends AbstractTestNGCucumberTests{

}
