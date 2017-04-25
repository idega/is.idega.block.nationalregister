package is.idega.block.nationalregister.file.impl;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.idega.util.FileUtil;
import com.idega.util.IOUtil;
import com.idega.util.ListUtil;
import com.idega.util.StringHandler;
import com.idega.util.StringUtil;

import is.idega.block.nationalregister.file.NationalRegisterFileOptimizer;

public class NationalRegisterFileE32Optimizer implements NationalRegisterFileOptimizer {

	private static final Logger LOGGER = Logger.getLogger(NationalRegisterFileE32Optimizer.class.getName());

	@Override
	public File getOptimized(File file, String delimeter) {
		if (file == null || !file.exists() || !file.canRead()) {
			return file;
		}

		InputStream stream = null;
		try {
			List<String> lines = FileUtil.getLinesFromFile(file);
			if (ListUtil.isEmpty(lines)) {
				return file;
			}

			StringBuffer content = new StringBuffer();
			for (String line: lines) {
				if (StringUtil.isEmpty(line)) {
					continue;
				}

				if (line.length() > 300) {
					while (line.length() > 300) {
						String newLine = line.substring(0, 300);
						if (!StringUtil.isEmpty(delimeter)) {
							newLine = newLine.concat(delimeter);
						}
						content.append(newLine);
						if (line.length() > 300) {
							line = line.substring(300);
						}
					}
				}
				if (!StringUtil.isEmpty(line)) {
					if (!StringUtil.isEmpty(delimeter)) {
						line = line.concat(delimeter);
					}
					content.append(line);
				}
			}

			stream = StringHandler.getStreamFromString(content.toString());
			FileUtil.streamToFile(stream, file);
		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Error optimizing file: " + file, e);
		} finally {
			IOUtil.close(stream);
		}
		return file;
	}

}
