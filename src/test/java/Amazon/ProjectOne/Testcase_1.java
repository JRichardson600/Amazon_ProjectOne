//TC-1-Test if a new user can sucesfully register

package Amazon.ProjectOne;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import TestNg06032024.Listeners_Class;
import Utility.Listeners_Class3;

@Listeners(Listeners_Class3.class)

public class Testcase_1 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_Logic.class, groups = { "smoke", "system", "regression" })
	public void SucesfulRegisterNewUser_Testcase_1() {
		Amz_B2C_HomePage_1 a1 = new Amz_B2C_HomePage_1(driver);
		a1.toRegistrationPage();
		Reporter.log("Routing to the Registration is Done");

		Amz_B2C_Registration_Page_2 a2 = new Amz_B2C_Registration_Page_2(driver);
		a2.enterUserName();// Enter UserName
		a2.enterPhoneNumber();// Enter PhoneNumber
		a2.enterPassword();// Enter Password
		a2.ClickContinue();// Click on Continue btn
		// a2.Check_Start_Puzzle_Btn();//assertionCheck

		// ocr-automation of catcha
		Reporter.log("New Profile is creation is Done");

		Assert.assertEquals(driver.getTitle(), "Authentication required");// using 3 String parameters
		// Assert.assertEquals(driver.getTitle(), "Authentication required");
	}

}
