package com.DDT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class UserDetails {
	WebDriver driver;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static String getUserName() throws IOException {
		workbook = new XSSFWorkbook(".//Files//logindata.xlsx");
		sheet = workbook.getSheet("sheet1");

		return sheet.getRow(1).getCell(0).getStringCellValue();

	}

	public static String getPassword() throws IOException {
		workbook = new XSSFWorkbook(".//Files//logindata.xlsx");
		sheet = workbook.getSheet("sheet1");

		return sheet.getRow(1).getCell(1).getStringCellValue();

	}

	public static String getNewPassword() throws IOException {
		FileReader reader = new FileReader(".//Files//user.properties");
		Properties prop = new Properties();
		prop.load(reader);
		return prop.getProperty("newpass");
	}

	public static String getUrl2() throws IOException {
		FileReader reader = new FileReader(".//Files//data.properties");
		Properties prop = new Properties();
		prop.load(reader);
		return prop.getProperty("url2");

	}
	public static void main(String[] args) throws IOException {
		System.out.println(UserDetails.getUrl2());
	}

}

