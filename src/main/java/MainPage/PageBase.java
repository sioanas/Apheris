package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import MainPage.PageBase;
import utilss.Constants;

public class PageBase {
	 public static WebDriver driver;
	 private static WebElement element;
	 public static String menuHomeXPATH = "//*[@id=\"main-navbar\"]/ul/li[1]/a/span[2]";
	 public static String menuOwnersXPATH = "//*[@id=\"main-navbar\"]/ul/li[2]/a/span[2]";
	 public static String menuOwnerTabClass="fa fa-search";
	 public static String menuVeterinariansXPATH = "//*[@id=\"main-navbar\"]/ul/li[3]/a/span[2]";
	 public static String menuErrorXPATH = "//*[@id=\"main-navbar\"]/ul/li[4]/a";
	// static String commentSourceCodeTextareaButtonClass = "mce-textbox";
	 
	 public PageBase(WebDriver driver) {
	    
		   PageBase.driver = driver;

	    }
	 public static WebElement elementOnPage(String typeOfSearch, String value, Boolean waitFor) {
		  
		 element = null;
	        WebDriverWait wait = new WebDriverWait(driver, Constants.timeout);
	        try {
	            switch (typeOfSearch) {
	                case "xpath":
	                    if (waitFor) {
	                        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(value)));
	                    }
	                    element = driver.findElement(By.xpath(value));
	                    System.out.println("Element Text: "+element.getText());
	                    return element;
	                case "id":
	                    if (waitFor) {
	                        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(value)));
	                    }
	                    element = driver.findElement(By.id(value));
	                    return element;
	                case "className":
	                    if (waitFor) {
	                        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(value)));
	                    }
	                    element = driver.findElement(By.className(value));
	                    return element;
	                default:
	                  //  logger.error("WebElement " + value + " not found on page!");
	            }

	        } catch (Exception e) {
	          //  logger.error("Element with value =" + value + " was not found on page!");
	            throw (e);
	        }
	        return element;
	    }

	    public static WebElement elementOnPage(String typeOfSearch, String value) {
	        return elementOnPage(typeOfSearch, value, false);
	    }

}
