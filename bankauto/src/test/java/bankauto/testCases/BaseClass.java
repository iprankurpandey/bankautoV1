package bankauto.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import bankauto.utilties.readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	readconfig rcfg = new readconfig();
	
	public String baseURL =rcfg.getApplicationURL();
	public String username =rcfg.getUsername();
	public String password=rcfg.getPassword();
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
			
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
