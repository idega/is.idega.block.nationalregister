package is.idega.block.nationalregister.data.bean;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Index;

@Table
@Entity(name = "reg_national_is")
@Cacheable
public class NationalRegister implements Serializable {

	private static final long serialVersionUID = -6278559996796353005L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REG_NATIONAL_IS_ID")
	private Integer id;

	@Column(name = "symbol", length = 2)
	private String symbol;

	@Column(name = "old_id", length = 8)
	private String oldId;

	@Column(name = "ssn", length = 10, unique = true)
	@Index(name = "ssn_index", columnNames = {"ssn"})
	private String ssn;

	@Column(name = "family_id", length = 10)
	private String familyId;

	@Column(name = "name", length = 31)
	private String name;

	@Column(name = "commune", length = 4)
	private String commune;

	@Column(name = "street", length = 4)
	private String street;

	@Column(name = "building", length = 4)
	private String building;

	@Column(name = "floor", length = 3)
	private String floor;

	@Column(name = "sex", length = 1)
	private String sex;

	@Column(name = "marital_status", length = 1)
	private String maritalStatus;

	@Column(name = "empty", length = 2)
	private String empty;

	@Column(name = "prohibit", length = 1)
	private String prohibit;

	@Column(name = "nationality", length = 2)
	private String nationality;

	@Column(name = "birth_place", length = 4)
	private String birthPlace;

	@Column(name = "spouse_ssn", length = 10)
	private String spouseSSN;

	@Column(name = "status", length = 4)
	private String status;

	@Column(name = "parish", length = 3)
	private String parish;

	@Column(name = "po", length = 3)
	private String po;

	@Column(name = "address", length = 100)
	private String address;

	@Column(name = "address_dode", length = 12)
	private String addressCode;

	@Column(name = "date_of_modification", length = 6)
	private String dateOfModification;

	@Column(name = "placement_code", length = 12)
	private String placementCode;

	@Column(name = "date_of_creation", length = 6)
	private String dateOfCreation;

	@Column(name = "last_domestic_address", length = 100)
	private String lastDomesticAddress;

	@Column(name = "agent_ssn", length = 10)
	private String agentSSN;

	@Column(name = "is_new", length = 1)
	private String isNew;

	@Column(name = "address_name", length = 100)
	private String addressName;

	@Column(name = "date_of_deletion", length = 6)
	private String dateOfDeletion;

	@Column(name = "new_ssn", length = 18)
	private String newSSN;

	@Column(name = "date_of_birth", length = 6)
	private String dateOfBirth;

	@Override
	public String toString() {
		return "ID: " + getId() + ", SSN: " + getSsn();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getOldId() {
		return oldId;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFamilyId() {
		return familyId;
	}

	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEmpty() {
		return empty;
	}

	public void setEmpty(String empty) {
		this.empty = empty;
	}

	public String getProhibit() {
		return prohibit;
	}

	public void setProhibit(String prohibit) {
		this.prohibit = prohibit;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getSpouseSSN() {
		return spouseSSN;
	}

	public void setSpouseSSN(String spouseSSN) {
		this.spouseSSN = spouseSSN;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getParish() {
		return parish;
	}

	public void setParish(String parish) {
		this.parish = parish;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	public String getDateOfModification() {
		return dateOfModification;
	}

	public void setDateOfModification(String dateOfModification) {
		this.dateOfModification = dateOfModification;
	}

	public String getPlacementCode() {
		return placementCode;
	}

	public void setPlacementCode(String placementCode) {
		this.placementCode = placementCode;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getLastDomesticAddress() {
		return lastDomesticAddress;
	}

	public void setLastDomesticAddress(String lastDomesticAddress) {
		this.lastDomesticAddress = lastDomesticAddress;
	}

	public String getAgentSSN() {
		return agentSSN;
	}

	public void setAgentSSN(String agentSSN) {
		this.agentSSN = agentSSN;
	}

	public String getIsNew() {
		return isNew;
	}

	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getDateOfDeletion() {
		return dateOfDeletion;
	}

	public void setDateOfDeletion(String dateOfDeletion) {
		this.dateOfDeletion = dateOfDeletion;
	}

	public String getNewSSN() {
		return newSSN;
	}

	public void setNewSSN(String newSSN) {
		this.newSSN = newSSN;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}