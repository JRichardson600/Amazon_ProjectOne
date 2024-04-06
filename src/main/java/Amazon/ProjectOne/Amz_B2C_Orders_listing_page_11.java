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

public class Amz_B2C_Orders_listing_page_11 {

	// Step-1-locationg the elements

	@FindBy(linkText = "Write a product review")
	List<WebElement> results;

	// Step-2-writing the methods
	public void clickOnWriteProductReviewButton() {
		int count_sug = results.size();
		results.get(count_sug - 5).click();
	}

	// step 3 - initialization of elements
	public Amz_B2C_Orders_listing_page_11(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
