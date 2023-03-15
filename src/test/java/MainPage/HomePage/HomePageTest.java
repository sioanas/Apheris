package MainPage.HomePage;
import java.io.IOException;

import org.testng.annotations.Test;

import test.TestBase;



public class HomePageTest extends TestBase{
		
@Test
public static void CheckWelcomeTextTest() throws IOException{
   
	System.out.println("Checking Welcome message");
	
	HomePage.checkWelcome();
	
}
@Test
public static void CheckURLTest() throws IOException{
   
	System.out.println("Checking URL");
	HomePage.checkURL();
}
}
