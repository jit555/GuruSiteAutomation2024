package testCasePackage;

import org.testng.annotations.Test;

import basePackage.BaseClassGuru;
import pageObjectPackage.LoginPO;

public class TC_Login extends BaseClassGuru{
	
	@Test
	public void loginTest()
	{
		LoginPO lp=new LoginPO(driver);
//		lp.setUserName(userIdText);
//		lp.setPassword(pwdText);
//		lp.clickSubmit();
		
		//lp.loginMethod(userIdText, pwdText);
		lp.loginMethodwithActionDriver(userIdText, pwdText);
	}

}
