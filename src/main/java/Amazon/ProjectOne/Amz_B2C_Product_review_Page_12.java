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

public class Amz_B2C_Product_review_Page_12 {

	// Step-1-locationg the elements

	@FindBy(xpath = ("(// div[@class='a-section a-spacing-top-micro']//button[@class='ryp__star__button'])[5]"))
	WebElement fivestr_btn;

	@FindBy(xpath = ("// input[@class='a-input-text ryp__review-title__input']"))
	WebElement headlines_btn;

	@FindBy(id = ("scarface-review-text-card-title"))
	WebElement review_tf;

	@FindBy(xpath = ("// button[@class='a-button-text']"))
	WebElement submit_product_review_btn;

	// Step-2-writing the methods
	public void clickOnfivestr_Rating_btn() {
		fivestr_btn.click();
	}

	public void WriteProductReview_In_headlines() {
		headlines_btn.clear();
		headlines_btn.clear();
		headlines_btn.sendKeys("Good product and recommend to others");
	}

	public void WriteProductReview_In_reviewTf() {
		review_tf.clear();
		review_tf.clear();
		review_tf.sendKeys("Good product and recommend to others");
	}

	public void clickOn_Submit_review_Button() {
		submit_product_review_btn.click();
	}

	// step 3 - initialization of elements
	public Amz_B2C_Product_review_Page_12(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
