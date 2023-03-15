package MainPage.Veterinarians;

import java.io.IOException;

import org.testng.annotations.Test;

import test.TestBase;

public class VeterinariansPageTest extends TestBase{
	
	@Test
	public static void checkVetTableTest() throws IOException{
	   
		System.out.println("Check Veterinarians Table");
		VeterinariansPage.checkVetTable();
	}
		@Test
		public static void checkVetPageTest() throws IOException{
		   
			System.out.println("Check Veterinarians Page");
			VeterinariansPage.checkVet();
}}
