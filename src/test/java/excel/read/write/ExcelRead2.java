package excel.read.write;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
public static void main(String[] args) throws IOException{
	String location = "./src/test/resources/TestData/data.xlsx";
	
	XSSFWorkbook wbook = new XSSFWorkbook(location);
	XSSFSheet sheet = wbook.getSheetAt(0);
	int noOfRows = sheet.getPhysicalNumberOfRows();
	
	for(int i=1;i<noOfRows;i++) { //Outer loop for Row
		XSSFRow row = sheet.getRow(i); 
		int noOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < noOfCells; j++) { //Inner loop for cell(column)
			XSSFCell cell = row.getCell(j); 
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
	}
}
}
