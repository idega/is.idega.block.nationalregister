package is.idega.block.nationalregister.business;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBOServiceBean;
import com.idega.core.idgenerator.business.IdGenerator;
import com.idega.core.idgenerator.business.IdGeneratorFactory;
import com.idega.core.location.data.Address;
import com.idega.core.location.data.Commune;
import com.idega.core.location.data.CommuneHome;
import com.idega.core.location.data.Country;
import com.idega.core.location.data.CountryHome;
import com.idega.core.location.data.PostalCode;
import com.idega.core.location.data.PostalCodeHome;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.presentation.PresentationObject;
import com.idega.user.business.UserBusiness;
import com.idega.user.business.UserGroupPlugInBusiness;
import com.idega.user.data.Gender;
import com.idega.user.data.GenderHome;
import com.idega.user.data.Group;
import com.idega.user.data.User;
import com.idega.util.CoreConstants;
import com.idega.util.IWTimestamp;
import com.idega.util.LocaleUtil;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

import is.idega.block.family.business.FamilyLogic;
import is.idega.block.nationalregister.data.bean.NationalRegister;
import is.idega.block.nationalregister.data.bean.NationalRegisterDAO;

public class NationalRegisterBusinessBean extends IBOServiceBean implements NationalRegisterBusiness, UserGroupPlugInBusiness {

	private static final long serialVersionUID = 2198547874985154547L;

	private static int icelandCountryPK = -1;
	private static Gender maleGender = null;
	private static Gender femaleGender = null;
	private static HashMap<String, PostalCode> postalCodes = null;
	private static HashMap<String, Country> countryIDs = null;
	private static HashMap<String, Integer> communeCodes = null;
	private static HashMap<String, String> cityNames = null;

	@Override
	public NationalRegister getEntryBySSN(String ssn) {
		try {
			return getNationalRegisterDAO().findBySSN(ssn);
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error getting entry of nat. reg. by SSN: " + ssn, e);
		}
		return null;
	}

	@Override
	public boolean updateEntryAddress(String ssn, String addressName) {
		NationalRegister reg = getEntryBySSN(ssn);
		if (reg != null) {
			reg.setAddressName(addressName);
			getNationalRegisterDAO().update(reg);
			return true;
		}

		return false;
	}

	@Autowired
	private NationalRegisterDAO nationalRegisterDAO;

	@Override
	public NationalRegisterDAO getNationalRegisterDAO() {
		if (nationalRegisterDAO == null) {
			ELUtil.getInstance().autowire(this);
		}
		return nationalRegisterDAO;
	}

	private NationalRegister doUpdateNatRegEntry(
		final String symbol,
		final String oldId,
		final String ssn,
		final String familyId,
		final String name,
		final String commune,
		final String street,
		final String building,
		final String floor,
		final String sex,
		final String maritialStatus,
		final String empty,
		final String prohibitMarking,
		final String nationality,
		final String placeOfBirth,
		final String spouseSSN,
		final String fate,
		final String parish,
		final String po,
		final String address,
		final String addressCode,
		final String dateOfModification,
		final String placementCode,
		final String dateOfCreation,
		final String lastDomesticAddress,
		final String agentSsn,
		final String sNew,
		final String addressName,
		final String dateOfDeletion,
		final String newSsnOrName,
		final String dateOfBirth
	) {
		IWMainApplicationSettings settings = getIWMainApplication().getSettings();
		if (settings.getBoolean("nat_reg.create_nat_reg_entry", Boolean.TRUE)) {
			NationalRegister reg = getEntryBySSN(ssn);

			Integer id = null;
			if (reg == null) {
				reg = new NationalRegister();
			}
			if (reg.getId() == null) {
				id = settings.getInt("nat_reg.generate_id_for_entity", -1);
				if (id != null && id > 0) {
					id++;
					reg.setId(id);
					settings.setProperty("nat_reg.generate_id_for_entity", String.valueOf(id));
				}
			}

			reg.setAddress(address);
			reg.setBuilding(building);
			reg.setCommune(commune);
			reg.setFamilyId(familyId);
			reg.setStatus(fate);
			reg.setFloor(floor);
			reg.setMaritalStatus(maritialStatus);
			reg.setName(name);
			reg.setNationality(nationality);
			reg.setOldId(oldId);
			reg.setParish(parish);
			reg.setBirthPlace(placeOfBirth);
			reg.setPo(po);
			reg.setProhibit(prohibitMarking);
			reg.setSex(sex);
			reg.setSpouseSSN(spouseSSN);
			reg.setSsn(ssn);
			reg.setStreet(street);
			reg.setSymbol(symbol);
			reg.setAddressCode(addressCode);
			reg.setDateOfModification(dateOfModification);
			reg.setPlacementCode(placementCode);
			reg.setDateOfCreation(dateOfCreation);
			reg.setLastDomesticAddress(lastDomesticAddress);
			reg.setAgentSSN(agentSsn);
			reg.setIsNew(sNew);
			reg.setAddressName(addressName);
			reg.setDateOfDeletion(dateOfDeletion);
			reg.setNewSSN(newSsnOrName);
			reg.setDateOfBirth(dateOfBirth);

			try {
				getNationalRegisterDAO().update(reg);
			} catch (Exception e) {
				getLogger().log(Level.WARNING, "Error updating/creating nat. reg. entry with SSN: " + ssn, e);
			}

			return reg;
		}

		return null;
	}

