package excelFile.com;

import java.io.FileInputStream;

import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFileWriting {
	
	@Test
	public void excel() {
		try {
		InputStream in=new FileInputStream("C:\\Users\\user\\Documents\\Book1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet=book.getSheetAt(0);
		int j=sheet.getLastRowNum();
		System.out.println(j);
		for(int i=0;i<j;i++) {
			XSSFRow  row=sheet.getRow(i);
			 for(int k = 0; k < row.getLastCellNum(); k++) {
		            System.out.println(row.getCell(k).getStringCellValue()+"|| ");
		  
			 }
		}
		book.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
