package automationRepositoryFramework;

import java.io.IOException;
import java.lang.reflect.Executable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Constant;
import Utility.ExcelUtil;
import appModule.LogInFunctionality;
import pageObjectModel.HomePage;
import pageObjectModel.MyStorePage;

public class TestCase
{
	public static WebDriver driver = null;
	public static String email = "";
	public static String password = "";
	public static String desc = "";
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",Constant.driverPath);
		
		driver = new ChromeDriver();
		
		ExcelUtil.setExcelFile(Constant.testDataPath, Constant.testDataSheet);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Constant.url);
		
		HomePage.lnk_SignIn(driver).click();
		
		for(int i = 1;i<ExcelUtil.rowLen;i++)
		{
			email = ExcelUtil.getCellData(i, 1);
			password = ExcelUtil.getCellData(i, 2);
			
			LogInFunctionality.logInFunction(driver, email, password);
			
			String title = driver.getTitle();
			if(title.equals("My account - My Store"))
			{
				desc = "Login Successful";
				ExcelUtil.setCellData(i, 3, Constant.testDataPath, desc);
			}
			else
			{
				desc = "Login Failed";
				ExcelUtil.setCellData(i, 3, Constant.testDataPath, desc);
			}	
			MyStorePage.lnk_SignOut(driver);
		}
		
		ExcelUtil.closeExcel();
		
		driver.quit();
	}
}
