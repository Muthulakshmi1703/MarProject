package excel.read.write;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	public static void main(String[] args) {
		try {
			String location = "./src/test/resources/TestData/data.xlsx";

			XSSFWorkbook wbook = new XSSFWorkbook(location);
			XSSFSheet sheet = wbook.getSheet("Sheet1"); // wbook.getSheetAt(0);
			XSSFRow row = sheet.getRow(1);
			XSSFCell cell = row.getCell(0);
			String value = cell.getStringCellValue();
			System.out.println("Name : " + value);

			wbook.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
