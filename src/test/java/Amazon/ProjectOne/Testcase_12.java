//TC-12-Check if user is able to select each payment method

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

public class Testcase_12 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_Logic.class)
	public void CheckAllPaymentsMethods_Testcase_12() throws InterruptedException, EncryptedDocumentException, IOException {
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

		List<WebElement> results = driver
				.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
		Thread.sleep(2000);
		int count = results.size();
		//System.out.println(count);
		results.get(count - 6).click();

		Reporter.log("Search for Shoe/product is Done");

		Set<String> pen_shoe = driver.getWindowHandles();

		Iterator<String> pcId = pen_shoe.iterator();

		String parendId = pcId.next();// parent id from parentandchild
		String childId = pcId.next();// 1st childid

		driver.switchTo().window(childId);// moved the control to child window
		Thread.sleep(3000);

		Reporter.log("Routing to the Product details is Done");

		Amz_B2C_ProductDetails_Shoes_7 a3 = new Amz_B2C_ProductDetails_Shoes_7(driver);
		a3.ProductaddToCart();

		Reporter.log("Adding Product to the cart is Done");

		Amz_B2C_Pre_Cart_page_8 a4 = new Amz_B2C_Pre_Cart_page_8(driver);
		a4.goToCart();

		Reporter.log("Routing to the Cart is Done");

		a4.goToPaymentsPage();

		Reporter.log("Routing to the Payments page is Done");

		Amz_B2C_Payment_page_10 a6 = new Amz_B2C_Payment_page_10(driver);
		a6.Click_On_add_This_address();
		a6.Select_credit_btn();
		a6.Click_OnNetBank_Rbtn_Btn();
		a6.Click_On_upi_Rbtn();
		a6.Click_emi_Rbtn();
		a6.Click_Cod_Rbtn();

		Reporter.log("Click on diff payment methods is Done");

		a6.Select_credit_btn();
		a6.Click_On_Card_Details();

		WebElement First_frame = driver.findElement(By.name("ApxSecureIframe"));
		driver.switchTo().frame(First_frame);
		a6.Enter_Card_Details();
		a6.Enter_Card_nickName_Details();
		a6.Enter_Month_deatils_inCardDetails();
		a6.Enter_Year_deatils_inCardDetails();
		a6.Click_onContinue_Btn_CardDetails();
		a6.Enter_CVV_deatils_inCardDetails();

		Reporter.log("Adding credit card deatils is Done");

		// a6.Click_onContinue_Btn_CardDetails();
		a6.Check_cardDeatails_CB();
		a6.Click_onContinue_for_sucessful_transaction();

		Reporter.log("Click on Order is Done");

		Thread.sleep(30000);
		a6.checkPlaceYouOrderIsdisplayedOrNot();
	}

}
