package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws Exception {
	FileInputStream input =new FileInputStream(new File("C:\\Users\\arcelik\\Desktop\\test.xlsx"));
	XSSFWorkbook wb= new XSSFWorkbook(input);
	XSSFSheet sh = wb.getSheetAt(0);
	System.out.println(sh.getSheetName());
	XSSFRow row= sh.getRow(0);
	XSSFCell cell=row.getCell(2);
	System.out.println(sh.getRow(0).getCell(2));
	System.out.println( sh.getPhysicalNumberOfRows());
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		for (int j = 0; j < sh.getRow(i).getPhysicalNumberOfCells(); j++) {
			System.out.print(sh.getRow(i).getCell(j)+" ");
		}
		
		System.out.println();
	}
	sh.getRow(1).getCell(2).setCellValue(25);
	FileOutputStream output = new FileOutputStream("C:\\Users\\arcelik\\Desktop\\test.xlsx");
	wb.write(output);
	
	
	
	
	
	
	
}
}