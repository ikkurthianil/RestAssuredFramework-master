package apiConfigs;
import utils.SQL;
public class APIPath {
	
	public static final class apiPath{
		
		//GET 
		public static final String GET_LIST_OF_CUSTOMERS ="/customerInfo/getAllCustomers";
		public static final String GET_SINGLE_CUSTOMER="/customerInfo/getCustomerInfo/";
		public static final String GET_COMPANY_NAME="/customerInfo/getCompanyName/hcl";
		public static final String GET_LIST_OF_VENDORS="/vendor/getAllVendors";
		public static final String GET_SINGLE_VENDOR="/vendor/getVendor/";	
		public static final String GET_VENDORS_DETAILS="/vendor/getvendorsDetails";
		public static final String GET_LIST_OF_PRODUCTS="/productmaster/product/getAllProducts";
		public static final String GET_ITEM_DETAILS="/productmaster/product/getItemDetails";
		public static final String GET_SINGLE_ITEM="/productmaster/product/getItems/string";
		public static final String GET_SINGLE_PRODUCT="/productmaster/product/getProductById/";
		
		
		//POST
		public static final String POST_VENDOR="/vendor/save";
		public static final String POST_PRODUCT="/productmaster/product/createProducts";
		public static final String POST_CUSTOMER="/customerInfo/save";
		
		
		
		//PUT
		public static final String PUT_VENDOR="/vendor/edit";
		public static final String PUT_PRODUCT="/productmaster/product/updateProduct";
		
		//Delete
		public static final String DELETE_CUSTOMER="/customerInfo/delete/";
	}
	
}
