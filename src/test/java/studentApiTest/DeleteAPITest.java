package studentApiTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.APIPath;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteAPITest extends BaseTest
{
	@Test
	public void getSingleCustome() 
	{
		test.log(LogStatus.INFO, "My test is starting......");
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_SINGLE_CUSTOMER);
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		//test.log(LogStatus.INFO, response.getBody().asString());
		test.log(LogStatus.INFO, "My status code is"+ response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is"+response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO,"My testcookies.."+ response.getCookies());
	}
	
}
