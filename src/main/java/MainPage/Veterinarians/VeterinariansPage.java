package MainPage.Veterinarians;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MainPage.PageBase;
import utilss.Constants;
public class VeterinariansPage extends PageBase{
	
	private static String vetTableHeaderXpath="//*[@id=\"vets\"]/thead/tr";
	private static String vetTableId="vets";

	public VeterinariansPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static void checkVetTable() throws IOException {
		
		PageBase.elementOnPage("xpath",menuVeterinariansXPATH, true).click();
		Assert.assertTrue(elementOnPage("xpath",vetTableHeaderXpath,true).getText().contains("Name")) ;
		

	}
public static void checkVet() throws IOException {
		
		PageBase.elementOnPage("xpath",menuVeterinariansXPATH, true).click();
		Assert.assertTrue(elementOnPage("id",vetTableId,true).getText().contains(utilss.Constants.getVetName())) ;
		

	}
}
