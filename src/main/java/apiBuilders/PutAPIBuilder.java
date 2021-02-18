package apiBuilders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import utils.Fields;
public class PutAPIBuilder
{
	
		
		
		public Map<Object, Object> putRequestBody(String address, String city, String company,String displayNameAs,String email,String fax,String firstName,String gstRegistrationType,String lastName,String notes,String phone,String pincode,String state,int id)
		{
			
			Map<Object, Object> body = new HashMap<Object, Object>();
			body.put("address", address);
			body.put("city", city);
			body.put("company", company);
			body.put("displayNameAs", displayNameAs);
			body.put("email", email);
			body.put("fax", fax);
			body.put("firstName", firstName);
			body.put("gstRegistrationType", gstRegistrationType);
			body.put("lastName", lastName);
			body.put("notes", notes);
			body.put("phone", phone);
			body.put("pincode", pincode);
			body.put("state", state);
			body.put("id", id);
			
					
			/*
			 * ArrayList<String> courtlist=new ArrayList<String>(); courtlist.add("java");
			 * courtlist.add("dfsdfsd");
			 * 
			 * body.put("cource", courtlist);
			 */
			
			return body;
			
		}
		
		public Map<Object, Object> productputRequestBody(int buyingPrice, int cgst, String dateOfBuying,String dateOfSelling,String description,int discount,int hsnCode,int productId,String productName,int quantity,int sellingPrice,int sgst)
		{
			Map<Object, Object> body = new HashMap<Object, Object>();
			body.put("buyingPrice", buyingPrice);
			body.put("cgst", cgst);
			body.put("dateOfBuying", dateOfBuying);
			body.put("dateOfSelling", dateOfSelling);
			body.put("description", description);
			body.put("discount", discount);
			body.put("hsnCode", hsnCode);
			body.put("productId",productId);
			body.put("productName", productName);
			body.put("quantity", quantity);
			body.put("sellingPrice", sellingPrice);
			body.put("sgst", sgst);
			
			//body.put("phone", phone);
			
			
				
			return body;
			
		}
}
