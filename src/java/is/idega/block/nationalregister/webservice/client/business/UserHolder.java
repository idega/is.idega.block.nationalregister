package is.idega.block.nationalregister.webservice.client.business;

public class UserHolder {
	private String name = "";
	private String personalID = "";
	private String address = "";
	private String postalCode = "";
	private String postalAddress = "";

	public UserHolder(String name, String personalID, String address,
			String postalCode, String postalAddress) {
		super();
		this.name = name;
		this.personalID = personalID;
		this.address = address;
		this.postalCode = postalCode;
		this.postalAddress = postalAddress;
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
}