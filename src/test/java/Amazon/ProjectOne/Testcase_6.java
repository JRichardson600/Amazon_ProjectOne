//TC-6- Verify that searching with filters (eg category.price range) yields accurate results

package Amazon.ProjectOne;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class Testcase_6 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_Logic.class)
	public void SearchShoesWithFilters_Testcase_6() throws InterruptedException, EncryptedDocumentException, IOException {
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

		Amz_B2C_ProductListing_Shoes_6 a3 = new Amz_B2C_ProductListing_Shoes_6(driver);
		a3.ClickOnIncludeOutStockCb();
		a3.ClickOngetItbytomm_cb();
		a3.ClickOnmens_sneaker_cb();
		a3.ClickOnseeMore_btn();
		a3.ClickOnpriceRange_cb();
		a3.ClickOnAnyRandomElementInList();// assertion

		Reporter.log("Applying filters is Done");

	}

}
