package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginPage
{
	public static WebElement element = null;
	
	public static WebElement txtBox_Email(WebDriver driver)
	{
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement txtBox_Password(WebDriver driver)
	{
		element = driver.findElement(By.id("passwd"));
		return element;
	}
	
	public static WebElement btn_Login(WebDriver driver)
	{
		element = driver.findElement(By.name("SubmitLogin"));
		return element;
	}
}
