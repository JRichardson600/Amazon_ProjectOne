//TC-14 - Go to Orders page and click on your last ordered product and give 5 star ratinsg

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
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.Data_Fetching;
import Utility.Listeners_Class3;

//@Listeners(Listeners_Class3.class)

public class Testcase_14 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_Logic.class)
	public void ProductReview_Testcase_14() throws InterruptedException, EncryptedDocumentException, IOException {
		Amz_B2C_HomePage_1 a1 = new Amz_B2C_HomePage_1(driver);
		a1.toLoginPage();

		Reporter.log("Routing to the login Page is Done");

		Data_Fetching d1 = new Data_Fetching();
		d1.fetch();

		Amz_B2C_Login_Page_3 a2 = new Amz_B2C_Login_Page_3(driver);
		a2.loginEnterUserName_2();// Enter UserName
		a2.clickOnContinueBtn();// Enter PhoneNumber
		a2.enterPasswordLoginPage_2();// Enter Password
		a2.ClickcontinueToSignIn();// Click on Continue btn

		Reporter.log("Sucessful Login is Done");

		Actions a6 = new Actions(driver);
		a6.moveToElement(a1.hover_over_btn).perform();

		a1.clickOnMyOrders();

		Reporter.log("Routing to the order listing page is Done");

		Amz_B2C_Orders_listing_page_11 a4 = new Amz_B2C_Orders_listing_page_11(driver);
		a4.clickOnWriteProductReviewButton();

		Reporter.log("Routing to the Add review page is Done");

		Amz_B2C_Product_review_Page_12 a5 = new Amz_B2C_Product_review_Page_12(driver);
		a5.clickOnfivestr_Rating_btn();
		a5.WriteProductReview_In_headlines();
		a5.WriteProductReview_In_reviewTf();
		a5.clickOn_Submit_review_Button();

		Amz_B2C_Review_Submitted_13 a7 = new Amz_B2C_Review_Submitted_13(driver);
		a7.checkReviewSubmitted_text();

		Reporter.log("Adding the product review is Done");

	}
}