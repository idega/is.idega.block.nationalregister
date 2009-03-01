package is.idega.block.nationalregister.business;


import javax.ejb.CreateException;
import com.idega.business.IBOHomeImpl;

public class NationalRegisterFileImportHandlerHomeImpl extends IBOHomeImpl
		implements NationalRegisterFileImportHandlerHome {
	@Override
	public Class<NationalRegisterFileImportHandler> getBeanInterfaceClass() {
		return NationalRegisterFileImportHandler.class;
	}

	public NationalRegisterFileImportHandler create() throws CreateException {
		return (NationalRegisterFileImportHandler) super.createIBO();
	}
}