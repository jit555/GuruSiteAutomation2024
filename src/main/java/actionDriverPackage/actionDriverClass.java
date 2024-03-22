package actionDriverPackage;

import org.openqa.selenium.WebElement;

import basePackage.BaseClassGuru;

public class actionDriverClass extends BaseClassGuru{
	
	public void sendKeysMethod(WebElement we, String keys)
	{
		we.sendKeys(keys);
	}
	public void clickMethod(WebElement we)
	{
		we.click();
	}

}
