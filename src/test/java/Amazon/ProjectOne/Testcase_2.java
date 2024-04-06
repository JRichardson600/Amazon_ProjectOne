//TC-2-verify login is sucessful with correct email and password
//using existing data as the captcha portion and OTP cannot be automated 

package Amazon.ProjectOne;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.Data_Fetching;
import Utility.Listeners_Class3;

@Listeners(Listeners_Class3.class)

public class Testcase_2 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_Logic.class)
	public void SucessfulLogin_Testcase_2() throws EncryptedDocumentException, IOException, InterruptedException {
		Amz_B2C_HomePage_1 a1 = new Amz_B2C_HomePage_1(driver);
		a1.toLoginPage();

		Reporter.log("Routing to the login Page is Done");

		Data_Fetching d1 = new Data_Fetching();

		d1.fetch();

		Amz_B2C_Login_Page_3 a3 = new Amz_B2C_Login_Page_3(driver);
		a3.loginEnterUserName();// Enter UserName
		a3.clickOnContinueBtn();// Enter PhoneNumber
		a3.enterPasswordLoginPage();// Enter Password
		a3.ClickcontinueToSignIn();// Click on Continue btn

		Reporter.log("Sucessful login is Done");

		a1.CheckSearchTFenabled();// assertions
	}

}
