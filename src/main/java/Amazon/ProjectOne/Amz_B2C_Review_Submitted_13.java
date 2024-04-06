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

public class Amz_B2C_Review_Submitted_13 {

	// Step-1-locationg the elements

	@FindBy(xpath = "//span[@class='a-color-success ryp__thank-you-title a-text-bold']")
	WebElement reviewSubmitted_text;

	// Step-2-writing the methods
	public void checkReviewSubmitted_text() {
		Assert.assertTrue(reviewSubmitted_text.isDisplayed());
	}

	// step 3 - initialization of elements
	public Amz_B2C_Review_Submitted_13(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
