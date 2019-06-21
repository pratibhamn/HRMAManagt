package generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String readData(String sheet,int m,int n) throws EncryptedDocumentException, IOException {
		File f=new File("F:\\HRM\\HRMA1\\data\\DataExcel.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String s = wb.getSheet(sheet).getRow(m).getCell(n).getStringCellValue();
		return s;
		
	}

}
