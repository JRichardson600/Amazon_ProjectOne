package Amazon.ProjectOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Data_Fetching;

public class Amz_B2C_EditProfilePage_5 extends Data_Fetching{

	// Step-1-locationg the elements
	@FindBy(id = "nav-link-accountList")
	WebElement acc_sign_in;
	@FindBy(xpath = "(//span[@class='a-color-secondary'])[2]")
	WebElement loginSec_btn;

	@FindBy(xpath = "(//span[@id='NAME_BUTTON'])")
	WebElement profile_edit_btn;

	@FindBy(id = ("ap_customer_name"))
	WebElement cust_Deatils_tf;

	@FindBy(id = ("cnep_1C_submit_button"))
	WebElement savecustDetails_btn;

	// Step-2-writing the methods
	public void ClickOnOptionsDropdown() {
		acc_sign_in.click();
	}

	public void ClickOnLoginSecButton() {
		loginSec_btn.click();
	}

	public void ClickOnEditProfileButton() {
		profile_edit_btn.click();
	}

	public void EditCustomerEmailId() {
		cust_Deatils_tf.clear();
		cust_Deatils_tf.clear();
		double EmailIdendSuffix = Math.random() * 10000000;
		int EmailIdendSuffix1 = (byte) EmailIdendSuffix;
		//System.out.println("EmailIdendSuffix : " + EmailIdendSuffix1);
		if (EmailIdendSuffix1 < 0) {
			EmailIdendSuffix1 = EmailIdendSuffix1 * -1;
		}

		cust_Deatils_tf.sendKeys("manojKumar" + EmailIdendSuffix1 + "@mailinator.com");
	}

	public void ClickOnSaveProfileButton() {
		savecustDetails_btn.click();
	}


	// step 3 - initialization of elements
	public Amz_B2C_EditProfilePage_5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
