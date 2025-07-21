package orangeProject.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public Object[][] readExcelData(String filePath, int sheetNumber) {
		Object data[][] = null;

		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheetAt(sheetNumber);

			int rowCount = sheet.getPhysicalNumberOfRows();
			int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();

			data = new Object[rowCount - 1][columnCount];

			for (int i = 1; i < rowCount; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < columnCount; j++) {
					data[i - 1][j] = row.getCell(j).toString();
				}
			}

			workbook.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}

}
