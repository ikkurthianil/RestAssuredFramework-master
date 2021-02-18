package studentApiTest;

import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.APIPath;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.Fields;
import utils.SQL;

public class GetAPITests extends BaseTest 
{


	@Test
	public void getAllCustomers() {

		// RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS).then().log().all().statusCode(400);
		test.log(LogStatus.INFO, "My test is starting......");
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_CUSTOMERS);
		/*
		 * JSONArray array = new JSONArray(response.getBody().asString());
		 * 
		 * for(int i=0; i<array.length();i++) { //System.out.println(array.get(i));
		 * 
		 * JSONObject obj = array.getJSONObject(i);
		 * 
		 * //test.log(LogStatus.INFO, "Validate values are"+obj.get("title"));
		 * System.out.println(obj.get("title")); }
		 */
		/*
		 * JSONArray array = new JSONArray(response.getBody().asString());
		 * 
		 * for(int i=0; i<array.length();i++) { System.out.println(array.get(i));
		 * 
		 * //JSONObject obj = array.getJSONObject(i);
		 * 
		 * //test.log(LogStatus.INFO, "Validate values are"+obj.get("title"));
		 * //System.out.println(obj.get("title")); }
		 */
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		// test.log(LogStatus.INFO, response.getBody().asString());
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

	@Test
	public void getSingleCustomer() throws SQLException {
		test.log(LogStatus.INFO, "My test is starting......");

		 String query= "SELECT id FROM accountandinventory.customerinfo;";
		int id = SQL.statement(query);
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_SINGLE_CUSTOMER + id);
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		// test.log(LogStatus.INFO, response.getBody().asString());
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

// RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_CUSTOMERS).then().log().all().statusCode(400);

	// Response response =
	// RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_CUSTOMERS);

//		System.out.println(response.getBody().asString());
//		
//		System.out.println(response.getStatusCode());
//		
//		System.out.println(response.getCookies());
//		
//		System.out.println(response.getTime());

	/*
	 * JSONArray array = new JSONArray(response.getBody().asString());
	 * 
	 * for(int i=0; i<array.length();i++) { System.out.println(array.get(i));
	 */

	// JSONObject obj = array.getJSONObject(i);

	// test.log(LogStatus.INFO, "Validate values are"+obj.get("title"));
	// System.out.println(obj.get("title"));

	// test.log(LogStatus.PASS, "My test is pass...");

	@Test
	public void getCompanyName() {
		test.log(LogStatus.INFO, "My test is starting......");
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_COMPANY_NAME);
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

	@Test
	public void getAllVendors() {
		test.log(LogStatus.INFO, "My test is starting......");
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_VENDORS);
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

	@Test
	public void getSingleVendor() throws SQLException {
		test.log(LogStatus.INFO, "My test is starting......");
		 String query= "SELECT id FROM accountandinventory.vendor;";
		 int id = SQL.statement(query);
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_SINGLE_VENDOR+id);

		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

	@Test
	public void getVendorDetails() {
		test.log(LogStatus.INFO, "My test is starting......");
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_VENDORS_DETAILS);
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

	@Test
	public void getAllProducts() {
		test.log(LogStatus.INFO, "My test is starting......");
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_PRODUCTS);
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

	@Test
	public void getSingleProduct() throws SQLException 
	{
		 String query= "SELECT product_id FROM accountandinventory.product_master;";
		 int id = SQL.statement(query);
		
		test.log(LogStatus.INFO, "My test is starting......");
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_SINGLE_PRODUCT+id);
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

	@Test
	public void getItemDetails() {
		test.log(LogStatus.INFO, "My test is starting......");
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_ITEM_DETAILS);
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

	@Test
	public void getSingleItem() throws SQLException {
		test.log(LogStatus.INFO, "My test is starting......");
		 String query= "SELECT item_id FROM accountandinventory.items;";
		 int id = SQL.statement(query);
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_SINGLE_ITEM);
		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My status code is" + response.getBody().asString());
		test.log(LogStatus.INFO, "Response time is" + response.getTime());
		test.log(LogStatus.PASS, "My test is pass...");
		test.log(LogStatus.INFO, "My testcookies.." + response.getCookies());
	}

}
