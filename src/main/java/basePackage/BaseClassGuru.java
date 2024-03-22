package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassGuru {

	public String baseURL="https://demo.guru99.com/V1/index.php";
	public String userIdText="mngr559746";
	public String pwdText="vAdYpUb";
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
