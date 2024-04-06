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

public class Amz_B2C_ProductDetails_Shoes_7 {

	// Step-1-locationg the elements

	@FindBy(xpath = ("(//span[@class='a-price-whole'])[1]"))
	WebElement Product_price;

	@FindBy(xpath = ("(//h2[@class='softlines'])"))
	WebElement Product_description;

	@FindBy(xpath = ("(//h3[@class='a-spacing-medium a-spacing-top-large'])"))
	WebElement Product_reviews;

	@FindBy(id = ("add-to-cart-button"))
	WebElement addToCart_btn;

	@FindBy(id = ("//input[@id='buy-now-button']"))
	WebElement buyNow_btn;

	// Step-2-writing the methods
	public void ChectProductDetails() {
		Assert.assertTrue(Product_price.isDisplayed());
		Assert.assertTrue(Product_description.isDisplayed());
		Assert.assertTrue(Product_reviews.isDisplayed());
	}

	public void ProductaddToCart() throws InterruptedException {
		Thread.sleep(2000);
		addToCart_btn.click();
	}

	public void BuyNowProduct() {
		// Thread.sleep(2000);
		buyNow_btn.click();
	}

	// step 3 - initialization of elements
	public Amz_B2C_ProductDetails_Shoes_7(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
