package is.idega.block.nationalregister.business;

import java.rmi.RemoteException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import com.idega.block.importer.business.ImportFileHandler;
import com.idega.block.importer.data.ImportFile;
import com.idega.block.importer.presentation.Importer;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBOServiceBean;
import com.idega.core.location.business.CommuneBusiness;
import com.idega.core.location.data.Commune;
import com.idega.core.location.data.PostalCode;
import com.idega.data.IDOLookup;
import com.idega.data.IDORelationshipException;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.IWContext;
import com.idega.user.business.UserBusiness;
import com.idega.user.data.Group;
import com.idega.user.data.User;
import com.idega.user.data.UserHome;
import com.idega.util.Age;
import com.idega.util.IWTimestamp;
import com.idega.util.ListUtil;
import com.idega.util.LocaleUtil;
import com.idega.util.StringUtil;
import com.idega.util.Timer;

import is.idega.block.family.business.FamilyLogic;
import is.idega.block.family.business.FamilyLogicBean;
import is.idega.block.family.data.FamilyMember;
import is.idega.block.family.data.FamilyMemberHome;
import is.idega.block.nationalregister.data.NationalRegisterFate;
import is.idega.block.nationalregister.data.NationalRegisterFateHome;

/**
 * @author palli
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates. To enable and disable the creation of type
 * comments go to Window>Preferences>Java>Code Generation.
 */
