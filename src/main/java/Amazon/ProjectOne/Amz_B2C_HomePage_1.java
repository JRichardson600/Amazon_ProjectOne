package Amazon.ProjectOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Data_Fetching;

public class Amz_B2C_HomePage_1 extends Data_Fetching{

	// Step-1-locationg the elements
	@FindBy(linkText = "Start here.")
	WebElement startHere_btn;

	@FindBy(xpath = "(//input[@id='captchacharacters'])")
	WebElement captcha_tf;

	@FindBy(linkText = "Sign in")
	WebElement signIn_btn;

	@FindBy(id = "twotabsearchtextbox")
	WebElement search_tf;
	
	@FindBy(xpath = "(//span[@class='nav-icon nav-arrow'])[2]")
	WebElement hover_over_btn;
	
	@FindBy(linkText = "Your Orders")
	WebElement orders_btn;
	
	
	@FindBy(id = "captchacharacters")
	WebElement capcatcha;
	
	
	// Step-2-writing the methods
	public void toRegistrationPage() {
		startHere_btn.click();
	}

	public void toLoginPage() {
		signIn_btn.click();
	}

	public void CheckSearchTFenabled() {
		Assert.assertTrue(search_tf.isDisplayed() == true);
	}

	public void SearchShoe() {
		search_tf.sendKeys("Shoes");
		search_tf.sendKeys(Keys.ENTER);
	}
	
	public void clickOnMyOrders() {
		orders_btn.click();
	}
	
	public void clickOnHoverOver() {
		hover_over_btn.click();
	}
	
	public boolean CheckCapcatcha() {
		return capcatcha.isDisplayed();
	}
	

	// step 3 - initialization of elements
	public Amz_B2C_HomePage_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
