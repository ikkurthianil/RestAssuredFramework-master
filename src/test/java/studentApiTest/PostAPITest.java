package studentApiTest;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiBuilders.ComplexJson;
import apiBuilders.PostAPIBuilder;
import apiConfigs.APIPath;
import apiConfigs.HeaderConfigs;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.response.Response;
import utils.Fields;
import utils.JavaUtilis;

public class PostAPITest extends BaseTest
{
	
     

	
	/*
	 * String id;
	 * 
	 * @Test(priority =1) public void validPostAPITest1() {
	 * 
	 * test.log(LogStatus.INFO, "My test is starting.....");
	 * 
	 * HeaderConfigs header = new HeaderConfigs(); PostAPIBuilder builder = new
	 * PostAPIBuilder();
	 * 
	 * id= JavaUtilis.randomNumebr();
	 * 
	 * Response response =
	 * RestAssured.given().when().headers(header.defaultHeaders()).body(
	 * builder.postRequestBody(JavaUtilis.randomNumebr(), JavaUtilis.randomStrig(),
	 * JavaUtilis.randomStrig(), id, id, id, id, id, id, id, id, id, id))
	 * .when().post(APIPath.apiPath.CREATE_POST);
	 * 
	 * APIVerification.responseKeyValidationFromJsonObject(response, "address");
	 * APIVerification.responseCodeValiddation(response, 200);
	 * APIVerification.responseTimeValidation(response);
	 * 
	 * test.log(LogStatus.INFO, "My test has been ended.....");
	 * 
	 * }
	 * 
	 * @Test(priority =2) public void invalidPostAPITest2() {
	 * 
	 * }
	 * 
	 * 
	 */
	@Test
	public void postVendor() 
	{
		 HeaderConfigs header = new HeaderConfigs(); 
		  PostAPIBuilder builder = new PostAPIBuilder();
		  Fields field=new Fields();
		  
			/*
			 * // Random random= new Random();
			 *  int randomnumber =random.nextInt(100); 
			 *  String id=Integer.toString(randomnumber); 
			 *  String phonenumber="98938383"+id;
			 * 
			 * String pinnumber="5009"+id;
			 * 
			 * 
			 * String firstname=field.firstName();
			 */
		  //String fn="anil"+name;
		//  System.out.println("anil"+name);
		 
	/*	 String randomstring=RandomStringUtils.randomAlphanumeric(5);
		 String randomstring1 =RandomStringUtils.randomAlphanumeric(5);
		 String email= randomstring1+"@gmail.com";
		 System.out.println(email);*/
		  Random random= new Random();
			 int randomnumber =random.nextInt(100); 
			  String id=Integer.toString(randomnumber); 
			  String id1=Integer.toString(randomnumber); 
			  String phonenumber="938"+id1+"383"+id;
		 String address=field.address();
		 String city=field.city();
		 String company=field.company();
		 String displayNameAs=field.displayNameAs();
		 String email=field.email();
		 String fax=field.fax();
		 String firstName=field.firstName();
		 String gstRegistrationType=field.gstRegistrationType();
		 String lastName=field.lastName();
		 String notes=field.notes();
		 String phone=field.phone();
		 String pincode=field.pincode();
		 String state=field.state();
		 
		 
		 test.log(LogStatus.INFO, "My test is starting......");
		  Response response =
				  RestAssured.given().when().headers(header.defaultHeaders()).body(
				  builder.postRequestBody(address, city,
						  company, displayNameAs, email, fax, firstName, gstRegistrationType, lastName, notes, phonenumber, pincode, state))
				  .when().post(APIPath.apiPath.POST_VENDOR);
			
		    System.out.println(response.getBody().asString());
		    APIVerification.responseCodeValiddation(response, 200);
			APIVerification.responseTimeValidation(response);
			test.log(LogStatus.INFO, "My status code is"+ response.getBody().asString());
			test.log(LogStatus.INFO, "Response time is"+response.getTime());
			test.log(LogStatus.PASS, "My test is pass...");
			test.log(LogStatus.INFO,"My testcookies.."+ response.getCookies());
		 
		 
	}
	@Test
	public void productpostVendor() 
	{
		 HeaderConfigs header = new HeaderConfigs(); 
		  PostAPIBuilder builder = new PostAPIBuilder();
		  Fields field=new Fields();
		  
			/*
			 * // Random random= new Random(); int randomnumber =random.nextInt(100); String
			 * id=Integer.toString(randomnumber); String phonenumber="98938383"+id;
			 * 
			 * String pinnumber="5009"+id;
			 * 
			 * 
			 * String firstname=field.firstName();
			 */
		  //String fn="anil"+name;
		//  System.out.println("anil"+name);
		 
	/*	 String randomstring=RandomStringUtils.randomAlphanumeric(5);
		 String randomstring1 =RandomStringUtils.randomAlphanumeric(5);
		 String email= randomstring1+"@gmail.com";
		 System.out.println(email);*/
		 
		 int buyingPrice=field.price();
		  int cgst=field.price();
		 String dateOfBuying=field.company();
		 String dateOfSelling=field.displayNameAs();
		 String description=field.email();
		 int discount=field.price();
		 int hsnCode=field.price();
		 String productName=field.city();
		 int quantity=field.price();
		 int sellingPrice=field.price();
		 int sgst=field.price();
		
		 
		 
		 test.log(LogStatus.INFO, "My test is starting......");
		  Response response =
				  RestAssured.given().when().headers(header.defaultHeaders()).body(
				  builder.productpostRequestBody(buyingPrice, cgst, dateOfBuying, dateOfSelling, description, discount, hsnCode, productName,quantity, sellingPrice, sgst))
				  .when().post(APIPath.apiPath.POST_PRODUCT);
			
		    System.out.println(response.getBody().asString());
		    APIVerification.responseCodeValiddation(response, 200);
			APIVerification.responseTimeValidation(response);
			test.log(LogStatus.INFO, "My status code is"+ response.getBody().asString());
			test.log(LogStatus.INFO, "Response time is"+response.getTime());
			test.log(LogStatus.PASS, "My test is pass...");
			test.log(LogStatus.INFO,"My testcookies.."+ response.getCookies());
		 
		 
	}
	
	@Test
	public void postCustomer()
	{
		ComplexJson ex= new ComplexJson();
		 HeaderConfigs header = new HeaderConfigs(); 
		 test.log(LogStatus.INFO, "My test is starting......");
		  Response response =
				  RestAssured.given().when().headers(header.defaultHeaders()).body(ex.customer())
				
				  .when().post(APIPath.apiPath.POST_CUSTOMER);
			
		    System.out.println(response.getBody().asString());
		    APIVerification.responseCodeValiddation(response, 200);
			APIVerification.responseTimeValidation(response);
		//	APIVerification.responseKeyfromArray(response, "city");
			//APIVerification.responseKeyValidationFromJsonObject(response, "city");
			test.log(LogStatus.INFO, "My status code is"+ response.getBody().asString());
			test.log(LogStatus.INFO, "Response time is"+response.getTime());
			test.log(LogStatus.PASS, "My test is pass...");
			test.log(LogStatus.INFO,"My testcookies.."+ response.getCookies());
	}
	
	
	
	
}
	
	
		
