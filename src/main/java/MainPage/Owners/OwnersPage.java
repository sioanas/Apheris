package MainPage.Owners;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MainPage.PageBase;
import utilss.Constants;

public class OwnersPage extends PageBase{
	
	public OwnersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private static String searchTextFieldID="lastName";
	private static String findOwnerXPATH="//*[@id=\"search-owner-form\"]/div[2]/div/button";
	private static String addOwnerXPATH="//*[@id=\"search-owner-form\"]/a";
	private static String ownerNameResultXPATH="/html/body/div/div/table[1]/tbody/tr[1]/td";
	private static String addOwnerFirstNameId="firstName";
	private static String addOwnerLastNameId="lastName";
    private static String addOwnerAddressId="address";
	private static String addOwnerCityId="city";
	private static String addOwnerTelephoneId="telephone";
	private static String addOwnerButtonXpath="//*[@id=\"add-owner-form\"]/div[2]/div/button";
	
	public static void searchOwner() throws IOException {
		PageBase.elementOnPage("xpath",menuOwnersXPATH, true).click();
		PageBase.elementOnPage("id", searchTextFieldID,true).sendKeys(utilss.Constants.lastName);
		PageBase.elementOnPage("xpath", findOwnerXPATH,true).click();
		Assert.assertTrue(elementOnPage("xpath",ownerNameResultXPATH,true).getText().contains(Constants.getOKOwner())) ;
		
	}
	public static void addOwner() throws IOException {
		PageBase.elementOnPage("xpath",menuOwnersXPATH, true).click();
		PageBase.elementOnPage("xpath",addOwnerXPATH,true).click();
		
		PageBase.elementOnPage("id",addOwnerFirstNameId,true).sendKeys(Constants.firstName);
		PageBase.elementOnPage("id",addOwnerLastNameId,true).sendKeys(Constants.lastName);
		PageBase.elementOnPage("id",addOwnerAddressId,true).sendKeys(Constants.address);
		PageBase.elementOnPage("id",addOwnerCityId,true).sendKeys(Constants.city);
		PageBase.elementOnPage("id",addOwnerTelephoneId,true).sendKeys(Constants.telephone);
		
		PageBase.elementOnPage("xpath",addOwnerButtonXpath,true).click();
		
			
		Assert.assertTrue(elementOnPage("xpath",ownerNameResultXPATH,true).getText().contains(Constants.getOKOwner())) ;
		
	}
	

}
