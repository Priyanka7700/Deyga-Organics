package testpkg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basepkg.DeygaBase;
import pagepkg.DeygaMethods;
import utilitypkg.DeygaUtility;


public class DeygaTest extends DeygaBase {

	
	@Test
	public void searchtest() throws InterruptedException
	{
		DeygaMethods ob1 =new DeygaMethods(driver);
		ob1.RegistratioPage();
		
		String file = "C:\\Users\\HP\\OneDrive\\Desktop\\DeygaReg.xlsx";
		String sheet = "Sheet1";

		int rowcount = DeygaUtility.getRowCount(file, sheet);

		for (int i = 1; i <= rowcount; i++) {
			String fname = DeygaUtility.getCellValue(file, sheet, i, 0);
			System.out.println("Firstname : " + fname);
			String lname = DeygaUtility.getCellValue(file, sheet, i, 1);
			System.out.println("Lastname : " + lname);
			String email = DeygaUtility.getCellValue(file, sheet, i, 2);
			System.out.println("Email : " + email);
			String pass = DeygaUtility.getCellValue(file, sheet, i, 3);
			System.out.println("Password : " + pass);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("pass")).clear();
			ob1.CreateAccount(fname, lname, email, pass);
		}	
		ob1.SearchField();
		ob1.Checkout();	
	}
	
}
