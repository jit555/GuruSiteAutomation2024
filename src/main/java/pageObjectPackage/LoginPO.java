package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionDriverPackage.actionDriverClass;

public class LoginPO {
	
	WebDriver ldriver;
	actionDriverClass ad = new actionDriverClass();
	
	
	public LoginPO(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//input[@name='uid']")
	WebElement userId;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	//input[@name='btnLogin']
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement login;
	
	public void setUserName(String uname)
	{
		userId.sendKeys(uname);
	}
	
	public void setPassword(String pawd)
	{
	 pwd.sendKeys(pawd);
	}
	
	public void clickSubmit()
	{
		login.click();
	}
	
	public void loginMethod(String uname, String pawd)
	{
		userId.sendKeys(uname);
		pwd.sendKeys(pawd);
		login.click();
		
	}
	
	public void loginMethodwithActionDriver(String uname, String pawd)
	{
		ad.sendKeysMethod(userId,uname);
		ad.sendKeysMethod(pwd,pawd);
		ad.clickMethod(login);
		
	}
}
