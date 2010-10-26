package is.idega.block.nationalregister.webservice.client.business;

public class CompanyHolder {
	private String name = "";
	private String personalID = "";
	private String address = "";
	private String postalCode = "";
	private String postalAddress = "";

	private String businessTypeNumber = "";
	private String businessTypeNumberIS = "";
	private String companyForm = ""; 
	private String vatNumber = "";
	
	public CompanyHolder(String name, String personalID, String address,
			String postalCode, String postalAddress, String businessTypeNumber,
			String businessTypeNumberIS, String companyForm, String vatNumber) {
		super();
		this.name = name;
		this.personalID = personalID;
		this.address = address;
		this.postalCode = postalCode;
		this.postalAddress = postalAddress;
		this.businessTypeNumber = businessTypeNumber;
		this.businessTypeNumberIS = businessTypeNumberIS;
		this.companyForm = companyForm;
		this.vatNumber = vatNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonalID() {
		return personalID;
	}

	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getBusinessTypeNumber() {
		return businessTypeNumber;
	}

	public void setBusinessTypeNumber(String businessTypeNumber) {
		this.businessTypeNumber = businessTypeNumber;
	}

	public String getBusinessTypeNumberIS() {
		return businessTypeNumberIS;
	}

	public void setBusinessTypeNumberIS(String businessTypeNumberIS) {
		this.businessTypeNumberIS = businessTypeNumberIS;
	}

	public String getCompanyForm() {
		return companyForm;
	}

	public void setCompanyForm(String companyForm) {
		this.companyForm = companyForm;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}
	
	
}
