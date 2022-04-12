package is.idega.block.nationalregister.helper.impl;

import java.io.File;
import java.util.List;
import java.util.logging.Level;

import org.directwebremoting.annotations.Param;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.importer.business.ImportFileHandler;
import com.idega.block.importer.data.GenericImportFile;
import com.idega.core.business.DefaultSpringBean;
import com.idega.presentation.IWContext;
import com.idega.util.CoreConstants;
import com.idega.util.CoreUtil;
import com.idega.util.FileUtil;
import com.idega.util.ListUtil;
import com.idega.util.StringUtil;

import is.idega.block.nationalregister.business.NationalRegisterDeceasedFileImportHandler;
import is.idega.block.nationalregister.business.NationalRegisterFileImportHandler;
import is.idega.block.nationalregister.data.NationalRegisterImportFileDeceasedB;
import is.idega.block.nationalregister.data.NationalRegisterImportFileE32;
import is.idega.block.nationalregister.data.NationalRegisterImportFileE32b;
import is.idega.block.nationalregister.data.NationalRegisterImportFileE36;
import is.idega.block.nationalregister.helper.NationalRegistryImportHelper;

@Service(NationalRegistryImportHelperImpl.BEAN_NAME)
@Scope(BeanDefinition.SCOPE_SINGLETON)
@RemoteProxy(creator=SpringCreator.class, creatorParams={
		@Param(name="beanName", value=NationalRegistryImportHelperImpl.BEAN_NAME),
		@Param(name="javascript", value="NationalRegistryImportHelper")
}, name="NationalRegistryImportHelper")
public class NationalRegistryImportHelperImpl extends DefaultSpringBean implements NationalRegistryImportHelper {

	static final String BEAN_NAME = "nationalRegistryImportHelper";

	private boolean importInProgress;

	@Override
	@RemoteMethod
	public boolean doImportFiles(List<String> filesPaths, String format, boolean deleteFiles) {
		if (ListUtil.isEmpty(filesPaths)) {
			return false;
		}

		IWContext iwc = CoreUtil.getIWContext();
		if (iwc == null || !iwc.isSuperAdmin()) {
			return false;
		}

		for (String filePath: filesPaths) {
			doImportFile(filePath, format, deleteFiles, false, null);
		}

		return true;
	}

	@Override
	@RemoteMethod
	public boolean doImport(String filePath, String format, boolean deleteFile) {
		IWContext iwc = CoreUtil.getIWContext();
		if (iwc == null || !iwc.isSuperAdmin()) {
			return false;
		}

		return doImportFile(filePath, format, deleteFile, false, null);
	}

	private <T extends GenericImportFile> boolean doImportFile(String filePath, String format, boolean deleteFile, boolean deceased, Class<T> fileFormat) {
		if (StringUtil.isEmpty(filePath)) {
			return false;
		}

		try {
			if (importInProgress) {
				getLogger().warning("Import is already in progress");
				return false;
			}
			importInProgress = true;

			if (StringUtil.isEmpty(filePath)) {
				getLogger().warning("File is not provided!");
				return false;
			}

			File downloadedFile = new File(filePath);
			if (!downloadedFile.exists()) {
				getLogger().warning("File does not exist at " + downloadedFile.getAbsolutePath());
				return false;
			}
			if (!downloadedFile.canRead()) {
				getLogger().warning("Can not read file " + downloadedFile.getAbsolutePath());
				return false;
			}

			ImportFileHandler handler = deceased ?
					getServiceInstance(NationalRegisterDeceasedFileImportHandler.class) :
					getServiceInstance(NationalRegisterFileImportHandler.class);
			GenericImportFile file = null;
			if (format != null) {
				switch (format) {
				case "E32":
					file = new NationalRegisterImportFileE32();
					break;

				case "E32b":
					file = new NationalRegisterImportFileE32b();
					break;

				default:
					file = new NationalRegisterImportFileE36();
					break;
				}
			}
			if (fileFormat != null) {
				file = fileFormat.newInstance();
			}
			file = file == null ? new NationalRegisterImportFileE36() : file;
			file.setFile(downloadedFile);
			handler.setImportFile(file);
			handler.handleRecords();

			if (deleteFile) {
				downloadedFile.delete();
			}
		} catch(Exception e) {
			getLogger().log(Level.WARNING, "Failed importing national register from " + filePath, e);
		} finally {
			importInProgress = false;
		}
		return true;
	}

	@Override
	@RemoteMethod
	public boolean doImportDeceased(String filePath, boolean deleteFile) {
		IWContext iwc = CoreUtil.getIWContext();
		if (iwc == null || !iwc.isSuperAdmin()) {
			return false;
		}

		return doImportFile(filePath, null, deleteFile, true, NationalRegisterImportFileDeceasedB.class);
	}

	public boolean doConvertFromCSV(String inputFile, String outputFile) {
		try {
			List<String> data = FileUtil.getLinesFromFile(inputFile);
			if (ListUtil.isEmpty(data)) {
				return false;
			}

			for (String line: data) {
				if (StringUtil.isEmpty(line)) {
					continue;
				}

				List<String> values = StringUtil.getValuesFromString(line, CoreConstants.SEMICOLON);
				if (ListUtil.isEmpty(values)) {
					continue;
				}

				System.out.println("Line values: " + values);

				StringBuilder output = new StringBuilder();
				String symbol = values.get(3);
				if (StringUtil.isEmpty(symbol) || symbol.length() != 2) {
					System.out.println("Invalid symbol: '" + symbol + "'");
					continue;
				}
				output.append(symbol);

				String oldId = null;
				oldId = getValueWithSpaces(oldId, 8);
				output.append(oldId);

				String ssn = values.get(5);
				if (StringUtil.isEmpty(ssn) || ssn.length() < 10) {
					System.out.println("Invalid ssn: '" + ssn + "'");
					continue;
				}
				output.append(ssn);

				String familyId = values.get(6);
				familyId = getValueWithSpaces(familyId, 10);
				output.append(familyId);

				System.out.println("Converted: " + output);
			}

			return true;
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error converting data at " + inputFile, e);
		}
		return false;
	}

	private String getValueWithSpaces(String value, int length) {
		if (value == null) {
			value = CoreConstants.EMPTY;
		}
		while (value.length() < length) {
			value = value.concat(CoreConstants.SPACE);
		}
		return value;
	}

}