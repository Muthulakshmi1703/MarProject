package excel.read.write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	File f = new File("TestDataFiles/ExcelWriteSample.xlsx");
	FileInputStream fis = new FileInputStream(f); //read mode
	
	XSSFWorkbook wbook = new XSSFWorkbook(fis);
//	XSSFSheet sheet = wbook.createSheet("LoginData");
//	XSSFRow row = sheet.createRow(0);
//	XSSFCell cell = row.createCell(0);
	
	XSSFSheet sheet = wbook.getSheet("LoginData");
	XSSFRow row = sheet.getRow(0);
	XSSFCell cell = row.createCell(1);
	cell.setCellValue("Hello");
	
	FileOutputStream fos = new FileOutputStream(f); //write mode, prepared
	wbook.write(fos); //writing in the excel
	wbook.close();
	
	System.out.println("done");
}
}