	@Override
	public boolean updateEntry(
		String symbol,
		String oldId,
		String ssn,
		String familyId,
		String name,
		String commune,
		String street,
		String building,
		String floor,
		String sex,
		String maritialStatus,
		String empty,
		String prohibitMarking,
		String nationality,
		String placeOfBirth,
		String spouseSSN,
		String fate,
		String parish,
		String po,
		String address,
		// Gimmi, because of E36
		String addressCode,
		String dateOfModification,
		String placementCode,
		String dateOfCreation,
		String lastDomesticAddress,
		String agentSsn,
		String sNew,
		String addressName,
		String dateOfDeletion,
		String newSsnOrName,
		String dateOfBirth,
		Group citizenGroup,
		String city
	) {
		try {
			UserBusiness userBiz = getServiceInstance(UserBusiness.class);

			doUpdateNatRegEntry(
					symbol,
					oldId,
					ssn,
					familyId,
					name,
					commune,
					street,
					building,
					floor,
					sex,
					maritialStatus,
					empty,
					prohibitMarking,
					nationality,
					placeOfBirth,
					spouseSSN,
					fate,
					parish,
					po,
					address,
					addressCode,
					dateOfModification,
					placementCode,
					dateOfCreation,
					lastDomesticAddress,
					agentSsn,
					sNew,
					addressName,
					dateOfDeletion,
					newSsnOrName,
					dateOfBirth
			);

			IWTimestamp t = new IWTimestamp();

			String day = ssn.substring(0,2);
			String month = ssn.substring(2,4);
			String year = ssn.substring(4,6);

			int iDay = Integer.parseInt(day);
			int iMonth = Integer.parseInt(month);
			int iYear = Integer.parseInt(year);
			if (ssn.substring(9).equals("9")) {
				iYear += 1900;
			}
			else if (ssn.substring(9).equals("0")) {
				iYear += 2000;
			}
			else if (ssn.substring(9).equals("8")) {
				iYear += 1800;
			}
			t.setHour(0);
			t.setMinute(0);
			t.setSecond(0);
			t.setMilliSecond(0);
			t.setDay(iDay);
			t.setMonth(iMonth);
			t.setYear(iYear);

			Gender gender = getGender(sex);

			User user = userBiz.createUserByPersonalIDIfDoesNotExist(name, ssn, gender, t);

			boolean changedName = false;
			if (newSsnOrName != null && "".equalsIgnoreCase(newSsnOrName)) {
				try {
					Long.parseLong(newSsnOrName);
					user.setPersonalID(newSsnOrName);
					user.store();
					log("Changing user's personalID to "+newSsnOrName);
				} catch (NumberFormatException n) {
					user.setFullName(newSsnOrName);
					user.setDisplayName(newSsnOrName);
					user.store();
					changedName = true;
					log("Changing user's name to "+newSsnOrName);
				}
			}
			if (!changedName && user != null && !StringUtil.isEmpty(name) && !name.equals(user.getName())) {
				user.setFullName(name);
				user.setDisplayName(name);
				user.store();
			}

			Country country = null;
			Integer communeID = null;
			if (commune != null && commune.length() > 2 && commune.substring(0,2).equals("99")) {
				country = getCountryByISOAbbreviation(commune.substring(2,4));
			} else {
				String icelandISOAbbreviation = LocaleUtil.getIcelandicLocale().getCountry(), countryISOAbbreviation = null;
				Locale defaultLocale = IWMainApplication.getDefaultIWMainApplication().getDefaultLocale();
				if (defaultLocale != null && !defaultLocale.toString().equals(Locale.ENGLISH.toString())) {
					countryISOAbbreviation = defaultLocale.getCountry();
				}
				country = getCountryByISOAbbreviation(StringUtil.isEmpty(countryISOAbbreviation) ? icelandISOAbbreviation : countryISOAbbreviation);
				communeID = getCommuneIDFromCommuneCode(commune);
				city = StringUtil.isEmpty(city) ? getCityFromPostalCode(po,Integer.parseInt(country.getPrimaryKey().toString())) : city;
			}

			updateUserAddress(user, userBiz, address, po, country, city, communeID, addressName);

			if (citizenGroup != null) {
				citizenGroup.addGroup(user);
				user.setPrimaryGroup(citizenGroup);
				user.store();
			}

			if (StringUtil.isEmpty(user.getUniqueId())) {
				IdGenerator uidGenerator = IdGeneratorFactory.getUUIDGenerator();
				user.setUniqueId(uidGenerator.generateId());
			}

			user.setLastReadFromImport(IWTimestamp.getTimestampRightNow());
			user.store();

			FamilyLogic familyLogic = getFamilyLogic();
			familyLogic.updateFamilyForUser(familyId, user);

			if (!StringUtil.isEmpty(spouseSSN)) {
				spouseSSN = spouseSSN.trim();
				if (!StringUtil.isEmpty(spouseSSN) && userBiz.validatePersonalId(spouseSSN)) {
					User spouse = null;
					try {
						spouse = userBiz.getUser(spouseSSN);
					} catch (Exception e) {}
					try {
						User currentSpouse = familyLogic.getSpouseFor(user);
						if (spouse != null && currentSpouse != null && !spouse.getPersonalID().equals(currentSpouse.getPersonalID())) {
							familyLogic.removeAsSpouseFor(user, currentSpouse);
						}
					} catch (Exception e) {}
					try {
						if (spouse != null && !spouse.isDeceased()) {
							familyLogic.setAsSpouseFor(user, spouse);
						}
					} catch (Exception e) {}
				}
			}
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error updating " + ssn, e);
			return false;
		}

		return true;
	}

