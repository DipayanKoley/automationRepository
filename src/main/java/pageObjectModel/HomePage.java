package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class HomePage
{
	public static WebElement element = null;
	
	public static WebElement lnk_SignIn(WebDriver driver)
	{
		element = driver.findElement(By.className("login"));
		return element;
	}
}
