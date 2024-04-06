package Amazon.ProjectOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_B2C_ProductListing_Shoes_6 {

	
	
	// Step-1-locationg the elements

	public static final int count = 0;

	@FindBy(xpath = ("//span[@class='a-list-item']"))
	WebElement Password_text;

	@FindBy(linkText = ("Include Out of Stock"))
	WebElement Include_Out_Stock_Cb;

	@FindBy(linkText = ("Get It by Tomorrow"))
	WebElement getItbytomm_cb;

	@FindBy(linkText = ("Men's Sneakers"))
	WebElement mens_sneaker_cb;

	@FindBy(linkText = ("See more"))
	WebElement seeMore_btn;

	@FindBy(linkText = ("₹2,500 - ₹5,000"))
	WebElement priceRange_cb;

	@FindBy(linkText = ("Men's Shoes"))
	WebElement MensShoes_btn;
	
	@FindBy(linkText = ("Avg. Customer Review"))
	WebElement Avg_Customer_Review;
	
	@FindBy(xpath = ("(//div[@class='a-section aok-relative s-image-tall-aspect'])"))
	List<WebElement> results;


	// Step-2-writing the methods
	public void ChectText() {
		Assert.assertTrue(Password_text.isDisplayed() == true);
	}
	
	public void ClickOnIncludeOutStockCb() {
		Include_Out_Stock_Cb.click();
	}
	
	public void ClickOngetItbytomm_cb() {
		getItbytomm_cb.click();
	}
	
	public void ClickOnmens_sneaker_cb() {
		mens_sneaker_cb.click();
	}
	
	public void ClickOnseeMore_btn() {
		seeMore_btn.click();
	}
	
	public void ClickOnpriceRange_cb() {
		priceRange_cb.click();
	}
	
	public void checkTextIsdisplayedOrNot() {
		Assert.assertTrue(Avg_Customer_Review.isDisplayed() == true);
	}
	
	public void ClickOnAnyRandomElementInList() throws InterruptedException {
		Thread.sleep(2000);
		int count = results.size();
		//System.out.println(count);
		Assert.assertTrue(count>1);
	}
	
	
	
	
	// step 3 - initialization of elements
	public Amz_B2C_ProductListing_Shoes_6(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
