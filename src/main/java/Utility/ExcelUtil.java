package Utility;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtil
{
	public static XSSFWorkbook excelWBook = null;
	public static XSSFSheet excelWSheet = null;
	public static XSSFRow row = null;
	public static XSSFCell cell = null;
	public static FileInputStream fileIn = null;
	public static FileOutputStream fileOut = null;
	public static int rowLen = 0;
	
	public static void setExcelFile(String filePath, String sheetName) throws IOException
	{
		fileIn = new FileInputStream(filePath);
		excelWBook = new XSSFWorkbook(fileIn);
		excelWSheet = excelWBook.getSheet(sheetName);
		
		rowLen = excelWSheet.getPhysicalNumberOfRows();
	}
	
	public static String getCellData(int rowNum, int colNum)
	{
		row = excelWSheet.getRow(rowNum);
		cell = row.getCell(colNum);
		String cellData = cell.toString();
		return cellData;
	}
	
	public static void setCellData(int rowNum, int colNum, String filePath, String desc) throws IOException
	{
		row = excelWSheet.getRow(rowNum);
		cell = row.getCell(colNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);
		
		if(cell == null)
		{
			cell = row.createCell(colNum);
			cell.setCellValue(desc);
		}
		else
		{
			cell.setCellValue(desc);
		}
		
		fileOut = new FileOutputStream(filePath);
		excelWBook.write(fileOut);
	}
	
	public static void closeExcel() throws IOException
	{
		fileOut.flush();
		excelWBook.close();
	}
}
