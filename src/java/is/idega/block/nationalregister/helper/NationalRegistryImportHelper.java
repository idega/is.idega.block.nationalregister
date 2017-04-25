package is.idega.block.nationalregister.helper;

import java.util.List;

public interface NationalRegistryImportHelper {

	public boolean doImport(String filePath, String format, boolean deleteFile);

	public boolean doImportFiles(List<String> filesPaths, String format, boolean deleteFiles);

}