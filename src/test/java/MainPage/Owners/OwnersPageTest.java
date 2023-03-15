package MainPage.Owners;
import java.io.IOException;

import org.testng.annotations.Test;

import MainPage.HomePage.HomePage;
import test.TestBase;
public class OwnersPageTest extends TestBase {
	@Test
	public static void FindAnOwnerTest() throws IOException{
	   
		System.out.println("Find an Owner");
		OwnersPage.searchOwner();
	
	}
	@Test
	public static void addOwner() throws IOException{
	   
		System.out.println("Add an Owner");
		OwnersPage.addOwner();
	
	}
}
