package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Data_Fetching {
	
	public static String username_1;
	public static String password_1;
	public static String incorrectPassword_1;
	public static String username_2;
	public static String password_2;
	public static String cardDetailNum;
	public static String cardDetailUserName;
	public static String cardDetailUserCVV;

	public void fetch() throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Richard\\eclipse-workspace\\ProjectOne\\ExcelSheet_1\\DataProvider.xlsx");// location
		Workbook wb = WorkbookFactory.create(f1);
		username_1 = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		password_1 = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		incorrectPassword_1 = wb.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		
		username_2 = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(3).getNumericCellValue());
		password_2 = wb.getSheet("login").getRow(1).getCell(4).getStringCellValue();
		cardDetailNum = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(5).getNumericCellValue());
		cardDetailUserName = wb.getSheet("login").getRow(1).getCell(6).getStringCellValue();
		cardDetailUserCVV = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(7).getNumericCellValue());
}
}
