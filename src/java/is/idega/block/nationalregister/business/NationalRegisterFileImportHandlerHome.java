package is.idega.block.nationalregister.business;


import javax.ejb.CreateException;
import com.idega.business.IBOHome;
import java.rmi.RemoteException;

public interface NationalRegisterFileImportHandlerHome extends IBOHome {
	public NationalRegisterFileImportHandler create() throws CreateException,
			RemoteException;
}