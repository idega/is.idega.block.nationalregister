/**
 * 
 */
package is.idega.block.nationalregister.data;


import java.util.Collection;
import java.util.logging.Level;

import javax.ejb.CreateException;
import javax.ejb.FinderException;

import com.idega.data.IDOFactory;
import com.idega.data.IDOStoreException;
import com.idega.util.StringUtil;

/**
 * @author bluebottle
 *
 */
public class NationalRegisterFateHomeImpl extends IDOFactory implements
		NationalRegisterFateHome {
	protected Class getEntityInterfaceClass() {
		return NationalRegisterFate.class;
	}

	public NationalRegisterFate create() throws javax.ejb.CreateException {
		return (NationalRegisterFate) super.createIDO();
	}

	public NationalRegisterFate findByPrimaryKey(Object pk)
			throws javax.ejb.FinderException {
		return (NationalRegisterFate) super.findByPrimaryKeyIDO(pk);
	}

	public Collection findAll() throws FinderException {
		com.idega.data.IDOEntity entity = this.idoCheckOutPooledEntity();
		java.util.Collection ids = ((NationalRegisterFateBMPBean) entity)
				.ejbFindAll();
		this.idoCheckInPooledEntity(entity);
		return this.getEntityCollectionForPrimaryKeys(ids);
	}

	public NationalRegisterFate findByFateCode(String fateCode)
			throws FinderException {
		com.idega.data.IDOEntity entity = this.idoCheckOutPooledEntity();
		Object pk = ((NationalRegisterFateBMPBean) entity)
				.ejbFindByFateCode(fateCode);
		this.idoCheckInPooledEntity(entity);
		return this.findByPrimaryKey(pk);
	}

	/*
	 * (non-Javadoc)
	 * @see is.idega.block.nationalregister.data.NationalRegisterFateHome#update(java.lang.String, java.lang.String)
	 */
	@Override
	public NationalRegisterFate update(String fateCode, String description) throws IDOStoreException, CreateException {
		NationalRegisterFate entity = null;
		try {
			entity = findByFateCode(fateCode);
		} catch (FinderException e) {
			getLog().log(Level.INFO, "No entry found by argument: " + fateCode);
		}

		if (entity == null) {
			entity = create();
		}

		entity.setFateCode(fateCode);
		if (!StringUtil.isEmpty(description)) {
			entity.setFateString(description);
		}

		entity.store();

		return entity;
	}
}
