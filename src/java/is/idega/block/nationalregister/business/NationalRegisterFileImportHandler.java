package is.idega.block.nationalregister.business;

import com.idega.user.business.UserNationalRegisterFileImportHandler;


public interface NationalRegisterFileImportHandler extends com.idega.business.IBOService,com.idega.block.importer.business.ImportFileHandler, UserNationalRegisterFileImportHandler
{
 public java.util.List getFailedRecords()throws java.rmi.RemoteException, java.rmi.RemoteException;
 public boolean handleRecords()throws java.rmi.RemoteException, java.rmi.RemoteException;
 public void setImportFile(com.idega.block.importer.data.ImportFile p0)throws java.rmi.RemoteException, java.rmi.RemoteException;
 public void setRootGroup(com.idega.user.data.Group p0)throws java.rmi.RemoteException, java.rmi.RemoteException;
}
