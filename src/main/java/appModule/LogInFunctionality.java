package appModule;

import org.openqa.selenium.WebDriver;

import pageObjectModel.LoginPage;

public class LogInFunctionality
{	
	public static void logInFunction(WebDriver driver, String email, String password)
	{
		LoginPage.txtBox_Email(driver).sendKeys(email);
		LoginPage.txtBox_Password(driver).sendKeys(password);
		LoginPage.btn_Login(driver).click();
	}
}
