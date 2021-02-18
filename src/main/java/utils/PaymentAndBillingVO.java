package utils;

public class PaymentAndBillingVO 
{

	private String city;
	private Integer openingBalance;
    private String preferredDeliveryMethod;
    private String preferredPaymentMethod;
    private String terms;
    
    
	public PaymentAndBillingVO(String city, Integer openingBalance, String preferredDeliveryMethod,
			String preferredPaymentMethod, String terms) {
		super();
		this.city = city;
		this.openingBalance = openingBalance;
		this.preferredDeliveryMethod = preferredDeliveryMethod;
		this.preferredPaymentMethod = preferredPaymentMethod;
		this.terms = terms;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(Integer openingBalance) {
		this.openingBalance = openingBalance;
	}
	public String getPreferredDeliveryMethod() {
		return preferredDeliveryMethod;
	}
	public void setPreferredDeliveryMethod(String preferredDeliveryMethod) {
		this.preferredDeliveryMethod = preferredDeliveryMethod;
	}
	public String getPreferredPaymentMethod() {
		return preferredPaymentMethod;
	}
	public void setPreferredPaymentMethod(String preferredPaymentMethod) {
		this.preferredPaymentMethod = preferredPaymentMethod;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
    
    
    
}
