package is.idega.block.nationalregister.data;

import com.idega.util.CoreConstants;

import is.idega.block.nationalregister.business.NationalRegisterDeceasedFileImportHandlerBean;

public class NationalRegisterImportFileDeceasedB extends NationalRegisterImportFileDeceased {

	@Override
	public String getValueAtIndexFromRecordString(int index, String recordString) {
		try {
			switch (index) {
				case NationalRegisterDeceasedFileImportHandlerBean.COLUMN_SYMBOL : return recordString.substring(0,2);
				case NationalRegisterDeceasedFileImportHandlerBean.COLUMN_SSN : return recordString.substring(2,12);
				case NationalRegisterDeceasedFileImportHandlerBean.COLUMN_DATE_OF_DEATH : return recordString.substring(12, 20);
				case NationalRegisterDeceasedFileImportHandlerBean.COLUMN_NAME : return recordString.substring(20,51);
				case NationalRegisterDeceasedFileImportHandlerBean.COLUMN_STREET : return recordString.substring(51,72);
				case NationalRegisterDeceasedFileImportHandlerBean.COLUMN_COMMUNE : return recordString.substring(72,93);
				case NationalRegisterDeceasedFileImportHandlerBean.COLUMN_GENDER : return null;
				case NationalRegisterDeceasedFileImportHandlerBean.COLUMN_MARITIAL_STATUS : return null;
				case NationalRegisterDeceasedFileImportHandlerBean.COLUMN_SPOUSE_SSN : return null;
				default : return null;
			}
		} catch(IndexOutOfBoundsException e) {
			return null;
		}
	}

	@Override
	public String getEncoding() {
		return CoreConstants.ENCODING_UTF8;
	}

}