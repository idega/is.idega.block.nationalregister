package is.idega.block.nationalregister.business;


import javax.ejb.CreateException;
import is.idega.block.family.business.FamilyLogic;
import com.idega.user.data.User;
import is.idega.block.nationalregister.data.NationalRegister;
import com.idega.user.business.UserGroupPlugInBusiness;
import java.rmi.RemoteException;
import com.idega.user.data.Group;
import com.idega.core.location.data.PostalCode;
import java.util.Collection;
import com.idega.business.IBOService;
import com.idega.user.business.UserBusiness;
import java.util.List;
import com.idega.business.IBOLookupException;
import com.idega.presentation.PresentationObject;
import com.idega.core.location.data.Country;
import javax.ejb.RemoveException;

public interface NationalRegisterBusiness extends IBOService,
		UserGroupPlugInBusiness {
	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getEntryBySSN
	 */
	public NationalRegister getEntryBySSN(String ssn) throws RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#updateEntryAddress
	 */
	public boolean updateEntryAddress(String ssn, String addressName)
			throws RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#updateEntry
	 */
	public boolean updateEntry(String symbol, String oldId, String ssn,
			String familyId, String name, String commune, String street,
			String building, String floor, String sex, String maritialStatus,
			String empty, String prohibitMarking, String nationality,
			String placeOfBirth, String spouseSSN, String fate, String parish,
			String po, String address, String addressCode,
			String dateOfModification, String placementCode,
			String dateOfCreation, String lastDomesticAddress, String agentSsn,
			String sNew, String addressName, String dateOfDeletion,
			String newSsnOrName, String dateOfBirth, Group citizenGroup)
			throws RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#updateUserPersonalID
	 */
	public void updateUserPersonalID(String oldPersonalID, String newPersonalID)
			throws IBOLookupException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#updateUserOldID
	 */
	public void updateUserOldID(String oldID, String personalID)
			throws IBOLookupException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#updateUserAddress
	 */
	public void updateUserAddress(User user, UserBusiness userBiz,
			String address, String po, Country country, String city,
			Integer communeID) throws RemoteException, CreateException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getPostalCode
	 */
	public PostalCode getPostalCode(String po) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#beforeUserRemove
	 */
	public void beforeUserRemove(User user, Group parentGroup)
			throws RemoveException, RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#afterUserCreateOrUpdate
	 */
	public void afterUserCreateOrUpdate(User user, Group parentGroup)
			throws CreateException, RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#beforeGroupRemove
	 */
	public void beforeGroupRemove(Group group, Group parentGroup)
			throws RemoveException, RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#afterGroupCreateOrUpdate
	 */
	public void afterGroupCreateOrUpdate(Group group, Group parentGroup)
			throws CreateException, RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#instanciateEditor
	 */
	public PresentationObject instanciateEditor(Group group)
			throws RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#instanciateViewer
	 */
	public PresentationObject instanciateViewer(Group group)
			throws RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getUserPropertiesTabs
	 */
	public List getUserPropertiesTabs(User user) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getGroupPropertiesTabs
	 */
	public List getGroupPropertiesTabs(Group group) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getMainToolbarElements
	 */
	public List getMainToolbarElements() throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getGroupToolbarElements
	 */
	public List getGroupToolbarElements(Group group) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#isUserAssignableFromGroupToGroup
	 */
	public String isUserAssignableFromGroupToGroup(User user,
			Group sourceGroup, Group targetGroup) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#isUserSuitedForGroup
	 */
	public String isUserSuitedForGroup(User user, Group targetGroup)
			throws RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getFamilyLogic
	 */
	public FamilyLogic getFamilyLogic() throws RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getPresentationObjectClass
	 */
	public Class getPresentationObjectClass() throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getListViewerFields
	 */
	public Collection getListViewerFields() throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#findGroupsByFields
	 */
	public Collection findGroupsByFields(Collection listViewerFields,
			Collection finderOperators, Collection listViewerFieldValues)
			throws RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#canCreateSubGroup
	 */
	public String canCreateSubGroup(Group group, String groupTypeOfSubGroup)
			throws RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getCountryByISOAbbreviation
	 */
	public Country getCountryByISOAbbreviation(String isoAbbreviation)
			throws RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getCommuneIDFromCommuneCode
	 */
	public Integer getCommuneIDFromCommuneCode(String communeCode)
			throws RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getCityFromPostalCode
	 */
	public String getCityFromPostalCode(String postalCodeIdentifier,
			int countryID) throws RemoteException;
}