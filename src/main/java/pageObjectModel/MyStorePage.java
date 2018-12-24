package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStorePage
{
	public static WebElement element = null;
	
	public static void lnk_SignOut(WebDriver driver)
	{
		if(driver.findElements(By.className("logout")).size()!=0)
		{
			driver.findElement(By.className("logout")).click();
		}
	}
}
