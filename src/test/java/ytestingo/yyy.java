package ytestingo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import groovyjarjarpicocli.CommandLine.Parameters;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
@JsonIgnoreProperties(ignoreUnknown = true)
public class yyy {
	
	@Test(groups = {"SMOKE","REG"},invocationCount = 6,successPercentage = 50,alwaysRun = true)
	
	public void TableContent(String browser) throws FileNotFoundException {
		System.out.println(browser);
		Assert.fail();
	}
	
}


