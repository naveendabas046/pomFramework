package com.common.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataReader  {
	
	@DataProvider(name = "userLoginData")
	public Object[][] getExcelData() throws IOException{
		File file = new File("C:\\Users\\navee\\eclipse-workspace\\Selanium_Achivers\\data\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Userdata");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(noOfRows);
		
		int noOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(noOfColumn);
		
		Object[][] data = new Object[noOfRows-1][noOfColumn]; 
		for(int i=0; i< noOfRows-1; i++) {
			for(int j=0; j<noOfColumn; j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j);
			}
		}
		return data;
	}
	
	public static void main(String[]args) throws IOException {
		ExcelDataReader obj = new ExcelDataReader();
		obj.getExcelData();
	}
}



