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

public class Amz_B2C_Pre_Cart_page_8 {

	// Step-1-locationg the elements

	@FindBy(xpath = ("//input[@name='proceedToRetailCheckout']"))
	WebElement proceed_btn;
	
	@FindBy(partialLinkText = ("Go to Cart"))
	WebElement goToCart_btn;
	

	// Step-2-writing the methods

	public void CheckProceedToPaymentBtn() {
		Assert.assertTrue(proceed_btn.isDisplayed());
		Assert.assertTrue(goToCart_btn.isDisplayed());
	}

	public void goToCart() {
		goToCart_btn.click();
	}
	
	public void goToPaymentsPage() {
		proceed_btn.click();
	}
	
	

	// step 3 - initialization of elements
	public Amz_B2C_Pre_Cart_page_8(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
