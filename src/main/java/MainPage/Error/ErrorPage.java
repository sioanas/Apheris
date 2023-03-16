package MainPage.Error;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import MainPage.PageBase;
import org.testng.Assert;

public class ErrorPage extends PageBase {
	private static String errorPageTextMessageXpath="/html/body/div/div/h2";
	
	public ErrorPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void checkErrorPage() throws IOException {
		PageBase.elementOnPage("xpath", menuErrorXPATH, true).click();
		Assert.assertTrue(elementOnPage("xpath", errorPageTextMessageXpath,true).getText().contains(utilss.Constants.getErrorPageMessage())) ;
	}

}
