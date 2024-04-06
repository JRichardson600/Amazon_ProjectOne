package Amazon.ProjectOne;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Data_Fetching;

public class Amz_B2C_Payment_page_10 extends Data_Fetching {

	// Step-1-locationg the elements

	@FindBy(xpath = ("//span[@id='shipToThisAddressButton']"))
	WebElement useThisAdd_btn;

	@FindBy(xpath = ("//input[@value='SelectableAddCreditCard']"))
	WebElement credDebit_Rbtn;

	@FindBy(linkText = ("Enter card details"))
	WebElement Card_Details;

	@FindBy(name = ("addCreditCardNumber"))
	WebElement Card_no;

	@FindBy(xpath = ("(//input[@class='a-input-text a-form-normal apx-add-credit-card-account-holder-name-input mcx-input-fields'])"))
	WebElement nickName_no;

	@FindBy(xpath = ("(// span[@class='a-button-inner']// span[@class='a-button-text a-declarative']// span[@class='a-dropdown-prompt'])[1]"))
	WebElement month_dd;

	@FindBy(linkText = ("12"))
	WebElement monthVal_dd;

	@FindBy(xpath = ("((// span[@class='a-dropdown-container'])[2])"))
	WebElement year_dd;

	@FindBy(linkText = ("2026"))
	WebElement year2026_dd;

	@FindBy(xpath = ("//span[@class='a-button a-button-primary pmts-button-input']"))
	WebElement cont_btn;

	@FindBy(xpath = ("//input[@class='a-input-text a-form-normal a-width-small']"))
	WebElement cvv_tf;

	@FindBy(xpath = ("//input[@type='checkbox']"))
	WebElement DC_CC_card_details_cb;

	@FindBy(xpath = ("(//span[@id='orderSummaryPrimaryActionBtn'])"))
	WebElement useThisPaymentMethod;

	@FindBy(xpath = ("(//span[@class='break-word'])[3]"))
	WebElement estimatedDeliveryText;

	@FindBy(xpath = ("(//input[@name='ppw-instrumentRowSelection'])[2]"))
	WebElement netBank_Rbtn;

	@FindBy(xpath = ("//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QTJLVjJGVFhIRVVaU1o&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']"))
	WebElement upi_Rbtn;

	@FindBy(xpath = ("//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']"))
	WebElement emi_Rbtn;
	
	@FindBy(xpath = ("//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']"))
	WebElement Cod_Rbtn;
	
	@FindBy(xpath = ("(//input[@name='placeYourOrder1'])[1]"))
	WebElement place_your_order_1;
	
	@FindBy(xpath = ("(//input[@name='placeYourOrder1'])[3]"))
	WebElement place_your_order_2;
	
	@FindBy(xpath = ("//input[@class='a-input-text a-form-normal a-width-large a-span9 pmts-claim-code']"))
	WebElement coupon_tf;
	
	@FindBy(xpath = ("(// span[@class='a-button-inner']// input[@class='a-button-input a-button-text'])[1]"))
	WebElement applycpn_btn;
	
	@FindBy(xpath = ("(//div[@class='a-alert-content'])[2]"))
	WebElement coupon_tf_Not_Applicable_btn;
	

	//Step-2-writing the methods
	public void Click_On_add_This_address() throws InterruptedException {
		Thread.sleep(5000);
		useThisAdd_btn.click();
		Thread.sleep(5000);
	}

	public void Select_credit_btn() throws InterruptedException {
		Thread.sleep(5000);
		credDebit_Rbtn.click();
		// Thread.sleep(5000);
	}

	public void Click_On_Card_Details() {
		Card_Details.click();
	}

	public void Enter_Card_Details() {
		Card_no.clear();
		Card_no.sendKeys("Enter_Card_Details");
	}

	public void Enter_Card_nickName_Details() {
		nickName_no.clear();
		nickName_no.sendKeys(cardDetailUserName);
	}

	public void Enter_Month_deatils_inCardDetails() {
		month_dd.click();
		monthVal_dd.click();
	}

	public void Enter_Year_deatils_inCardDetails() {
		year_dd.click();
		year2026_dd.click();
	}

	public void Click_onContinue_Btn_CardDetails() {
		cont_btn.click();
	}

	public void Enter_CVV_deatils_inCardDetails() {
		cvv_tf.sendKeys(cardDetailUserCVV);
	}

	public void Click_onContinue_for_sucessful_transaction() {
		useThisPaymentMethod.click();
	}

	public void Check_cardDeatails_CB() {
		DC_CC_card_details_cb.click();
	}

	public void Click_OnNetBank_Rbtn_Btn() throws InterruptedException {
		Thread.sleep(2000);
		netBank_Rbtn.click();
	}
	
	public void Click_On_upi_Rbtn() throws InterruptedException {
		Thread.sleep(2000);
		upi_Rbtn.click();
	}

	public void Click_emi_Rbtn() throws InterruptedException {
		Thread.sleep(2000);
		emi_Rbtn.click();
	}
	
	public void Click_Cod_Rbtn() throws InterruptedException {
		Thread.sleep(2000);
		boolean fname_tf_isTrue = Cod_Rbtn.isEnabled();
		if (fname_tf_isTrue == true) {
			Cod_Rbtn.click();
			Click_onContinue_for_sucessful_transaction();
			
		} else {
			System.out.println("Do nothing");
		}
	}
	
	public void checkPlaceYouOrderIsdisplayedOrNot() {
		Assert.assertTrue(place_your_order_1.isDisplayed() == true && place_your_order_2.isDisplayed() == true);
	}
	
	public void SendCouponsCode() throws InterruptedException {
		Thread.sleep(2000);
		coupon_tf.sendKeys("SendCouponsCode");
	}
	
	public void Click_applycpn_btn() throws InterruptedException {
		Thread.sleep(2000);
		applycpn_btn.click();
	}
	
	public void checkCouponisApplicableOrNot() {
		Assert.assertTrue(coupon_tf_Not_Applicable_btn.isDisplayed() == true);
	}


	// step 3 - initialization of elements
	public Amz_B2C_Payment_page_10(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