	@Override
	public void updateUserPersonalID(String oldPersonalID, String newPersonalID) throws IBOLookupException{
		NationalRegister reg = getEntryBySSN(oldPersonalID);

		if (reg != null) {
			reg.setSsn(newPersonalID);
			getNationalRegisterDAO().update(reg);
		}
	}

	@Override
	public void updateUserOldID(String oldID, String personalID) throws IBOLookupException{
		NationalRegister reg = getEntryBySSN(personalID);

		if (reg != null) {
			reg.setOldId(oldID);
			getNationalRegisterDAO().update(reg);
		}
	}

	@Override
	public void updateUserAddress(User user, UserBusiness userBiz, String address, String po, Country country, String city, Integer communeID, String addressName) throws RemoteException, CreateException {
		PostalCode postalCode = getPostalCode(po);

		Address mainAddress = userBiz.updateUsersMainAddressOrCreateIfDoesNotExist(user, address, postalCode, country, city, null, null, communeID);
		setAddressNominative(mainAddress, addressName);

		Address coAddress = userBiz.updateUsersCoAddressOrCreateIfDoesNotExist(user, address, postalCode, country, city, null, null, communeID);
		setAddressNominative(coAddress, addressName);
	}

	private void setAddressNominative(Address address, String addressName) {
		if (address == null) {
			return;
		}

		try {
			address.setStreetAddressNominative(addressName);
			address.store();
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error setting address name '" + addressName + "' for " + address, e);
		}
	}

