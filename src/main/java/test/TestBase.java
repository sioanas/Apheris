package test;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import MainPage.PageBase;
import utilss.Constants;

public class TestBase {
	public static WebDriver driver;

	@BeforeSuite
    public void setup() throws InterruptedException, IOException {		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     new PageBase(driver);
	     driver.navigate().to(Constants.getBaseUrl());
    }
	@BeforeTest
	public void beforeTest() {
		System.out.print("\n----------------------START-------------------------------\n");
	}
	@AfterTest
	public void afterTest() {
		System.out.print("\n-----------------------END--------------------------------\n");
	}
    @AfterSuite
    public void CloseDriverInstance() throws IOException {
        if (driver != null) {
        	System.out.print("Closing the browser window");
            driver.close();
            driver.quit();
        }
    }
}
