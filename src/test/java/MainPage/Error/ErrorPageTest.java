package MainPage.Error;

import java.io.IOException;

import org.testng.annotations.Test;

import MainPage.Veterinarians.VeterinariansPage;
import test.TestBase;

public class ErrorPageTest  extends TestBase{
	
	@Test
	public static void checkErrorPageTest() throws IOException{
	   
		System.out.println("Check Error Page");
		ErrorPage.checkErrorPage();
	}
}
