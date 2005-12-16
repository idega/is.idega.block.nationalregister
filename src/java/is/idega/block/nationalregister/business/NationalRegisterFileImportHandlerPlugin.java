package is.idega.block.nationalregister.business;

import is.idega.block.nationalregister.data.NationalRegisterImportFileE36;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import com.idega.block.importer.presentation.Importer;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBORuntimeException;
import com.idega.core.business.ICApplicationBindingBusiness;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.IWContext;
import com.idega.presentation.Image;
import com.idega.user.app.ToolbarElement;


/**
 * <p>Title: idegaWeb</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: idega Software</p>
 * @author <a href="thomas@idega.is">Thomas Hilbig</a>
 * @version 1.0
 * Created on Aug 27, 2004
 */
public class NationalRegisterFileImportHandlerPlugin implements ToolbarElement {
	
	private final static String IW_BUNDLE_IDENTIFIER = "is.idega.block.nationalregister";

	/* (non-Javadoc)
	 * @see com.idega.user.app.ToolbarElement#getButtonImage(com.idega.presentation.IWContext)
	 */
	public Image getButtonImage(IWContext iwc) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.app.ToolbarElement#getName(com.idega.presentation.IWContext)
	 */
	public String getName(IWContext iwc) {
		IWBundle bundle = iwc.getApplicationContext().getIWMainApplication().getBundle(IW_BUNDLE_IDENTIFIER);
		IWResourceBundle resourceBundle = bundle.getResourceBundle(iwc);
		return resourceBundle.getLocalizedString("button.national_register", "National Register");
	}

	/* (non-Javadoc)
	 * @see com.idega.user.app.ToolbarElement#getPresentationObjectClass(com.idega.presentation.IWContext)
	 */
	public Class getPresentationObjectClass(IWContext iwc) {
		return Importer.class;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.app.ToolbarElement#getParameterMap(com.idega.presentation.IWContext)
	 */
	public Map getParameterMap(IWContext iwc) {
		Map map = new HashMap();
		map.put(Importer.PARAMETER_IMPORT_FILE,  NationalRegisterImportFileE36.class.getName());
		map.put(Importer.PARAMETER_IMPORT_HANDLER, NationalRegisterFileImportHandler.class.getName());
		return map;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.app.ToolbarElement#isValid(com.idega.presentation.IWContext)
	 */
	public boolean isValid(IWContext iwc) {
		if (iwc.isSuperAdmin()) {
	        try {
	        	ICApplicationBindingBusiness applicationBindingBusiness = (ICApplicationBindingBusiness) IBOLookup.getServiceInstance(iwc, ICApplicationBindingBusiness.class);
	        	String showStuff =applicationBindingBusiness.get("temp_show_is_related_stuff");
	        	// original condition, everything is true if not null
	        	return (showStuff != null);
	        }
	        catch (IBOLookupException ex) {
	        	throw new IBORuntimeException(ex);
	        }
	        catch (IOException ex) {
	        	Logger.getLogger(NationalRegisterFileImportHandlerPlugin.class.getName()).warning("[NationalRegisterFileImportHandlerPlugin] Could not look up parameter temp_show_is_related_stuff");
	        	return false;
	        }
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.app.ToolbarElement#getPriority(com.idega.presentation.IWContext)
	 */
	public int getPriority(IWContext iwc) {
		return 8;
	}

	/* (non-Javadoc)
	 * @see com.idega.user.app.ToolbarElement#isButton(com.idega.presentation.IWContext)
	 */
	public boolean isButton(IWContext iwc) {
		return false;
	}
}
