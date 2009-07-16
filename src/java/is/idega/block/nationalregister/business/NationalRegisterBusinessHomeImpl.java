package is.idega.block.nationalregister.business;


import javax.ejb.CreateException;
import com.idega.business.IBOHomeImpl;

public class NationalRegisterBusinessHomeImpl extends IBOHomeImpl implements
		NationalRegisterBusinessHome {
	@Override
	public Class<NationalRegisterBusiness> getBeanInterfaceClass() {
		return NationalRegisterBusiness.class;
	}

	public NationalRegisterBusiness create() throws CreateException {
		return (NationalRegisterBusiness) super.createIBO();
	}
}