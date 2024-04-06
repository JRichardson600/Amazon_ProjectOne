//TC-4-Check is a user can sucessfully edit their profile information

package Amazon.ProjectOne;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.Data_Fetching;
import Utility.Listeners_Class3;

//@Listeners(Listeners_Class3.class)

public class Testcase_4 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_Logic.class)
	public void EditUserdetails_Testcase_4() throws EncryptedDocumentException, IOException, InterruptedException {
		Amz_B2C_HomePage_1 a1 = new Amz_B2C_HomePage_1(driver);
		a1.toLoginPage();

		Reporter.log("Routing to the login Page is Done");

		Data_Fetching d1 = new Data_Fetching();
		d1.fetch();

		Amz_B2C_Login_Page_3 a2 = new Amz_B2C_Login_Page_3(driver);
		a2.loginEnterUserName();// Enter UserName
		a2.clickOnContinueBtn();// Enter PhoneNumber
		a2.enterPasswordLoginPage();// Enter Password
		a2.ClickcontinueToSignIn();// Click on Continue btn

		Reporter.log("Sucessful Login is Done");

//		Amz_B2C_Sign_In_Page_4 a3 = new Amz_B2C_Sign_In_Page_4(driver);
//		a3.ChectText();

		Amz_B2C_EditProfilePage_5 a4 = new Amz_B2C_EditProfilePage_5(driver);

		Actions a5 = new Actions(driver);// actions actions
		a5.moveToElement(a4.acc_sign_in).perform();// hover over the required element
		a4.ClickOnOptionsDropdown();
		a4.ClickOnLoginSecButton();
		a4.ClickOnEditProfileButton();
		a4.EditCustomerEmailId();
		a4.ClickOnSaveProfileButton();

		Reporter.log("Sucessful Editing the User deatils is Done");

		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.amazon.in/ax/account/manage?pageId=inflex&openid.assoc_handle=inflex&successCodes=SUCCESS_CHANGE_NAME");

	}

}
