package apphooks;
import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.Utility;
public class ApplicationHooks extends Utility {
	@Before()
	public void launchBrowser() throws IOException {
		

		Utility.launchingBrowser();
		
		Utility.launchingApp();
		Utility.browserMaximize();
		
	}
	@After()
	public void quitBrowser() {
		
		Utility.closingBrowser();
		report.flush();
		
	}

}
