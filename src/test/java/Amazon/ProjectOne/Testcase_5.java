//TC-5-Test searching for products using its name like shoe

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

public class Testcase_5 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_Logic.class)
	public void SearchShoes_Testcase_5() throws EncryptedDocumentException, IOException, InterruptedException {
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

		a1.SearchShoe();// search for shoes

		Reporter.log("Search for Shoe/product is Done");

		Assert.assertEquals(driver.getTitle(), "Amazon.in : Shoes");

	}

}
