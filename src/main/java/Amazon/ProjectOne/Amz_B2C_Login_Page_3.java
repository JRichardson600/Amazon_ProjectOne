package Amazon.ProjectOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Data_Fetching;

public class Amz_B2C_Login_Page_3 extends Data_Fetching{

	// Step-1-locationg the elements

	@FindBy(id = ("ap_email"))
	WebElement loginUsername_tf;

	@FindBy(id = ("continue"))
	WebElement loginContinue_btn;

	@FindBy(id = ("ap_password"))
	WebElement loginPassword_tf;

	@FindBy(id = ("signInSubmit"))
	WebElement continueToSignIn_tf;

	// Step-2-writing the methods

	public void loginEnterUserName() {
		loginUsername_tf.sendKeys(username_1);
	}
	
	public void loginEnterUserName_2() {
		loginUsername_tf.sendKeys(username_2);
	}

	public void clickOnContinueBtn() {
		loginContinue_btn.click();
	}

	public void enterPasswordLoginPage() {
		loginPassword_tf.sendKeys(password_1);
	}
	
	public void enterPasswordLoginPage_2() {
		loginPassword_tf.sendKeys(password_2);
	}

	public void enterIncorrecttPasswordLoginPage() {
		loginPassword_tf.sendKeys(incorrectPassword_1);
	}

	public void ClickcontinueToSignIn() {
		continueToSignIn_tf.click();
	}

	// step 3 - initialization of elements
	public Amz_B2C_Login_Page_3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
