package test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

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
	
    @AfterSuite
    public void CloseDriverInstance() throws IOException {
        if (driver != null) {
        	System.out.print("I am in the AfterSuite");
            driver.close();
            driver.quit();
        }

    }


}
