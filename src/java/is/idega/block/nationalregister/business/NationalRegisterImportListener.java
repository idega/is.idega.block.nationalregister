package is.idega.block.nationalregister.business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.idega.block.importer.data.GenericImportFile;
import com.idega.util.StringUtil;

import is.idega.block.nationalregister.data.NationalRegisterImportFileE32;
import is.idega.block.nationalregister.file.NationalRegisterFileOptimizer;

public class NationalRegisterImportListener implements ActionListener {

	public static final String IMPORT_ACTION_COMMAND = "national_registry_import";

	private Class<? extends NationalRegisterFileImportHandler> handlerClass = NationalRegisterFileImportHandlerBean.class;

	private Class<? extends GenericImportFile> fileType = NationalRegisterImportFileE32.class;

	private Class<? extends NationalRegisterFileOptimizer> optimizer = null;

	private String filePath;

	private boolean importInProgress = false;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Class<? extends GenericImportFile> getFileType() {
		return fileType;
	}

	public void setFileType(Class<? extends GenericImportFile> fileType) {
		this.fileType = fileType;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (!IMPORT_ACTION_COMMAND.equals(event.getActionCommand())) {
			return;
		}

		GenericImportFile file = null;
		try {
			file = getFileType().newInstance();
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error creating instance of " + getFileType(), e);
		}
		doImport(getFilePath(), file, true);
	}

	public void doImport(String filePath, GenericImportFile file, boolean deleteFile) {
		boolean success = false;
		File downloadedFile = null;
		try {
			if (file == null) {
				return;
			}
			if (importInProgress) {
				getLogger().warning("Import is already in progress");
				return;
			}
			importInProgress = true;

			if (StringUtil.isEmpty(filePath)) {
				getLogger().warning("File is not provided!");
				return;
			}

			downloadedFile = new File(filePath);
			if (!downloadedFile.exists()) {
				return;
			}
			if (!downloadedFile.canRead()) {
				return;
			}

			if (getOptimizer() != null) {
				downloadedFile = getOptimizer().newInstance().getOptimized(downloadedFile, file.getRecordDilimiter());
				getLogger().info("Optimized file to:\n" + downloadedFile);
			}

			NationalRegisterFileImportHandler handler = getHandlerClass().newInstance();
			file.setFile(downloadedFile);
			handler.setImportFile(file);
			success = handler.handleRecords();
		} catch(Exception e) {
			getLogger().log(Level.WARNING, "Failed importing national register from " + filePath, e);
		} finally {
			importInProgress = false;

			if (success && deleteFile && downloadedFile != null && downloadedFile.canWrite()) {
				downloadedFile.delete();
			}
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

	public Class<? extends NationalRegisterFileOptimizer> getOptimizer() {
		return optimizer;
	}

	public void setOptimizer(Class<? extends NationalRegisterFileOptimizer> optimizer) {
		this.optimizer = optimizer;
	}

}