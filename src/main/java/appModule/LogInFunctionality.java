package appModule;

import org.openqa.selenium.WebDriver;

import Utility.Log;
import pageObjectModel.LoginPage;

public class LogInFunctionality
{	
	public static void logInFunction(WebDriver driver, String email, String password)
	{
		LoginPage.txtBox_Email(driver).sendKeys(email);
		Log.info("Email entered");
		LoginPage.txtBox_Password(driver).sendKeys(password);
		Log.info("Password entered");
		LoginPage.btn_Login(driver).click();
		Log.info("Sign in button clicked");
	}
}
