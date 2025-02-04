package testpkg;

import org.testng.annotations.Test;

import basepkg.DeygaBase;
import pagepkg.DeygaMethods;

public class DeygaTest extends DeygaBase {

	@Test
	public void searchtest() throws InterruptedException
	{
		DeygaMethods ob1 =new DeygaMethods(driver);
		ob1.SearchField();}
}
