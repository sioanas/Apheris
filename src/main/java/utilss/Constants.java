package utilss;

import java.io.IOException;
import java.time.Duration;

public class Constants {
	 public static final String baseurl = "http://localhost:8080";
	 public static final String ownersUrl = "/owners/find";
	 public static final String vetsUrl = "/vets.html";
	 public static final String errorUrl = "/oups";
	 public static final String welcomeText = "Welcome";
	 public static final String searchNOKOwner = "NotExistent";
	 public static final String firstName = "Tom";
	 public static final String lastName = "John";
	 public static final String address = "New Street 14";
	 public static final String city = "Timisoara";
	 public static final String telephone = "01234";
	 
	 public static final String veterinarianName = "James Carter";
	 public static final String errorPageText = "Something happened";
	 
	 public static final Duration timeout= Duration.ofSeconds(5);

	 public static final String getBaseUrl() throws IOException {
	        return  baseurl;

	    }

	 public static final String getOwnersUrl() throws IOException {
	        return  ownersUrl;

	    }

	 public static final String getVetUrl() throws IOException {
	        return  vetsUrl;

	    }

	 public static final String getErrorUrl() throws IOException {
	        return  errorUrl;

	    }
	 public static final String getOKOwner() throws IOException {
	        return firstName ;

	    }
	 public static final String getWelcomeText() throws IOException {
	        return  welcomeText;

	    }
	 public static final String getVetName() throws IOException {
	        return  veterinarianName;

	    }
	 public static final String getErrorPageMessage() throws IOException {
	        return  errorPageText;

	    }
}
