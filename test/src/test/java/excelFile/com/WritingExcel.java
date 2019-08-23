package excelFile.com;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingExcel {
	@Test
	public void m1() {
		try {
		OutputStream in=new FileOutputStream("C:\\Users\\user\\Documents\\Book1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		book.write(in);
		book.setActiveSheet(0);
		
		book.close();
		}catch(Exception e) {
			
			
		}
		
	}

}