public class NationalRegisterFileImportHandlerBean extends IBOServiceBean implements NationalRegisterFileImportHandler,
		ImportFileHandler {

	private static final long serialVersionUID = -238506959496718436L;

	private ImportFile file;

	private List<String> failedRecordList = new ArrayList<String>();

	private List<String> valueList;

	private Collection<String> affectedFamilies = new HashSet<String>();

	public final static int COLUMN_SYMBOL = 0;

	public final static int COLUMN_OLD_ID = 1;

	public final static int COLUMN_SSN = 2;

	public final static int COLUMN_FAMILY_ID = 3;

	public final static int COLUMN_NAME = 4;

	public final static int COLUMN_COMMUNE = 5;

	public final static int COLUMN_STREET = 6;

	public final static int COLUMN_BUILDING = 7;

	public final static int COLUMN_FLOOR = 8;

	public final static int COLUMN_SEX = 9;

	public final static int COLUMN_MARITIAL_STATUS = 10;

	public final static int COLUMN_EMPTY = 11;

	public final static int COLUMN_NO_MAIL = 12;

	public final static int COLUMN_NATIONALITY = 13;

	public final static int COLUMN_PLACE_OF_BIRTH = 14;

	public final static int COLUMN_SPOUSE_SSN = 15;

	public final static int COLUMN_STATUS = 16;

	public final static int COLUMN_PARISH = 17;

	public final static int COLUMN_PO = 18;

	public final static int COLUMN_ADDRESS = 19;

	public final static int COLUMN_ADDRESS_CODE = 20;

	public final static int COLUMN_DATE_OF_MODIFICATION = 21;

	public final static int COLUMN_PLACEMENT_CODE = 22;

	public final static int COLUMN_DATE_OF_CREATION = 23;

	public final static int COLUMN_LAST_DOMESTIC_ADDRESS = 24;

	public final static int COLUMN_AGENT_SSN = 25;

	public final static int COLUMN_NEW = 26;

	public final static int COLUMN_ADDRESS_NAME = 27;

	public final static int COLUMN_DATE_OF_DELETION = 28;

	public final static int COLUMN_NEW_SSN_OR_NAME = 29;

	public final static int COLUMN_DATE_OF_BIRTH = 30;

	private final static String PROPERTY_NAME_RELATION_ONLY = "NAT_REG_RELATION_ONLY";

	private final static String PROPERTY_NAME_POSTAL_CODE_FIX = "NAT_REG_POSTAL_CODE_FIX";

	private final static String PROPERTY_NAME_GROUP_FIX = "NAT_REG_GROUP_ID_FIX";

	private final static String PROPERTY_NAME_SKIP_RELATIONS = "NAT_REG_SKIP_REL";

//	private final static String PROPERTY_NAME_SKIP_DECEASED = "NAT_REG_SKIP_DEAD";

	/*
	 * private final static String FATE_DECEASED = "L�ST"; private final static
	 * String FATE_CHANGE_PERSONAL_ID = "BRFD"; private final static String
	 * FATE_REMOVED = "BRFL"; //private final static String FATE_CHANGE_OLD_ID =
	 * "BRNN";
	 */
	private static String FATE_DECEASED = null;

	private static String FATE_CHANGE_PERSONAL_ID = null;

	private static String FATE_REMOVED = null;

	private boolean postalCodeFix = false;

	private boolean relationsOnly = false;

	private boolean citizenGroupFix = false;

	private boolean skipRelations = false;

//	private boolean skipDeceaced = false;

	private User performer = null;

	private FamilyLogic famLog = null;

	private final static int BYTES_PER_RECORD = 301;

	private NumberFormat twoDigits = NumberFormat.getNumberInstance();

	private NumberFormat precentNF = NumberFormat.getPercentInstance();

	private Map<String, Group> postalToGroupMap = new HashMap<String, Group>();

	private NationalRegisterBusiness natBiz;

	private UserBusiness uBiz;

	private CommuneBusiness cBiz;

	private String deceasedAddressString = null;

	public final static String IW_BUNDLE_IDENTIFIER = "is.idega.block.nationalregister";

	protected ImportFile getFile() {
		return file;
	}
	
	/**
	 * @see com.idega.block.importer.business.ImportFileHandler#handleRecords()
	 */
	@Override
	public boolean handleRecords() throws RemoteException {
		// UserTransaction transaction =
		// getSessionContext().getUserTransaction();
		Timer clock = new Timer();
		clock.start();
		Logger logger = getLogger();
		try {
			this.natBiz = getServiceInstance(NationalRegisterBusiness.class);
			this.uBiz = getServiceInstance(UserBusiness.class);
			this.cBiz = getServiceInstance(CommuneBusiness.class);
			if (FATE_DECEASED == null || FATE_CHANGE_PERSONAL_ID == null || FATE_REMOVED == null) {
				NationalRegisterFate fate = ((NationalRegisterFateHome) IDOLookup.getHome(NationalRegisterFate.class)).findByFateCode(NationalRegisterConstants.FATE_DECEASED);
				if (fate == null || fate.getFateString() == null || "".equals(fate.getFateString())) {
					logger.info("Missing DECEASED fate string in table reg_nat_is_fate");
					return false;
				}
				FATE_DECEASED = fate.getFateString();
				fate = ((NationalRegisterFateHome) IDOLookup.getHome(NationalRegisterFate.class)).findByFateCode(NationalRegisterConstants.FATE_CHANGE_PERSONAL_ID);
				if (fate == null || fate.getFateString() == null || "".equals(fate.getFateString())) {
					logger.info("Missing CHANGE PERSONAL ID fate string in table reg_nat_is_fate");
					return false;
				}
				FATE_CHANGE_PERSONAL_ID = fate.getFateString();
				fate = ((NationalRegisterFateHome) IDOLookup.getHome(NationalRegisterFate.class)).findByFateCode(NationalRegisterConstants.FATE_REMOVED);
				if (fate == null || fate.getFateString() == null || "".equals(fate.getFateString())) {
					logger.info("Missing REMOVED fate string in table reg_nat_is_fate");
					return false;
				}
				FATE_REMOVED = fate.getFateString();
			}
			try {
				this.performer = IWContext.getInstance().getCurrentUser();
			}
			catch (Exception n) {
				logger.info("IWContext instance not found");
				this.performer = null;
			}
			if (this.performer == null) {
				com.idega.user.data.bean.User admUser = this.getIWMainApplication().getAccessController().getAdministratorUser();
				this.performer = ((UserHome) IDOLookup.getHome(User.class)).findByPrimaryKey(admUser.getId());
			}
			// iterate through the records and process them
			String item;
			IWBundle bundle = getIWMainApplication().getBundle(Importer.IW_BUNDLE_IDENTIFIER);
			String sRelationOnly = bundle.getProperty(PROPERTY_NAME_RELATION_ONLY);
			String sPostal = bundle.getProperty(PROPERTY_NAME_POSTAL_CODE_FIX);
			String sGroup = bundle.getProperty(PROPERTY_NAME_GROUP_FIX);
			String sSkipRelations = bundle.getProperty(PROPERTY_NAME_SKIP_RELATIONS);
//			String sSkipDead = bundle.getProperty(PROPERTY_NAME_SKIP_DECEASED);
			this.affectedFamilies = new HashSet<String>();
			this.postalCodeFix = (sPostal != null && sPostal.equalsIgnoreCase("yes"));
			this.relationsOnly = (sRelationOnly != null && sRelationOnly.equalsIgnoreCase("yes"));
			this.citizenGroupFix = (sGroup != null && sGroup.equalsIgnoreCase("yes"));
			this.skipRelations = (sSkipRelations != null && sSkipRelations.equalsIgnoreCase("yes"));
//			this.skipDeceaced = (sSkipDead != null && sSkipDead.equalsIgnoreCase("yes"));
			int count = 0;
			if (this.postalCodeFix) {
				logger.info("NationalRegisterHandler postalCodeFix variable set to TRUE");
			}
			if (this.relationsOnly) {
				logger.info("NationalRegisterHandler relationsOnly variable set to TRUE");
			}
			if (this.citizenGroupFix) {
				logger.info("NationalRegisterHandler citizenGroupFix variable set to TRUE");
			}
			long totalBytes = getFile().getFile().length();
			long totalRecords = totalBytes / BYTES_PER_RECORD;
			if (totalRecords == 0) {
				Collection<String> allRecords = getFile().getRecords();
				totalRecords = ListUtil.isEmpty(allRecords) ? 1 : allRecords.size();
			}
			this.twoDigits.setMinimumIntegerDigits(2);
			long beginTime = System.currentTimeMillis();
			long lastTimeCheck = beginTime;
			long averageTimePerUser100 = 0;
			long timeLeft100 = 0;
			long estimatedTimeFinished100 = beginTime;
			IWTimestamp stamp;
			double progress = 0;
			int intervalBetweenOutput = 100;
			logger.info("NatRegImport processing RECORD [0] time: " + IWTimestamp.getTimestampRightNow().toString());
			while (!(item = (String) getFile().getNextRecord()).equals("")) {
				count++;
				try {
					if (!processRecord(item)) {
						this.failedRecordList.add(item);
					}
				} catch (Exception e) {
					logger.log(Level.WARNING, "Failed importing record :" + item, e);
				}
				if ((count % intervalBetweenOutput) == 0) {
					averageTimePerUser100 = (System.currentTimeMillis() - lastTimeCheck) / intervalBetweenOutput;
					lastTimeCheck = System.currentTimeMillis();
					timeLeft100 = averageTimePerUser100 * (totalRecords - count);
					estimatedTimeFinished100 = System.currentTimeMillis() + timeLeft100;
					progress = ((double) count) / ((double) totalRecords);
					logger.info("NatRegImport " + IWTimestamp.getTimestampRightNow().toString()
							+ ", processing RECORD [" + count + " / " + totalRecords + "]");
					stamp = new IWTimestamp(estimatedTimeFinished100);
					logger.info(" | " + this.precentNF.format(progress)
							+ " done, guestimated time left of PHASE 1 : " + getTimeString(timeLeft100)
							+ "  finish at " + stamp.getTime().toString());
				}
				item = null;
			}
			getFile().close();
			logger.info("NatRegImport processed RECORD [" + count + "] time: " + IWTimestamp.getTimestampRightNow().toString());
			clock.stop();
			long msTime = clock.getTime();
			long secTime = msTime / 1000;
			logger.info("Time to handleRecords: " + msTime + " ms  OR " + secTime + " s, averaging " + (msTime / count) + "ms per record");
			clock.start();
			if (!this.skipRelations) {
				handleFamilyRelation();
			}
			clock.stop();
			msTime = clock.getTime();
			secTime = msTime / 1000;
			logger.info("Time to handleFamilyRelation: " + clock.getTime() + " ms  OR " + ((int) (clock.getTime() / 1000)) + " s, averaging " + (msTime / count) + "ms per record");
			printFailedRecords();
			return true;
		} catch (Exception ex) {
			getLogger().log(Level.WARNING, "Error handling records from " + getFile(), ex);
			return false;
		} finally {
			doUpdateExternalContext(successData);
			reset();
		}
	}

	@Override
	public String getTimeString(long time) {
		long t = time;
		int milli = (int) (t % 1000);
		t = (t - milli) / 1000;
		int second = (int) (t % 60);
		t = (t - second) / 60;
		int minut = (int) (t) % 60;
		int hour = (int) ((t - minut) / 60);
		return this.twoDigits.format(hour) + ":" + this.twoDigits.format(minut) + ":" + this.twoDigits.format(second)
				+ "." + milli;
	}

	/**
	 * After all lines in the import file has been imported, the relations are
	 * handled. When the records are processed, the relations are stored in the
	 * ArrayList _familyRelations
	 *
	 * @return
	 * @throws RemoteException
	 */
	private boolean handleFamilyRelation() throws RemoteException {
		UserHome userHome = null;
		NationalRegisterBusiness natReg = null;
		try {
			natReg = getServiceInstance(NationalRegisterBusiness.class);
			UserBusiness userBusiness = getServiceInstance(UserBusiness.class);
			userHome = userBusiness.getUserHome();
		}
		catch (IBOLookupException e) {
			e.printStackTrace();
		}
		Logger logger = getLogger();
		if (this.affectedFamilies != null && userHome != null && natReg != null) {
			long totalRecords = this.affectedFamilies.size();
			long beginTime = System.currentTimeMillis();
			// long lastTimeCheck = beginTime;
			long averageTimePerUser = 0;
			// long averageTimePerUser100 = 0;
			long timeLeft = 0;
			// long timeLeft100 = 0;
			long estimatedTimeFinished = beginTime;
			// long estimatedTimeFinished100 = beginTime;
			IWTimestamp stamp;
			double progress = 0;
			int intervalBetweenOutput = 100;
			String key;
			int counter = 0;
			Collection<FamilyMember> familyColl;
			logger.info("NatRegImport Total families to handle = " + totalRecords);
			// Loop through all households/families
			for (Iterator<String> keysIter = this.affectedFamilies.iterator(); keysIter.hasNext();) {
				++counter;
				key = keysIter.next();
				if (StringUtil.isEmpty(key)) {
					continue;
				}
				key = key.trim();
				if (StringUtil.isEmpty(key)) {
					continue;
				}

				logger.info("NatRegImport processing family ('" + key + "') relations RECORD [" + counter + "] time: " + IWTimestamp.getTimestampRightNow().toString());


				try {
					familyColl = getFamilyMemberHome().findAllByFamilyNR(key);
					handleFamilyCollection(natReg, userHome, familyColl, key);
				} catch (Exception e) {
					logger.log(Level.WARNING, "NatRegImport ERROR, familyRelation failed for family: " + key, e);
				}
				if ((counter % intervalBetweenOutput) == 0) {
					/*
					 * averageTimePerUser100 = (System.currentTimeMillis() -
					 * lastTimeCheck) / intervalBetweenOutput; lastTimeCheck =
					 * System.currentTimeMillis(); timeLeft100 =
					 * averageTimePerUser100 * (totalRecords - counter);
					 * estimatedTimeFinished100 = System.currentTimeMillis() +
					 * timeLeft100;
					 */
					averageTimePerUser = (System.currentTimeMillis() - beginTime) / counter;
					progress = ((double) counter) / ((double) totalRecords);
					timeLeft = averageTimePerUser * (totalRecords - counter);
					estimatedTimeFinished = timeLeft + System.currentTimeMillis();
					logger.info("NatRegImport " + IWTimestamp.getTimestampRightNow().toString() + ", processing family RECORD [" + counter + " / " + totalRecords + "]");
					stamp = new IWTimestamp(estimatedTimeFinished);
					logger.info(" | " + this.precentNF.format(progress) + " done, guestimated time left of PHASE 2 : " + getTimeString(timeLeft) + "  finish at " + stamp.getTime().toString());
					// stamp = new IWTimestamp(estimatedTimeFinished100);
					// logger.infoln(" "+precentNF.format(progress)+" done,
					// guestimated time left of PHASE 2 :
					// "+getTimeString(timeLeft100)+" finish at
					// "+stamp.toString());
					// logger.infoln("NationalRegisterHandler processing
					// family relations RECORD [" + counter + "] time: " +
					// IWTimestamp.getTimestampRightNow().toString());
				}
			}
			logger.info("NatRegImport processed all families relations [total: " + counter + "] time: " + IWTimestamp.getTimestampRightNow().toString());
		} else {
			logger.info("No family relations to handle: " + affectedFamilies);
		}
		return true;
	}

	/**
	 *
	 * @param natRegBus
	 * @param familyLogic
	 * @param uHome
	 * @param coll
	 * @return
	 * @throws RemoveException
	 * @throws RemoveException
	 * @throws RemoteException
	 */
	private boolean handleFamilyCollection(NationalRegisterBusiness natRegBus, UserHome uHome, Collection<FamilyMember> coll, String key) throws RemoteException, RemoveException {
		if (ListUtil.isEmpty(coll)) {
			return false;
		}

		FamilyLogicBean memFamLog = getServiceInstance(FamilyLogicBean.class);
		is.idega.block.nationalregister.data.bean.NationalRegister natReg;
		Collection<FamilyMember> coll2 = new ArrayList<FamilyMember>(coll);
		Iterator<FamilyMember> iter2 = coll.iterator();
		Collection<User> parents = new ArrayList<User>();
		User user;
		User user2;
		Age age;
		int oldestAge = 0;
		String spouseSSN;
		User oldestPerson = null;
		FamilyMember member;
		// This iteration sets the spouse, parent, custodian, child and
		// sibling relations.
		// The relations variables hold the relations that yet not have been
		// found in the import file
		// If there are any relations left in these variables after the new
		// relations have been set,
		// They have to be removed
		Relations oldRelations1 = new Relations(getMemberFamilyLogic());
		Relations newRelations1 = new Relations(getMemberFamilyLogic());
		Relations oldRelations2 = new Relations(getMemberFamilyLogic());
		Relations newRelations2 = new Relations(getMemberFamilyLogic());
		HashMap<User, Relations> oldrelations = new HashMap<User, Relations>();
		HashMap<User, Relations> newrelations = new HashMap<User, Relations>();
		// Loop through all family members to figure out what the relations
		// are
		Logger logger = getLogger();
		for (Iterator<FamilyMember> iter = coll.iterator(); iter.hasNext();) {
			member = iter.next();
			user = member.getUser();
			if (user == null) {
				logger.info(" user == null : " + member.getPrimaryKey());
			}

			if (user.isDeceased()) {
				removeAllFamilyRelationsForUser(memFamLog, user);
				continue;
			}

			if (user.getDateOfBirth() != null) {
				age = new Age(user.getDateOfBirth());
				if (age.getYears() > oldestAge) {
					oldestAge = age.getYears();
					oldestPerson = user;
				}
			}
			// If person has a spouse, it is also registered as possible
			// parent
			natReg = natRegBus.getEntryBySSN(user.getPersonalID());
			spouseSSN = natReg == null ? null : natReg.getSpouseSSN();
			if (spouseSSN != null && !"".equals(spouseSSN.trim())) {
				parents.add(user);
				try {
					User spouse = uHome.findByPersonalID(spouseSSN);
					newRelations1 = new Relations(getMemberFamilyLogic());
					newRelations1.setUser(user);
					newRelations1.setSpouse(spouse);
					oldRelations1 = new Relations(getMemberFamilyLogic());
					oldRelations1.setForUser(user);
					newrelations.put(user, newRelations1);
					oldrelations.put(user, oldRelations1);
					newRelations2 = new Relations(getMemberFamilyLogic());
					newRelations2.setUser(spouse);
					newRelations2.setSpouse(user);
					oldRelations2 = new Relations(getMemberFamilyLogic());
					oldRelations2.setForUser(spouse);
					newrelations.put(spouse, newRelations2);
					oldrelations.put(spouse, oldRelations2);
					parents.add(spouse);
					break;
				}
				catch (FinderException e) {
					// logger.infoln("NationalRegisterHandler processed
					// family relations RECORD [" + counter + "] time: " +
					// IWTimestamp.getTimestampRightNow().toString());
					// e.printStackTrace();
				}
			}
		}
		getLogger().info("Finished handling spouses for family: " + key);

		if (parents.isEmpty() && oldestPerson != null) {
			parents.add(oldestPerson);
		}

		FamilyMember member2;
		for (Iterator<FamilyMember> iter = coll.iterator(); iter.hasNext();) {
			member = iter.next();
			user = member.getUser();
			if (oldrelations.get(user) == null) {
				oldRelations1 = new Relations(getMemberFamilyLogic());
				oldRelations1.setForUser(user);
				oldrelations.put(user, oldRelations1);
			}
			if (newrelations.get(user) == null) {
				newRelations1 = new Relations(getMemberFamilyLogic());
				newRelations1.setUser(user);
				newrelations.put(user, newRelations1);
			}
			else {
				newRelations1 = newrelations.get(user);
			}
			coll2.remove(member);
			iter2 = coll2.iterator();
			while (iter2.hasNext()) {
				member2 = iter2.next();
				user2 = member2.getUser();
				if (oldrelations.get(user2) == null) {
					oldRelations2 = new Relations(getMemberFamilyLogic());
					oldRelations2.setForUser(user2);
					oldrelations.put(user2, oldRelations2);
				}
				if (newrelations.get(user2) == null) {
					newRelations2 = new Relations(getMemberFamilyLogic());
					newRelations2.setUser(user2);
					newrelations.put(user2, newRelations2);
				}
				else {
					newRelations2 = newrelations.get(user2);
				}
				if (parents.contains(user)) {
					if (parents.contains(user2)) {
						newRelations1.setSpouse(user2);
						newRelations2.setSpouse(user);
					}
					else {
						newRelations1.addChild(user2);
						newRelations1.addIsCustodianFor(user2);
						newRelations2.addParent(user);
						newRelations2.addHasCustodian(user);
					}
				}
				else {
					if (parents.contains(user2)) {
						newRelations1.addParent(user2);
						newRelations1.addHasCustodian(user2);
						newRelations2.addChild(user);
						newRelations2.addIsCustodianFor(user);
					}
					else {
						newRelations1.addSibling(user2);
						newRelations2.addSibling(user);
					}
				}
			}
		}
		getLogger().info("Finished handling siblings, children, custodains, parents and spouses for family: " + key);

		for (User tmpuser: newrelations.keySet()) {
			Relations newR = newrelations.get(tmpuser);
			Relations oldR = oldrelations.get(tmpuser);
			try {
				Relations newToAdd = Relations.inANotB(newR, oldR, getMemberFamilyLogic());
				addNewRelations(memFamLog, tmpuser, newToAdd);
			}
			catch (CreateException e) {
				e.printStackTrace();
			}
			Relations oldToRemove = Relations.inANotB(oldR, newR, getMemberFamilyLogic());
			removeTerminatedRelations(memFamLog, tmpuser, oldToRemove);
		}
		getLogger().info("Finished handling family relations for family: " + key);

		return true;
	}

	/**
	 * Removes the old relations that previousley were set but now aren't in the
	 * import file and therefore should be removed
	 *
	 * @param user
	 * @param rel
	 * @throws RemoveException
	 * @throws RemoteException
	 */
	private void removeTerminatedRelations(FamilyLogicBean memFamLog, User user, Relations rel) throws RemoteException,
			RemoveException {
		// NationalRegisterBusiness natRegBus;
		// remove spouse
		// logger.infoln("REMOVING");
		// rel.dumpInfo();
		if (null != rel.getSpouse()) {
			memFamLog.removeAsSpouseFor(user, rel.getSpouse(), this.performer);
		}
		// Remove from collections
		Iterator<User> iter = rel.getChildren().iterator();
		while (iter.hasNext()) {
			User child = iter.next();
			memFamLog.removeAsChildFor(child, user, this.performer);
		}
		iter = rel.getIsCustodianFor().iterator();
		while (iter.hasNext()) {
			User child = iter.next();
			memFamLog.removeAsCustodianFor(user, child, this.performer);
		}
		iter = rel.getHasCustodians().iterator();
		while (iter.hasNext()) {
			User custodian = iter.next();
			memFamLog.removeAsCustodianFor(custodian, user, this.performer);
		}
		iter = rel.getParents().iterator();
		while (iter.hasNext()) {
			User parent = iter.next();
			memFamLog.removeAsParentFor(parent, user, this.performer);
		}
		iter = rel.getSiblings().iterator();
		while (iter.hasNext()) {
			User sibling = iter.next();
			memFamLog.removeAsSiblingFor(user, sibling, this.performer);
		}
	}

	private boolean isAllowedDeceasedPersonInFamilyRelations() {
		return getIWMainApplication().getSettings().getBoolean("nr.import_allow_deceased", Boolean.FALSE);
	}

	private boolean isAllowedToAddToFamily(User user) {
		if (user == null) {
			return false;
		}

		if (!user.isDeceased()) {
			return true;
		}

		return isAllowedDeceasedPersonInFamilyRelations();
	}

	private void removeAllFamilyRelationsForUser(User user) {
		removeAllFamilyRelationsForUser(null, user);
	}
	private void removeAllFamilyRelationsForUser(FamilyLogicBean memFamLog, User user) {
		try {
			if (user != null && user.isDeceased()) {
				memFamLog = memFamLog == null ?
						getServiceInstance(FamilyLogicBean.class) :
						memFamLog;

				getLogger().info("Removing all family relation for " + user + ", personal ID: " + user.getPersonalID());
				memFamLog.removeAllFamilyRelationsForUser(user, performer);
			}
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error removing all family relations for " + user + ", personal ID: " + user.getPersonalID());
		}
	}

	private void addNewRelations(FamilyLogicBean memFamLog, User user, Relations rel) throws RemoveException, RemoteException, CreateException {
		if (user.isDeceased()) {
			removeAllFamilyRelationsForUser(memFamLog, user);
			return;
		}

		// remove spouse
		User spouse = rel.getSpouse();
		if (spouse != null) {
			if (spouse.isDeceased()) {
				memFamLog.removeAsSpouseFor(user, spouse);
			} else if (isAllowedToAddToFamily(spouse)) {
				memFamLog.setAsSpouseFor(user, spouse);
			} else {
				memFamLog.removeAsSpouseFor(user, spouse);
			}
		}
		// Remove from collections
		Iterator<User> iter = rel.getChildren().iterator();
		while (iter.hasNext()) {
			User child = iter.next();
			if (child != null && child.isDeceased()) {
				memFamLog.removeAsChildFor(child, user);
			} else if (isAllowedToAddToFamily(child)) {
				memFamLog.setAsChildFor(child, user);
			} else {
				memFamLog.removeAsChildFor(child, user);
			}
		}
		iter = rel.getIsCustodianFor().iterator();
		while (iter.hasNext()) {
			User child = iter.next();
			if (child != null && child.isDeceased()) {
				memFamLog.removeAsChildFor(child, user);
			} else if (isAllowedToAddToFamily(child)) {
				memFamLog.setAsCustodianFor(user, child);
			} else {
				memFamLog.removeAsCustodianFor(user, child);
			}
		}
		iter = rel.getHasCustodians().iterator();
		while (iter.hasNext()) {
			User custodian = iter.next();
			if (custodian != null && custodian.isDeceased()) {
				memFamLog.removeAsCustodianFor(custodian, user);
			} else if (isAllowedToAddToFamily(user)) {
				memFamLog.setAsCustodianFor(custodian, user);
			} else {
				memFamLog.removeAsCustodianFor(custodian, user);
			}
		}
		iter = rel.getParents().iterator();
		while (iter.hasNext()) {
			User parent = iter.next();
			if (parent != null && parent.isDeceased()) {
				memFamLog.removeAsParentFor(parent, user);
			} else if (isAllowedToAddToFamily(user)) {
				memFamLog.setAsParentFor(parent, user);
			} else {
				memFamLog.removeAsParentFor(parent, user);
			}
		}
		iter = rel.getSiblings().iterator();
		while (iter.hasNext()) {
			User sibling = iter.next();
			if (sibling != null && sibling.isDeceased()) {
				memFamLog.removeAsSiblingFor(user, sibling);
			} else if (isAllowedToAddToFamily(user)) {
				memFamLog.setAsSiblingFor(user, sibling);
			} else {
				memFamLog.removeAsSiblingFor(user, sibling);
			}
		}
	}

	protected void doUpdateExternalContext(List<Map<Integer, String>> data) {
	}

	private List<Map<Integer, String>> successData = new ArrayList<Map<Integer,String>>();

	protected void reset() {
		successData = new ArrayList<Map<Integer,String>>();
	}

	private boolean processRecord(String record) throws RemoteException, CreateException {
		this.valueList = this.file.getValuesFromRecordString(record);
		Map<Integer, String> data = storeNationRegisterEntry();
		boolean success = data != null;
		if (success) {
			successData.add(data);
		}
		this.valueList = null;
		return success;
	}

	@Override
	public void printFailedRecords() {
		if (ListUtil.isEmpty(failedRecordList)) {
			return;
		}

		getLogger().warning("Import failed for these records, please fix and import again:");
		Iterator<String> iter = this.failedRecordList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	protected boolean updateNationRegisterEntry() throws RemoteException, CreateException {
		// variables
		String ssn = getProperty(COLUMN_SSN);
		String addressName = getProperty(COLUMN_ADDRESS_NAME);

		if (ssn == null || ssn.equals("")) {
			return false;
		}

		return this.natBiz.updateEntryAddress(ssn, addressName);
	}

	private Map<Integer, String> storeNationRegisterEntry() throws RemoteException, CreateException {
		Map<Integer, String> data = new HashMap<Integer, String>();

		// variables
		String symbol = getProperty(COLUMN_SYMBOL, data);
		String oldId = getProperty(COLUMN_OLD_ID, data);
		String ssn = getProperty(COLUMN_SSN, data);
		String familyId = getProperty(COLUMN_FAMILY_ID, data);
		String name = getProperty(COLUMN_NAME, data);
		String commune = getProperty(COLUMN_COMMUNE, data);
		String street = getProperty(COLUMN_STREET, data);
		String building = getProperty(COLUMN_BUILDING, data);
		String floor = getProperty(COLUMN_FLOOR, data);
		String sex = getProperty(COLUMN_SEX, data);
		String maritialStatus = getProperty(COLUMN_MARITIAL_STATUS, data);
		String empty = getProperty(COLUMN_EMPTY, data);
		String prohibitMarking = getProperty(COLUMN_NO_MAIL, data);
		String nationality = getProperty(COLUMN_NATIONALITY, data);
		String placeOfBirth = getProperty(COLUMN_PLACE_OF_BIRTH, data);
		String spouseSSN = getProperty(COLUMN_SPOUSE_SSN, data);
		String fate = getProperty(COLUMN_STATUS, data);
		String parish = getProperty(COLUMN_PARISH, data);
		String po = getProperty(COLUMN_PO, data);
		String address = getProperty(COLUMN_ADDRESS, data);
		String addressCode = getProperty(COLUMN_ADDRESS_CODE, data);
		String dateOfModification = getProperty(COLUMN_DATE_OF_MODIFICATION, data);
		String placementCode = getProperty(COLUMN_PLACEMENT_CODE, data);
		String dateOfCreation = getProperty(COLUMN_DATE_OF_CREATION, data);
		String lastDomesticAddress = getProperty(COLUMN_LAST_DOMESTIC_ADDRESS, data);
		String agentSsn = getProperty(COLUMN_AGENT_SSN, data);
		String sNew = getProperty(COLUMN_NEW, data);
		String addressName = getProperty(COLUMN_ADDRESS_NAME, data);
		String dateOfDeletion = getProperty(COLUMN_DATE_OF_DELETION, data);
		String newSsnOrName = getProperty(COLUMN_NEW_SSN_OR_NAME, data);
		String dateOfBirth = getProperty(COLUMN_DATE_OF_BIRTH, data);

		boolean success = true;
		if (StringUtil.isEmpty(ssn)) {
			return null;
		}

		Group group = getGroupForPostalCode(po);
		if (!this.relationsOnly) {
			// initialize business beans and data homes
			success = this.natBiz.updateEntry(symbol, oldId, ssn, familyId, name, commune, street, building, floor,
					sex, maritialStatus, empty, prohibitMarking, nationality, placeOfBirth, spouseSSN, fate, parish,
					po, address, addressCode, dateOfModification, placementCode, dateOfCreation, lastDomesticAddress,
					agentSsn, sNew, addressName, dateOfDeletion, newSsnOrName, dateOfBirth, group);

			if (FATE_DECEASED.equalsIgnoreCase(fate)) {
				User user;
				try {
					user = this.uBiz.getUser(ssn);
				}
				catch (FinderException e) {
					getLogger().log(Level.WARNING, "Failed to find user by personal ID: " + ssn, e);
					return null;
				}

				if (this.deceasedAddressString == null) {
					try {
						IWBundle iwb = this.getIWApplicationContext().getIWMainApplication().getBundle(
								IW_BUNDLE_IDENTIFIER);
						IWResourceBundle iwrb = iwb.getResourceBundle(LocaleUtil.getIcelandicLocale());
						this.deceasedAddressString = iwrb.getLocalizedString("national_register.deceased", "Deceased");
					}
					catch (Exception e) {
						this.deceasedAddressString = "";
						getLogger().warning("Unable to initialize deceasedAddressString");
					}
				}
				this.uBiz.updateUsersMainAddressOrCreateIfDoesNotExist(user, this.deceasedAddressString, null, null,
						null, null, null, null);
				this.uBiz.updateUsersCoAddressOrCreateIfDoesNotExist(user, this.deceasedAddressString, null, null,
						null, null, null, null);
				FamilyLogic familyService = getMemberFamilyLogic();
				IWTimestamp dom = new IWTimestamp();
				if (dateOfModification != null && !"".equals(dateOfModification.trim())) {
					try {
						dom = new IWTimestamp(dateOfModification);
					}
					catch (IllegalArgumentException e) {
						getLogger().log(Level.WARNING, "Could not parse the date '" + dateOfModification + "'", e);
						dom = IWTimestamp.RightNow();
					}
				}
				else {
					dom = IWTimestamp.RightNow();
				}
				familyService.registerAsDeceased(user, dom.getDate(), this.performer);
				removeAllFamilyRelationsForUser(user);
			}
			if (FATE_CHANGE_PERSONAL_ID.equalsIgnoreCase(fate)) {
				try {
					User user = this.uBiz.getUser(ssn);
					if (user != null) {
						user.setPersonalID(newSsnOrName);
					}
				}
				catch (FinderException e1) {
					e1.printStackTrace();
				}
				return success ? data : null;
			}
			if (FATE_REMOVED.equalsIgnoreCase(fate)) {
				try {
					User user = this.uBiz.getUser(ssn);
					this.uBiz.deleteUser(user, this.performer);
				}
				catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				return success ? data : null;
			}
			/*
			 * if(FATE_CHANGE_OLD_ID.equalsIgnoreCase(fate)){
			 * natBiz.updateUserOldID(oldId,ssn); return true; }
			 */
			if (this.postalCodeFix) {
				try {
					// User user = uBiz.getUser(ssn);
					if (this.postalCodeFix) {
						this.natBiz.updateUserAddress(this.uBiz.getUser(ssn), this.uBiz, address, po, null, null, null, null);
					}
					return success ? data : null;
				}
				catch (Exception e) {
					return null;
				}
			}
		}
		else { // Handling thing otherwise not handled in relationsship
			// only mode
			if (this.citizenGroupFix) {
				User user;
				try {
					user = this.uBiz.getUser(ssn);
					user.setPrimaryGroup(group);
					user.store();
				}
				catch (FinderException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
		// Family is marked as affected, and needs to be updated
		this.affectedFamilies.add(familyId);
		try {
			// Users previous family is marked as affected, and needs to be
			// updated
			this.affectedFamilies.add(getFamilyMemberHome().findBySSN(ssn).getFamilyNr());
		}
		catch (IDORelationshipException e) {
			e.printStackTrace();
		}
		catch (FinderException e) {
			// FinderExxception is ignored, since not all users have a family
		}
		return success ? data : null;
	}

	/**
	 * @param po
	 * @return
	 * @throws CreateException
	 * @throws RemoteException
	 */
	private Group getGroupForPostalCode(String po) throws RemoteException, CreateException {
		// First see if it already has been fetched and stored in map. If so
		// just return it
		Group group = this.postalToGroupMap.get(po);
		if (null != group) {
			return group;
		}
		// Group not found, so finding it
		PostalCode postalCode = this.natBiz.getPostalCode(po);
		if (postalCode != null) {
			Commune commune = this.cBiz.getCommuneByPostalCode(postalCode);
			if (commune != null && commune.getGroup() != null) {
				group = commune.getGroup();
				this.postalToGroupMap.put(po, group);
			}
		}
		else {
			try {
				group = this.cBiz.getOtherCommuneCreateIfNotExist().getGroup();
				if (null != group) {
					getLogger().info("NationalRegisterImport : connecting po:'" + po + "' to group:'" + group.getName() + "'");
				}
				this.postalToGroupMap.put(po, group);
			}
			catch (FinderException e) {
				getLogger().warning("NationalRegisterImport : 'Other' group not found, throwing RuntimeException. \n\nMake sure the PostalCodeBundleStarter is run at least once.");
				throw new RuntimeException(e);
			}
		}
		return group;
	}

	private String getProperty(int columnIndex) {
		return getProperty(columnIndex, null);
	}

	private String getProperty(int columnIndex, Map<Integer, String> data) {
		String value = null;
		if (this.valueList != null) {
			try {
				value = this.valueList.get(columnIndex);
			} catch (RuntimeException e) {
				return null;
			}
			if (getFile().getEmptyValueString().equals(value)) {
				return null;
			} else {
				if (data != null) {
					data.put(columnIndex, value);
				}
				return value;
			}
		} else {
			return null;
		}
	}

	/**
	 * @see com.idega.block.importer.business.ImportFileHandler#setImportFile(com.idega.block.importer.data.ImportFile)
	 */
	@Override
	public void setImportFile(ImportFile file) throws RemoteException {
		this.file = file;
	}

	/**
	 * @see com.idega.block.importer.business.ImportFileHandler#setRootGroup(com.idega.user.data.Group)
	 */
	@Override
	public void setRootGroup(Group rootGroup) throws RemoteException {
	}

	/**
	 * @see com.idega.block.importer.business.ImportFileHandler#getFailedRecords()
	 */
	@Override
	public List<String> getFailedRecords() throws RemoteException {
		return this.failedRecordList;
	}

	@Override
	public List<String> getSuccessRecords() throws RemoteException {
		return new ArrayList<String>();
	}

	@Override
	public FamilyLogic getMemberFamilyLogic() throws RemoteException {
		if (this.famLog == null) {
			this.famLog = IBOLookup.getServiceInstance(getIWApplicationContext(), FamilyLogic.class);
		}
		return this.famLog;
	}

	protected FamilyMemberHome getFamilyMemberHome() {
		try {
			return (FamilyMemberHome) this.getIDOHome(FamilyMember.class);
		}
		catch (RemoteException e) {
			throw new EJBException(e.getMessage());
		}
	}
	// TODO add fix for specific groupIDs for certain people
}