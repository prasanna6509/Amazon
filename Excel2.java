package com.mounika;

import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {
	public String userName;
	public String passWord;
public void  call() throws IOException {

      File src = new File("C:\\Softwares\\Apache POI\\Excel2.xlsx");
	  FileInputStream fis= new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook (fis);
	  XSSFSheet sheet1= wb.getSheetAt(0);
	 userName=sheet1.getRow(1).getCell(0).getStringCellValue();
	 passWord=sheet1.getRow(1).getCell(1).getStringCellValue();
	 System.out.println("data from excel is"+userName);
	 System.out.println("data from excel is "+passWord);
	 wb.close();
			
		
}
	}



 


