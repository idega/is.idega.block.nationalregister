package is.idega.block.nationalregister.business;

import is.idega.block.nationalregister.data.NationalRegisterImportFileE36;

import java.io.File;
import java.util.logging.Level;

import org.directwebremoting.annotations.Param;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.IWContext;
import com.idega.util.CoreUtil;

@Service(ImportFromFileServices.BEAN_NAME)
@Scope(BeanDefinition.SCOPE_SINGLETON)
@RemoteProxy(creator=SpringCreator.class, creatorParams={
	@Param(name="beanName", value=ImportFromFileServices.BEAN_NAME),
	@Param(name="javascript", value="ImportFromFileServices")
}, name="ImportFromFileServices")
public class ImportFromFileServices extends DefaultSpringBean{
	public static final String BEAN_NAME = "importFromFileServices";

	private IWResourceBundle getIwrb(IWContext iwc) {
		IWResourceBundle iwrb = iwc.getIWMainApplication().getBundle(NationalRegisterConstants.IW_BUNDLE_IDENTIFIER).getResourceBundle(iwc);
		return iwrb;
	}

	@RemoteMethod
	public String importFromFile(String filePath){
		IWContext iwc = CoreUtil.getIWContext();
		IWResourceBundle iwrb = getIwrb(iwc);
		try{
			if(!iwc.isLoggedOn() || !iwc.getAccessController().isAdmin(iwc)){
				throw new Exception("Do not have permission");
			}
			NationalRegisterFileImportHandler handler = new NationalRegisterFileImportHandlerBean();

			NationalRegisterImportFileE36 file = new NationalRegisterImportFileE36();
			file.setFile(new File(filePath));
			handler.setImportFile(file);
			handler.handleRecords();
			return iwrb.getLocalizedString("success", "Success");
		}catch (Exception e) {
			getLogger().log(Level.WARNING, "Failed imorting from file: " + filePath, e);
		}
		return iwrb.getLocalizedString("error", "Error");
	}

}
