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

public class Amz_B2C_Pre_Cart_2_ProceedToPayment_page_9 {

	// Step-1-locationg the elements

	@FindBy(xpath = ("(//span[@class='a-truncate-cut'])[1]"))
	WebElement product_btn1;
	
	@FindBy(xpath = ("(//span[@class='a-truncate-cut'])[2]"))
	WebElement product_btn2;
	
	@FindBy(xpath = ("(//span[@class='a-button-text a-declarative'])[1]"))
	WebElement qty_product_dd_1;
	
	@FindBy(xpath = ("(//a[@id='quantity_2'])"))
	WebElement qty_product_dd_value_1;
	
	@FindBy(xpath = ("(//a[@class='a-link-normal sc-product-link'])[7]"))
	WebElement deleted_product_2;
	
	@FindBy(xpath = ("(//input[@class='a-color-link'])[5]"))
	WebElement delete_product_2;
		
	// Step-2-writing the methods

	public void product1_dd_values() {
		qty_product_dd_1.click();
		qty_product_dd_value_1.click();
		
	}
	
	public void product2_delete() throws InterruptedException {
		//qty_product_dd_2.click();
		Thread.sleep(2000);
		delete_product_2.click();
		
	}
	
	public void CheckIfProductisDeletedorNot() throws InterruptedException {
		//qty_product_dd_2.click();
		Thread.sleep(3000);
		Assert.assertTrue(deleted_product_2.isDisplayed());
		
	}


	// step 3 - initialization of elements
	public Amz_B2C_Pre_Cart_2_ProceedToPayment_page_9(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}
