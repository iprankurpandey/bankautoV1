package bankauto.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseURL ="http://demo.guru99.com/V1/index.php";
	public String username ="mngr340683 ";
	public String password="geqadum";
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
