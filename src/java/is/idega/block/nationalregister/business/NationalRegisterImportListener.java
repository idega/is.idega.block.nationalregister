package is.idega.block.nationalregister.business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.idega.block.importer.data.GenericImportFile;
import com.idega.util.StringUtil;

import is.idega.block.nationalregister.data.NationalRegisterImportFileE32;

public class NationalRegisterImportListener implements ActionListener {

	public static final String IMPORT_ACTION_COMMAND = "national_registry_import";

	private Class<? extends NationalRegisterFileImportHandler> handlerClass = NationalRegisterFileImportHandlerBean.class;

	private String filePath;

	private boolean importInProgress = false;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (!IMPORT_ACTION_COMMAND.equals(event.getActionCommand())) {
			return;
		}

		doImport(getFilePath(), new NationalRegisterImportFileE32(), true);
	}

	public void doImport(String filePath, GenericImportFile file, boolean deleteFile) {
		try {
			if (importInProgress) {
				getLogger().warning("Import is already in progress");
				return;
			}
			importInProgress = true;

			if (StringUtil.isEmpty(filePath)) {
				getLogger().warning("File is not provided!");
				return;
			}

			File downloadedFile = new File(filePath);
			if (!downloadedFile.exists()) {
				getLogger().warning("File does not exist at " + downloadedFile.getAbsolutePath());
				return;
			}
			if (!downloadedFile.canRead()) {
				getLogger().warning("Can not read file " + downloadedFile.getAbsolutePath());
				return;
			}

			NationalRegisterFileImportHandler handler = getHandlerClass().newInstance();
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
	}

	public Class<? extends NationalRegisterFileImportHandler> getHandlerClass() {
		return handlerClass;
	}

	public void setHandlerClass(Class<? extends NationalRegisterFileImportHandler> handlerClass) {
		this.handlerClass = handlerClass;
	}

	private static final Logger LOGGER = Logger.getLogger(NationalRegisterImportListener.class.getName());

	private Logger getLogger() {
		return LOGGER;
	}

}