package apiBuilders;
import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.Fields;

public class ComplexJson {

	public parsingDynamicData customer(){
		
	
		List<BillingAddressVO> list=new ArrayList<BillingAddressVO>();
		BillingAddressVO addr= new BillingAddressVO();
		addr.setCity("tyrtyt");
		addr.setCountry("rtyrty");
		addr.setPinCode("pinCode");
		addr.setState("state");
		addr.setStreet("street");
		list.add(addr);
		System.out.println(list.get(0).toString());
		System.out.println(list.size());
		
		PaymentAndBillingVO payvo= new PaymentAndBillingVO("HYD", 451, "PS", "UPI", "jdvsdkv");
		
		List<shippingAddressVO> list2=new ArrayList<shippingAddressVO>();
		shippingAddressVO saddvo= new shippingAddressVO("tytry", "tytyty", "645666", "tryrty", "456565");
      	list2.add(saddvo);
      	taxInfoVO tax= new taxInfoVO("45", "67878", "5858678");
	   
      	
      	Fields field=new Fields();
		parsingDynamicData data=new parsingDynamicData();
		data.setAddress(list);
		data.setCompany("company");
		data.setCreditDays(20);
		data.setCreditLimit(700);
		data.setEmail(field.email());
		data.setFax("fax");
		data.setFirstName("firstName");
		data.setFullName("fullName");
		data.setGstNumber("gstNumber");
		data.setGstRegistrationType("gstRegistrationType");
		data.setLastName("lastName");
		data.setMiddleName("middleName");
		data.setNotes("notes");
		data.setPaymentAndBillingVO(payvo);
		data.setPhone(field.phone());
		data.setSameAsBillingAddress(false);
		data.setAddress1(list2);
		data.setTaxinfo(tax);
		data.setTitle("title");
		data.setWebsite("website");	
		return data;
	
	
	}}

	

