package MainPage.HomePage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MainPage.PageBase;
import utilss.Constants;

public class HomePage extends PageBase{
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static String  imageDogXPATH="/html/body/div/div/img";
	public static String  imageTextXPATH="/html/body/div/div/h2";
	
	
	
	public static void checkURL() throws IOException {
		 PageBase.elementOnPage("xpath",menuHomeXPATH, true).click();
		 String pdfURL = driver.getCurrentUrl();
         Assert.assertEquals(pdfURL, Constants.getBaseUrl().concat("/"));

	}
	public static void checkWelcome() throws IOException {
		PageBase.elementOnPage("xpath",menuHomeXPATH, true).click();
		Assert.assertEquals(elementOnPage("xpath",imageTextXPATH,true).getText(), Constants.getWelcomeText());
		
	}

}
