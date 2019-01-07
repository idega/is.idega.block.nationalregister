package is.idega.block.nationalregister.business;


import java.rmi.RemoteException;
import java.util.Collection;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.RemoveException;

import com.idega.business.IBOLookupException;
import com.idega.business.IBOService;
import com.idega.core.location.data.Country;
import com.idega.core.location.data.PostalCode;
import com.idega.presentation.PresentationObject;
import com.idega.user.business.UserBusiness;
import com.idega.user.business.UserGroupPlugInBusiness;
import com.idega.user.data.Group;
import com.idega.user.data.User;

import is.idega.block.family.business.FamilyLogic;
import is.idega.block.nationalregister.data.bean.NationalRegister;
import is.idega.block.nationalregister.data.bean.NationalRegisterDAO;

public interface NationalRegisterBusiness extends IBOService, UserGroupPlugInBusiness {

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getEntryBySSN
	 */
	public NationalRegister getEntryBySSN(String ssn) throws RemoteException;

	public NationalRegisterDAO getNationalRegisterDAO();

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
			String newSsnOrName, String dateOfBirth, Group citizenGroup, String city)
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
			Integer communeID, String addressName) throws RemoteException, CreateException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getPostalCode
	 */
	public PostalCode getPostalCode(String po) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#beforeUserRemove
	 */
	@Override
	public void beforeUserRemove(User user, Group parentGroup)
			throws RemoveException, RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#afterUserCreateOrUpdate
	 */
	@Override
	public void afterUserCreateOrUpdate(User user, Group parentGroup)
			throws CreateException, RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#beforeGroupRemove
	 */
	@Override
	public void beforeGroupRemove(Group group, Group parentGroup)
			throws RemoveException, RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#afterGroupCreateOrUpdate
	 */
	@Override
	public void afterGroupCreateOrUpdate(Group group, Group parentGroup)
			throws CreateException, RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#instanciateEditor
	 */
	@Override
	public PresentationObject instanciateEditor(Group group)
			throws RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#instanciateViewer
	 */
	@Override
	public PresentationObject instanciateViewer(Group group)
			throws RemoteException, RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getUserPropertiesTabs
	 */
	@Override
	public List getUserPropertiesTabs(User user) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getGroupPropertiesTabs
	 */
	@Override
	public List getGroupPropertiesTabs(Group group) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getMainToolbarElements
	 */
	@Override
	public List getMainToolbarElements() throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#getGroupToolbarElements
	 */
	@Override
	public List getGroupToolbarElements(Group group) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#isUserAssignableFromGroupToGroup
	 */
	@Override
	public String isUserAssignableFromGroupToGroup(User user,
			Group sourceGroup, Group targetGroup) throws RemoteException,
			RemoteException;

	/**
	 * @see is.idega.block.nationalregister.business.NationalRegisterBusinessBean#isUserSuitedForGroup
	 */
	@Override
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
	@Override
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

	public User getUserFromNationalRegistry(String personalId);

}