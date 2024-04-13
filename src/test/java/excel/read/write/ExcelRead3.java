package excel.read.write;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead3 {
	public static void main(String[] args) throws IOException{
		String location = "./src/test/resources/TestData/data.xlsx";
		
		XSSFWorkbook wbook = new XSSFWorkbook(location);
		XSSFSheet sheet = wbook.getSheetAt(1);
		int noOfRows = sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<noOfRows;i++) { //Outer loop for Row
			XSSFRow row = sheet.getRow(i); 
			int noOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < noOfCells; j++) { //Inner loop for cell(column)
				XSSFCell cell = row.getCell(j); 
				CellType cellType = cell.getCellType();
				
				   if(cellType==CellType.STRING) {
					  String sValue = cell.getStringCellValue();
					  System.out.println("String : "+sValue);
				   }
				   else if(cellType==CellType.BOOLEAN) {
					 boolean bValue = cell.getBooleanCellValue();
					 System.out.println("Boolean : "+bValue);
				   }
				   else if(cellType==CellType.NUMERIC) {
					   if(DateUtil.isCellDateFormatted(cell)) {
						   Date d = cell.getDateCellValue();
						   
						   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						   String dateValue = sdf.format(d);
						   System.out.println("Date : "+dateValue);
					   }
					   else {
						  double dValue = cell.getNumericCellValue();
						  System.out.println(dValue);
					   }
				   }
			}
		}
	}
}