	@Override
	public PostalCode getPostalCode(String po) throws RemoteException {
		if (postalCodes == null) {
			postalCodes = new HashMap<String, PostalCode>();
		}

		if (po != null && !po.trim().equals(CoreConstants.EMPTY)) {
			if (postalCodes.containsKey(po)) {
				return postalCodes.get(po);
			} else {
				PostalCodeHome postalCodeHome = ((PostalCodeHome) getIDOHome(PostalCode.class));
				try {
					PostalCode poCode = postalCodeHome.findByPostalCodeAndCountryId(po, getIcelandicCountryPK());
					postalCodes.put(po, poCode);
					getLogger().info("Looking up for postal code: '" + po + "'");
					return poCode;
				} catch(FinderException e) {
					try {
						PostalCode poCode = postalCodeHome.create();
						poCode.setPostalCode(po);
						poCode.store();
						postalCodes.put(po, poCode);
						getLogger().info("Created postal code entity (" + poCode + ") for code '" + po + "'");
						return poCode;
					} catch (CreateException ce) {
						getLogger().warning("Did not found postal code entity for code '" + po + "'!");
					}

					postalCodes.put(po, null);
					return null;
				}
			}
		}
		return null;
	}

	private Gender getGender(String sex) throws RemoteException, FinderException {
		if (maleGender == null || femaleGender == null) {
			GenderHome home = (GenderHome) getIDOHome(Gender.class);
			maleGender = home.getMaleGender();
			femaleGender = home.getFemaleGender();
			System.out.println("NationalRegisterBusinessBean : setting up gender");
		}
		if (sex == null) {
			return null;
		} else if (sex.equals("1") || sex.equals("3")) {
			return maleGender;
		}	else {
			return femaleGender;
		}

	}

