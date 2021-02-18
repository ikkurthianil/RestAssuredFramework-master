package baseTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Authentication 
{
	
@Test
public void add() 
{
	
	RestAssured.baseURI="https://hrmsapiqa.onpassive.com/swagger-ui.html#/";
	RequestSpecification request=RestAssured.given();
	//String credintials=
}


}