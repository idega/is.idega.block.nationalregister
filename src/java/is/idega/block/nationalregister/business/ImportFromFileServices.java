package is.idega.block.nationalregister.business;

import java.io.File;
import java.util.logging.Level;

import org.directwebremoting.annotations.Param;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.importer.data.ImportFile;
import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.IWContext;
import com.idega.util.CoreUtil;
import com.idega.util.StringUtil;

import is.idega.block.nationalregister.data.NationalRegisterImportFile;
import is.idega.block.nationalregister.data.NationalRegisterImportFileE32;
import is.idega.block.nationalregister.data.NationalRegisterImportFileE36;

@Service(ImportFromFileServices.BEAN_NAME)
@Scope(BeanDefinition.SCOPE_SINGLETON)
@RemoteProxy(creator=SpringCreator.class, creatorParams={
	@Param(name="beanName", value=ImportFromFileServices.BEAN_NAME),
	@Param(name="javascript", value="ImportFromFileServices")
}, name="ImportFromFileServices")
public class ImportFromFileServices extends DefaultSpringBean {

	public static final String BEAN_NAME = "importFromFileServices";

	private IWResourceBundle getIwrb(IWContext iwc) {
		IWResourceBundle iwrb = iwc.getIWMainApplication().getBundle(NationalRegisterConstants.IW_BUNDLE_IDENTIFIER).getResourceBundle(iwc);
		return iwrb;
	}

	@RemoteMethod
	public String importFromFile(String filePath, String type) {
		IWContext iwc = CoreUtil.getIWContext();
		IWResourceBundle iwrb = getIwrb(iwc);
		try {
			if (!iwc.isLoggedOn() || !iwc.getAccessController().isAdmin(iwc)) {
				throw new Exception("Do not have permission");
			}

			if (doImport(filePath, type)) {
				return iwrb.getLocalizedString("success", "Success");
			}
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Failed importing from file: " + filePath, e);
		}
		return iwrb.getLocalizedString("error", "Error");
	}

	public boolean doImport(String filePath, String type) {
		ImportFile file = null;
		try {
			NationalRegisterFileImportHandler handler = new NationalRegisterFileImportHandlerBean();

			type = StringUtil.isEmpty(type) ? "E36" : type;
			switch (type) {
				case "E36": {
					file = new NationalRegisterImportFileE36();
					break;
				}
				case "E32": {
					file = new NationalRegisterImportFileE32();
					break;
				}
				default: {
					file = new NationalRegisterImportFile();
				}
			}

			file.setFile(new File(filePath));
			handler.setImportFile(file);
			handler.handleRecords();

			return true;
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Failed importing from file: " + filePath + ", importer: " + file.getClass().getName(), e);
		}

		return false;
	}

}