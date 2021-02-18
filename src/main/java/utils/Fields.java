package utils;

import java.sql.SQLException;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class Fields 
{
	static Random random = new Random();

	
	public static String address() 
	{
		String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return randomSTring;
	}

	public static String city() 
	{
		String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return randomSTring;
	}

	public static String company() 
	{
		String randomSTring = RandomStringUtils.randomAlphabetic(6).toUpperCase();
		return randomSTring;
	}

	public static String displayNameAs() 
	{
		String randomSTring = RandomStringUtils.randomAlphabetic(5);
		return randomSTring;
	}

	public static String email() 
	{
		String randomstring1 = RandomStringUtils.randomAlphanumeric(5).toLowerCase();
		String email = randomstring1 + "@gmail.com";
		//System.out.println(email);
		return email;
	}

	public static String fax() 
	{
		String faxnumber = RandomStringUtils.randomNumeric(8);
		// String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return faxnumber;
	}

	public static String firstName() 
	{
		String randomSTring = RandomStringUtils.randomAlphabetic(5).toUpperCase();
		return randomSTring;
	}

	public static String gstRegistrationType() 
	{
		String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return randomSTring;
	}

	public static String lastName() 
	{
		String randomSTring = RandomStringUtils.randomAlphabetic(5).toUpperCase();
		return randomSTring;
	}

	public static String notes() {
		String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return randomSTring;
	}

	public static String phone() 
	{

		String phonenumber = RandomStringUtils.randomNumeric(10);
		/*
		 * int randomnumber =random.nextInt(100); String
		 * id=Integer.toString(randomnumber); 
		 * String phonenumber="98938383"+id;
		 */
		// String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return phonenumber;
	}

	public static String pincode() 
	{
		// int randomnumber =random.nextInt(100);
		String pinnumber = RandomStringUtils.randomNumeric(6);
		// String pinnumber="5009"+randomnumber
		return pinnumber;
	}

	
	public static String state() 
	{
		String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return randomSTring;
	}
	
	public static int id(int id) throws SQLException 
	{
		//id=334;
		 
		//String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return id;
	}
	
	public static String test() {
		String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return randomSTring;
	}
	
	public static int price() 
	{
		 int randomnumber =random.nextInt(100);
	
		// String pinnumber="5009"+randomnumber
		return randomnumber;
	}

	public static String quantity() 
	{
		// int randomnumber =random.nextInt(100);
		String pinnumber = RandomStringUtils.randomNumeric(2);
		// String pinnumber="5009"+randomnumber
		return pinnumber;
	}
}
