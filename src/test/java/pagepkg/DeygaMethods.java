package pagepkg;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepkg.DeygaBase;

public class DeygaMethods extends DeygaBase {

WebDriver driver;
	
	
	//SIGN IN
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17057733640386__header\"]/sticky-header/header/div/a[1]/svg/path[2]")
	WebElement signin;
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[7]/a")
	WebElement createone;
	@FindBy(id = "RegisterForm-FirstName")
	WebElement fname;
	@FindBy(id = "RegisterForm-LastName")
	WebElement lname;
	@FindBy(id = "RegisterForm-email")
	WebElement email;
	@FindBy(id = "RegisterForm-password")
	WebElement pswd;
	@FindBy(xpath = "//*[@id=\"create_customer\"]/button")
	WebElement register;
	
	//SEARCH FIELD
	@FindBy(name = "q")
	WebElement search;
	@FindBy(xpath = "//*[@id=\"product-grid\"]/li[1]/div/div/div[1]/div/a/div/img[2]")
	WebElement lipbalm;
	@FindBy(xpath = "//*[@id=\"search-desktop\"]/button[2]/svg")
	WebElement searchicon;
	@FindBy(name = "plus")
	WebElement num;
	@FindBy(name = "add")
	WebElement addtocart1;
	@FindBy(xpath  = "//button[@class='drawer__close']")
	WebElement crossbtn1;
	@FindBy(xpath = "/html/body/nav/ol/li[1]/a/span[1]")
	WebElement homebtn;
	
	//MENU SELECTION
	@FindBy(xpath = "//*[@id=\"HeaderMenu-face\"]/a/span")
	WebElement face;
	@FindBy(id = "HeaderMenu-face-category-face-wash")
	WebElement facewash;
	@FindBy(name = "add")
	WebElement options;
	@FindBy(xpath = "//*[@id=\"ProductSubmitButton-quickadd-template--17057741373634__main\"]/span")
	WebElement addtocart2;
	@FindBy(xpath = "//*[@id=\"ModalClose-7976154529986\"]/svg")
	WebElement crossbtn2;
	
	//SLIDESHOW BANNER
	@FindBy(xpath = "//*[@id=\"Slide-sections--17057733640386__announcement-bar-1\"]/div/a/div/p")
	WebElement banner;
	@FindBy(xpath = "//*[@id=\"shopify-section-template--17057741373634__description_tabs_XjNCMg\"]/div[1]/div/div/div/div[1]/div[3]/div[1]/span/svg[1]")
	WebElement ingredients;
	@FindBy(xpath = "//*[@id=\"shopify-section-template--17057741373634__description_tabs_XjNCMg\"]/div[1]/div/div/div/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div/p")
	WebElement fullingred;
	@FindBy(xpath = "//*[@id=\"shopify-section-template--17057741373634__description_tabs_XjNCMg\"]/div[2]/div/div[1]/span/svg")
	WebElement crossbtn3;
	
	//OUR STORY
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17057733574850__footer\"]/footer/div[1]/div[1]/div[2]/div[3]/ul/li[1]/a")
	WebElement story;
	@FindBy (xpath = "//*[@id=\"Deferred-Poster-Modal-31660594626754\"]/span[1]")
	WebElement videoplay;
	@FindBy(xpath = "//*[@id=\"template--17057740685506__cstm_multicolumn_KHnVTR\"]/div/div/div[2]/span[2]")
	WebElement bulletswiper;

	//REMOVEFROMCART
	@FindBy(xpath = "//*[@id=\"cart-icon-bubble\"]/svg")
	WebElement carticon;
	@FindBy(xpath = "//*[@id=\"Remove-1\"]/a")
	WebElement remove;
	
	//CHECKOUT
	@FindBy(xpath = "//*[@id=\"main-cart-footer\"]/div/div[1]/div/div[2]/div/button")
	WebElement checkoutbtn;
	@FindBy(xpath = "/html/body/div/div/header/div/button/div")
	WebElement crossbtn4;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/ul/label[8]/label")
	WebElement reason;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/button[1]")
	WebElement submit;	
	
	public DeygaMethods(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
//	public void CreateAccount(String test, String automation, String mailid, String password)
//	{
//		signin.click();
//		createone.click();
//		fname.sendKeys("test");
//		lname.sendKeys("automation");
//		email.sendKeys("testingautomation350@gmail.com");
//		pswd.sendKeys("Testing@00");
//		register.click();
//	}
	
	public void SearchField() throws InterruptedException
	{
		String parentwindow=driver.getWindowHandle();
		Actions act=new Actions(driver);
		search.sendKeys("lipbalm");
		act.keyDown(Keys.ENTER);
		act.perform();
		lipbalm.click();
		num.click();
		addtocart1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		crossbtn1.click();
		
		driver.navigate().back();
		
	}
	
}
