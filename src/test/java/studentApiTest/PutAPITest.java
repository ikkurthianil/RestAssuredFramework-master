package studentApiTest;

import java.sql.SQLException;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import apiBuilders.PostAPIBuilder;
import apiBuilders.PutAPIBuilder;
import apiConfigs.APIPath;
import apiConfigs.HeaderConfigs;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.Fields;
import utils.SQL;

public class PutAPITest extends BaseTest
{

	
	
	@Test
	public void putVendor() throws SQLException 
	{
		 HeaderConfigs header = new HeaderConfigs(); 
		  PutAPIBuilder builder = new PutAPIBuilder();
		  Fields field=new Fields();
		  
		  
		  
		  
			/*
			 * Random random= new Random(); int randomnumber =random.nextInt(100); String
			 * id=Integer.toString(randomnumber);
			 * 
			 * String phonenumber="98938383"+id; System.out.println(id);
			 * 
			 * String pinnumber="5009"+id;
			 * 
			 * 
			 * String randomstring=RandomStringUtils.randomAlphanumeric(5);
			 * 
			 * String randomstring1 =RandomStringUtils.randomAlphanumeric(5);
			 * 
			 * String email= randomstring1+"@gmail.com"; System.out.println(email);
			 */
		
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
         String query= "SELECT id FROM accountandinventory.vendor;";
	
		 
		 //"SELECT  id,company FROM accountandinventory.customerinfo;"
		 int vid = SQL.statement(query);
		// String vid1=Integer.toString(vid); 
		 int id=field.id(vid);
		 System.out.println(id);
		  Random random= new Random();
			 int randomnumber =random.nextInt(100); 
			  String id1=Integer.toString(randomnumber); 
			  String phonenumber="88938383"+id1;
		 
		 test.log(LogStatus.INFO, "My test is starting......");
		  Response response =
				  RestAssured.given().when().headers(header.defaultHeaders()).body(
				  builder.putRequestBody(address, city, company, displayNameAs, email, fax, firstName, gstRegistrationType, lastName, notes, phonenumber, pincode, state, id))
				  .when().put(APIPath.apiPath.PUT_VENDOR);
			
		    System.out.println(response.getBody().asString());
		    APIVerification.responseCodeValiddation(response, 200);
			APIVerification.responseTimeValidation(response);
			test.log(LogStatus.INFO, "My status code is"+ response.getBody().asString());
			test.log(LogStatus.INFO, "Response time is"+response.getTime());
			test.log(LogStatus.PASS, "My test is pass...");
			test.log(LogStatus.INFO,"My testcookies.."+ response.getCookies());
			System.out.println(response.getStatusCode());
		 
		 
	}
	
	@Test
	public void putProduct() throws SQLException 
	{
		 HeaderConfigs header = new HeaderConfigs(); 
		  PutAPIBuilder builder = new PutAPIBuilder();
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
		 String description=field.company();
		 int discount=field.price();
		 int hsnCode=field.price();
		
		 String query= "SELECT product_id FROM accountandinventory.product_master;";
		  int vid = SQL.statement(query);
		  int productId=field.id(vid);
		 String productName=field.city();
		 int quantity=field.price();
		 int sellingPrice=field.price();
		 int sgst=field.price();
		 
		
		 
		 
		// String vid1=Integer.toString(vid);  
		
		// System.out.println("productid"+productId);
		
		  
		 
		 
		 test.log(LogStatus.INFO, "My test is starting......");
		  Response response =
				  RestAssured.given().when().headers(header.defaultHeaders()).body(
				  builder.productputRequestBody(buyingPrice, cgst, dateOfBuying, dateOfSelling, description, discount, hsnCode,productId,productName, quantity, sellingPrice, sgst))
				  .when().put(APIPath.apiPath.PUT_PRODUCT);
			
		    System.out.println(response.getBody().asString());
		    APIVerification.responseCodeValiddation(response, 200);
			APIVerification.responseTimeValidation(response);
			test.log(LogStatus.INFO, "My status code is"+ response.getBody().asString());
			test.log(LogStatus.INFO, "Response time is"+response.getTime());
			test.log(LogStatus.PASS, "My test is pass...");
			test.log(LogStatus.INFO,"My testcookies.."+ response.getCookies());
		 
		 
	}
}
