package MainPage.Owners;

import java.io.IOException;
import org.testng.annotations.Test;
import test.TestBase;
public class OwnersPageTest extends TestBase {

	@Test
	public static void addOwner() throws IOException{
		System.out.println("Add an Owner");
		OwnersPage.addOwner();
	}
	@Test
	public static void FindAnOwnerTest() throws IOException{
		System.out.println("Find an Owner");
		OwnersPage.searchOwner();
	}
}