	private int getIcelandicCountryPK() throws RemoteException, FinderException {
		if (icelandCountryPK < 1) {
			Country country = ((CountryHome)getIDOHome(Country.class)).findByIsoAbbreviation("IS");
			icelandCountryPK = ((Integer) country.getPrimaryKey()).intValue();
			System.out.println("NationalRegisterBusinessBean : setting icelandCountryPK ("+icelandCountryPK+")");
		}
		return icelandCountryPK;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#beforeUserRemove(com.idega.user.data.User)
	 */
	@Override
	public void beforeUserRemove(User user, Group parentGroup) throws RemoveException, RemoteException {

	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#afterUserCreate(com.idega.user.data.User)
	 */
	@Override
	public void afterUserCreateOrUpdate(User user, Group parentGroup) throws CreateException, RemoteException {
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#beforeGroupRemove(com.idega.user.data.Group)
	 */
	@Override
	public void beforeGroupRemove(Group group, Group parentGroup) throws RemoveException, RemoteException {
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#afterGroupCreate(com.idega.user.data.Group)
	 */
	@Override
	public void afterGroupCreateOrUpdate(Group group, Group parentGroup) throws CreateException, RemoteException {
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#instanciateEditor(com.idega.user.data.Group)
	 */
	@Override
	public PresentationObject instanciateEditor(Group group) throws RemoteException {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#instanciateViewer(com.idega.user.data.Group)
	 */
	@Override
	public PresentationObject instanciateViewer(Group group) throws RemoteException {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#getUserPropertiesTabs(com.idega.user.data.User)
	 */
	@Override
	public List getUserPropertiesTabs(User user) throws RemoteException {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#getGroupPropertiesTabs(com.idega.user.data.Group)
	 */
	@Override
	public List getGroupPropertiesTabs(Group group) throws RemoteException {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#getMainToolbarElements()
	 */
	@Override
	public List getMainToolbarElements() throws RemoteException {
		List list = new ArrayList(1);
		list.add(new NationalRegisterFileImportHandlerPlugin());
		return list;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#getGroupToolbarElements(com.idega.user.data.Group)
	 */
	@Override
	public List getGroupToolbarElements(Group group) throws RemoteException {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#isUserAssignableFromGroupToGroup(com.idega.user.data.User, com.idega.user.data.Group, com.idega.user.data.Group)
	 */
	@Override
	public String isUserAssignableFromGroupToGroup(User user, Group sourceGroup, Group targetGroup) throws RemoteException {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#isUserSuitedForGroup(com.idega.user.data.User, com.idega.user.data.Group)
	 */
	@Override
	public String isUserSuitedForGroup(User user, Group targetGroup) throws RemoteException {
		return null;
	}

	@Override
	public FamilyLogic getFamilyLogic() throws RemoteException {
		return IBOLookup.getServiceInstance(getIWApplicationContext(), FamilyLogic.class);
	}

	/* (non-Javadoc)
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusiness#getPresentationObjectClass()
	 */
	@Override
	public Class getPresentationObjectClass() throws RemoteException {
		return null;
	}

	/* (non-Javadoc)
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusiness#getListViewerFields()
	 */
	@Override
	public Collection getListViewerFields() throws RemoteException {
		return null;
	}

	/* (non-Javadoc)
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusiness#findGroupsByFields(java.util.Collection, java.util.Collection, java.util.Collection)
	 */
	@Override
	public Collection findGroupsByFields(Collection listViewerFields, Collection finderOperators, Collection listViewerFieldValues) throws RemoteException {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.business.UserGroupPlugInBusiness#canCreateSubGroup(com.idega.user.data.Group,java.lang.String)
	 */
	@Override
	public String canCreateSubGroup(Group group, String groupTypeOfSubGroup) throws RemoteException {
		return null;
	}

	@Override
	public Country getCountryByISOAbbreviation(String isoAbbreviation) {
		if (countryIDs == null) {
			countryIDs = new HashMap<String, Country>();
		}

		if (countryIDs.containsKey(isoAbbreviation)) {
			return countryIDs.get(isoAbbreviation);
		}
		else {
			try {
				CountryHome home = (CountryHome) getIDOHome(Country.class);
				Country country = home.findByIsoAbbreviation(isoAbbreviation);
				countryIDs.put(isoAbbreviation, country);
				return country;
			}
			catch (FinderException fe) {
				return null;
			}
			catch (RemoteException re) {
				return null;
			}
		}
	}

	@Override
	public Integer getCommuneIDFromCommuneCode(String communeCode) {
		if (communeCodes == null) {
			communeCodes = new HashMap<String, Integer>();
		}

		if (communeCodes.containsKey(communeCode)) {
			return communeCodes.get(communeCode);
		}
		else {

			try {
				CommuneHome home = (CommuneHome) getIDOHome(Commune.class);
				Commune commune = home.findByCommuneCode(communeCode);
				Integer prKey = (Integer)commune.getPrimaryKey();
				communeCodes.put(communeCode, prKey);
				return prKey;
			}
			catch (FinderException fe) {
				return null;
			}
			catch (RemoteException re) {
				return null;
			}
		}
	}

	@Override
	public String getCityFromPostalCode(String postalCodeIdentifier, int countryID ) {
		if (cityNames == null) {
			cityNames = new HashMap<String, String>();
		}

		if (postalCodeIdentifier == null || postalCodeIdentifier.equals("   ")) {
			return null;
		}

		if (cityNames.containsKey(postalCodeIdentifier)) {
			return cityNames.get(postalCodeIdentifier);
		}
		else {
			try {
				PostalCodeHome home = (PostalCodeHome) getIDOHome(PostalCode.class);
				PostalCode postalCode = home.findByPostalCodeAndCountryId(postalCodeIdentifier, countryID);
				cityNames.put(postalCodeIdentifier, postalCode.getName());
				return postalCode.getName();
			}
			catch (FinderException fe) {
				return null;
			}
			catch (RemoteException re) {
				return null;
			}
		}
	}
}