package apiBuilders;

import java.util.List;

public class parsingDynamicData 
{
	private List<BillingAddressVO> address;
	private String company;
	private int creditDays;
	private int creditLimit;
	private String email;
	private String fax;
	private String firstName;
	private String fullName;
	private String gstNumber;
	private String gstRegistrationType;
	private String lastName;
	private String middleName;
	private String notes;
	private PaymentAndBillingVO paymentAndBillingVO;
	private String phone;
	private boolean sameAsBillingAddress;
	private List<shippingAddressVO> address1;
	private taxInfoVO taxinfo;
	private String title;
	private String website;
	
	public taxInfoVO getTaxinfo() {
		return taxinfo;
	}
	public void setTaxinfo(taxInfoVO taxinfo) {
		this.taxinfo = taxinfo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<BillingAddressVO> getAddress() {
		return address;
	}
	public void setAddress(List<BillingAddressVO> address) {
		this.address = address;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCreditDays() {
		return creditDays;
	}
	public void setCreditDays(int creditDays) {
		this.creditDays = creditDays;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getGstRegistrationType() {
		return gstRegistrationType;
	}
	public void setGstRegistrationType(String gstRegistrationType) {
		this.gstRegistrationType = gstRegistrationType;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public PaymentAndBillingVO getPaymentAndBillingVO() {
		return paymentAndBillingVO;
	}
	public void setPaymentAndBillingVO(PaymentAndBillingVO paymentAndBillingVO) {
		this.paymentAndBillingVO = paymentAndBillingVO;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isSameAsBillingAddress() {
		return sameAsBillingAddress;
	}
	public void setSameAsBillingAddress(boolean sameAsBillingAddress) {
		this.sameAsBillingAddress = sameAsBillingAddress;
	}
	public List<shippingAddressVO> getAddress1() {
		return address1;
	}
	public void setAddress1(List<shippingAddressVO> address1) {
		this.address1 = address1;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append("parsingDynamicData [address=");
		builder.append(address);
		builder.append(", company=");
		builder.append(company);
		builder.append(", creditDays=");
		builder.append(creditDays);
		builder.append(", creditLimit=");
		builder.append(creditLimit);
		builder.append(", email=");
		builder.append(email);
		builder.append(", fax=");
		builder.append(fax);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", fullName=");
		builder.append(fullName);
		builder.append(", gstNumber=");
		builder.append(gstNumber);
		builder.append(", gstRegistrationType=");
		builder.append(gstRegistrationType);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", notes=");
		builder.append(notes);
		builder.append(", paymentAndBillingVO=");
		builder.append(paymentAndBillingVO);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", sameAsBillingAddress=");
		builder.append(sameAsBillingAddress);
		builder.append(", address1=");
		builder.append(address1);
		builder.append(", taxinfo=");
		builder.append(taxinfo);
		builder.append(", title=");
		builder.append(title);
		builder.append(", website=");
		builder.append(website);
		builder.append("]");
		return builder.toString();
	}
	

}
