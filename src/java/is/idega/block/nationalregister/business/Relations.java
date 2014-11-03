package is.idega.block.nationalregister.business;

import is.idega.block.family.business.FamilyLogic;
import is.idega.block.family.business.NoChildrenFound;
import is.idega.block.family.business.NoCustodianFound;
import is.idega.block.family.business.NoParentFound;
import is.idega.block.family.business.NoSpouseFound;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.idega.business.IBOLookupException;
import com.idega.user.data.User;


/**
 * @author gimmi
 */
public class Relations{
	private User user = null;
	private User spouse = null;
	private Collection<User> child = new ArrayList<User>();
	private Collection<User> parent = new ArrayList<User>();
	private Collection<User> isCustodianFor = new ArrayList<User>();
	private Collection<User> hasCustodian = new ArrayList<User>();
	private Collection<User> sibling = new ArrayList<User>();
	private FamilyLogic memFamLog = null;

	public Relations(FamilyLogic famLog) {
		this.memFamLog = famLog;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setSpouse(User spouse) {
		this.spouse = spouse;
	}

	public void addChild(User child) {
		if (!this.child.contains(child)) {
			this.child.add(child);
		}
	}

	public void addParent(User parent) {
		if (!this.parent.contains(parent)) {
			this.parent.add(parent);
		}
	}

	public void addIsCustodianFor(User user) {
		if (!this.isCustodianFor.contains(user)) {
			this.isCustodianFor.add(user);
		}
	}

	public void addHasCustodian(User user) {
		if (!this.hasCustodian.contains(user)) {
			this.hasCustodian.add(user);
		}
	}

	public void addSibling(User user) {
		if (!this.sibling.contains(user)) {
			this.sibling.add(user);
		}
	}

	public User getSpouse() {
		return this.spouse;
	}

	public Collection<User> getHasCustodians() {
		return this.hasCustodian;
	}

	public Collection<User> getIsCustodianFor() {
		return this.isCustodianFor;
	}

	public Collection<User> getParents() {
		return this.parent;
	}

	public Collection<User> getSiblings() {
		return this.sibling;
	}

	public Collection<User> getChildren() {
		return this.child;
	}

	public void dumpInfo(){
		System.out.println("Relations for user "+this.user.getName()+" - "+this.user.getPersonalID());
		if(null!=this.spouse){
			System.out.println("spouse: "+this.spouse+" - "+this.spouse.getPersonalID());
		}
		Iterator<User> iter = this.child.iterator();
		while(iter.hasNext()){
			User user = iter.next();
			System.out.println("child: "+user.getName()+" - "+user.getPersonalID());
		}
		iter = this.parent.iterator();
		while(iter.hasNext()){
			User user = iter.next();
			System.out.println("parent: "+user.getName()+" - "+user.getPersonalID());
		}
		iter = this.isCustodianFor.iterator();
		while(iter.hasNext()){
			User user = iter.next();
			System.out.println("is custodian for: "+user.getName()+" - "+user.getPersonalID());
		}
		iter = this.hasCustodian.iterator();
		while(iter.hasNext()){
			User user = iter.next();
			System.out.println("has custodian: "+user.getName()+" - "+user.getPersonalID());
		}
		iter = this.sibling.iterator();
		while(iter.hasNext()){
			User user = iter.next();
			System.out.println("sibling: "+user.getName()+" - "+user.getPersonalID());
		}
	}

	public void setForUser(User user) throws IBOLookupException, RemoteException{
		this.user = user;
		try {
			this.spouse = this.memFamLog.getSpouseFor(user);
		}
		catch (NoSpouseFound e) {
			this.spouse = null;
		}

		try {
			this.child = this.memFamLog.getChildrenFor(user);
		}
		catch (NoChildrenFound e1) {
		}

		try {
			this.parent = this.memFamLog.getParentsFor(user);
		}
		catch (NoParentFound e) {
		}

		try {
			this.isCustodianFor = this.memFamLog.getChildrenInCustodyOf(user);
		}
		catch (NoChildrenFound e) {
		}

		try {
			this.hasCustodian = this.memFamLog.getCustodiansFor(user);
		}
		catch (NoCustodianFound e) {
		}

		this.sibling = this.memFamLog.getSiblingsFor(user);
	}

	public static Relations inANotB(Relations a, Relations b, FamilyLogic famLoc) throws IllegalArgumentException {
		Relations c = new Relations(famLoc);
		if (a.user != b.user) {
			throw new IllegalArgumentException("Relations must contain same users");
		} else {
			c.user = a.user;
		}
		c.spouse = a.spouse;
		c.child = new ArrayList<User>(a.child);
		c.hasCustodian = new ArrayList<User>(a.hasCustodian);
		c.isCustodianFor = new ArrayList<User>(a.isCustodianFor);
		c.parent = new ArrayList<User>(a.parent);
		c.sibling = new ArrayList<User>(a.sibling);


		if (a.spouse != null && a.spouse.equals(b.spouse)) {
			c.spouse = null;
		}

		Iterator<User> iter = b.child.iterator();
		while (iter.hasNext()) {
			c.child.remove(iter.next());
		}
		iter = b.hasCustodian.iterator();
		while (iter.hasNext()) {
			c.hasCustodian.remove(iter.next());
		}
		iter = b.isCustodianFor.iterator();
		while (iter.hasNext()) {
			c.isCustodianFor.remove(iter.next());
		}
		iter = b.parent.iterator();
		while (iter.hasNext()) {
			c.parent.remove(iter.next());
		}
		iter = b.sibling.iterator();
		while (iter.hasNext()) {
			c.sibling.remove(iter.next());
		}

		return c;
	}
}
