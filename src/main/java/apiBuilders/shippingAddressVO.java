package apiBuilders;

import java.util.List;



public class shippingAddressVO 
{
	private String city;
	private String country;
    
	private String pinCode;
	private String state;
	private String street;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public shippingAddressVO(String city, String country, String pinCode, String state, String street) {
		super();
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
		this.state = state;
		this.street = street;
	}
	@Override
	public String toString() {
		return "shippingAddressVO [city=" + city + ", country=" + country + ", pinCode=" + pinCode + ", state=" + state
				+ ", street=" + street + "]";
	}
	
	
	
	
}
