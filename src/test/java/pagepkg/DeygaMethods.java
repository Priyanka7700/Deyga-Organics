package pagepkg;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepkg.DeygaBase;

public class DeygaMethods extends DeygaBase {


	WebDriver driver;
	FluentWait<WebDriver> wait;
	
	
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
	@FindBy(xpath = "//*[@id=\"CartDrawer\"]/div[2]/div[2]/button")
	WebElement crossbtn1;
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17096095989954__header\"]/sticky-header/header/h1/a/div[1]")
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
	@FindBy(xpath = "//*[@id=\"cart-icon-bubble\"]/div")
	WebElement carticon;
	@FindBy(xpath = "//*[@id=\"Remove-1\"]/a")
	WebElement remove;
	
	//CHECKOUT
	@FindBy(xpath = "//*[@id=\"CartDrawer\"]/div[2]/div[4]/div[2]/div/button")
	WebElement checkoutbtn;
	@FindBy(xpath = "/html/body/div/div/header/div/button/div/span")
	WebElement crossbtn4;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/ul/label[3]/label")
	WebElement reason;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/button[1]")
	WebElement submit;
	@FindBy(xpath="//iframe[@id='gokwik-iframe']")
	WebElement checkOutFrame;

	
	public DeygaMethods(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
		
		
	}
	
//	public void CreateAccount(String test, String automation, String mailid, String password)
//	{
//		
//		fname.sendKeys("test");
//		lname.sendKeys("automation");
//		email.sendKeys("testingautomation350@gmail.com");
//		pswd.sendKeys("Testing@00");
//		register.click();
//	}
	public void RegistratioPage()
	{
		signin.click();
		createone.click();
	}
	
	public void CreateAccount(String firstname, String lastname, String mail, String pass) {
			
		fname.clear();
		fname.sendKeys(firstname);
		lname.clear();
		lname.sendKeys(lastname);
		email.clear();
		email.sendKeys(mail);
		pswd.clear();
		pswd.sendKeys(pass);
		register.click();
	}
	
	public void SearchField() throws InterruptedException
	{
		
		
		Actions act=new Actions(driver);
		search.sendKeys("lipbalm");
		act.keyDown(Keys.ENTER);
		act.perform();
		lipbalm.click();
		num.click();
		addtocart1.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    wait.until(d -> crossbtn1.isDisplayed());
		act.moveToElement(crossbtn1);
		act.perform();
		crossbtn1.click();
		homebtn.click();	
	}
	
	public void Checkout() throws InterruptedException
	{
		try {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		Actions act=new Actions(driver);
//		act.moveToElement(carticon);
//		carticon.click();
//		wait.until(d -> checkOutFrame.isDisplayed());
//      driver.switchTo().frame(checkOutFrame);
//		wait.until(d -> checkoutbtn.isDisplayed());
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		act.scrollToElement(checkoutbtn);
//		act.moveToElement(checkoutbtn);
//		act.perform();
//		checkoutbtn.click();
//		
//      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
// 		driver.switchTo().frame(checkOutFrame);
//		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(windows.get(0));
//		act.moveToElement(crossbtn4);
//		act.perform();
//		crossbtn4.click();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		act.moveToElement(crossbtn4);
//		act.perform();
//		crossbtn4.click();
//		reason.click();
//		submit.click();
		
		 Actions act = new Actions(driver);
         wait.until(ExpectedConditions.visibilityOf(carticon));
         act.moveToElement(carticon);
         act.perform();
         carticon.click();
         
         wait.until(ExpectedConditions.visibilityOf(checkoutbtn));
         act.scrollToElement(checkoutbtn);
         act.moveToElement(checkoutbtn);
         act.perform();
         checkoutbtn.click();
         
         wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(checkOutFrame));
         
         wait.until(ExpectedConditions.elementToBeClickable(crossbtn4));
         crossbtn4.click();
         
         wait.until(ExpectedConditions.elementToBeClickable(reason));
         act.moveToElement(reason);
         act.perform();
         reason.click();
         
         wait.until(ExpectedConditions.visibilityOf(submit));
         act.moveToElement(submit);
         act.perform();
         submit.click();
         
         driver.switchTo().defaultContent();
         wait.until(ExpectedConditions.elementToBeClickable(crossbtn1));
         crossbtn1.click();
     } catch (Exception e) {
         System.err.println("Exception occurred during checkout: " + e.getMessage());
     }
	}
	
}
