//TC-3-Ensure login fails with incorrect email or password

package Amazon.ProjectOne;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.Data_Fetching;
import Utility.Listeners_Class3;

@Listeners(Listeners_Class3.class)

public class Testcase_3 extends Launch_Quit {

	@Test(retryAnalyzer=Utility.Retry_Logic.class)
	public void UnSucessfulLogin_Testcase_3() throws EncryptedDocumentException, IOException, InterruptedException {
		Amz_B2C_HomePage_1 a1 = new Amz_B2C_HomePage_1(driver);
		a1.toLoginPage();

		Data_Fetching d1 = new Data_Fetching();

		d1.fetch();

		Amz_B2C_Login_Page_3 a3 = new Amz_B2C_Login_Page_3(driver);
		a3.loginEnterUserName();// Enter UserName
		a3.clickOnContinueBtn();// Enter PhoneNumber
		a3.enterIncorrecttPasswordLoginPage();// Enter Password
		a3.ClickcontinueToSignIn();// Click on Continue btn

		Amz_B2C_Sign_In_Page_4 a4 = new Amz_B2C_Sign_In_Page_4(driver);
		a4.ChectText();

	}

}
