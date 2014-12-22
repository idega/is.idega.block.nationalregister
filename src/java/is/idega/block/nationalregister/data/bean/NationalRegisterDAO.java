package is.idega.block.nationalregister.data.bean;

import com.idega.core.persistence.GenericDao;

public interface NationalRegisterDAO extends GenericDao {

	public NationalRegister findBySSN(String ssn);

	public NationalRegister update(NationalRegister entry);

}