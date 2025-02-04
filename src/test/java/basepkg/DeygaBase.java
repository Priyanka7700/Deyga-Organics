package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class DeygaBase {

public WebDriver driver;
	
	@BeforeClass
	public void SetUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void openpage()
	{
		driver.get("https://deyga.in/");
		driver.manage().window().maximize();
	}
}
