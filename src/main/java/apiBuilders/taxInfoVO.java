package apiBuilders;

public class taxInfoVO {
	private String cstRegNo;    
	private String panNo;
	private String taxRegNo;
	public String getCstRegNo() {
		return cstRegNo;
	}
	public void setCstRegNo(String cstRegNo) {
		this.cstRegNo = cstRegNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getTaxRegNo() {
		return taxRegNo;
	}
	public void setTaxRegNo(String taxRegNo) {
		this.taxRegNo = taxRegNo;
	}
	public taxInfoVO(String cstRegNo, String panNo, String taxRegNo) {
		super();
		this.cstRegNo = cstRegNo;
		this.panNo = panNo;
		this.taxRegNo = taxRegNo;
	}
	public taxInfoVO() {
		
	}
	

}
