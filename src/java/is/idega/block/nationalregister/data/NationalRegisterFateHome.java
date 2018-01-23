/**
 * 
 */
package is.idega.block.nationalregister.data;


import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;

import com.idega.data.IDOHome;
import com.idega.data.IDOStoreException;

/**
 * @author bluebottle
 *
 */
public interface NationalRegisterFateHome extends IDOHome {
	public NationalRegisterFate create() throws javax.ejb.CreateException;

	public NationalRegisterFate findByPrimaryKey(Object pk)
			throws javax.ejb.FinderException;

	/**
	 * @see is.idega.block.nationalregister.data.NationalRegisterFateBMPBean#ejbFindAll
	 */
	public Collection findAll() throws FinderException;

	/**
	 * @see is.idega.block.nationalregister.data.NationalRegisterFateBMPBean#ejbFindByFateCode
	 */
	public NationalRegisterFate findByFateCode(String fateCode)
			throws FinderException;

	/**
	 * 
	 * @param fateCode which is recognized by system, not <code>null</code>
	 * @param description to define this fate, skipped if <code>null</code>
	 * @return updated/created record or <code>null</code> on failure
	 * @throws CreateException 
	 * @throws IDOStoreException 
	 */
	public NationalRegisterFate update(String fateCode, String description) throws IDOStoreException, CreateException;
}
