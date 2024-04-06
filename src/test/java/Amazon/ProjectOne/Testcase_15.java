//TC-14 - Go to Orders page and click on your last ordered product and give 5 star ratinsg

package Amazon.ProjectOne;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.Data_Fetching;
import Utility.Listeners_Class3;

//@Listeners(Listeners_Class3.class)

public class Testcase_15 extends Launch_Quit {

	@Test(retryAnalyzer=Utility.Retry_Logic.class)
	public void ReachCartWithoutLogin_Testcase_15() throws InterruptedException, EncryptedDocumentException, IOException {
		Amz_B2C_HomePage_1 a1 = new Amz_B2C_HomePage_1(driver);

		Data_Fetching d1 = new Data_Fetching();
		d1.fetch();

		a1.SearchShoe();// search for shoes
		
		Reporter.log("Search for Shoe/product is Done");

		List<WebElement> results = driver
				.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
		Thread.sleep(2000);
		int count = results.size();
		//System.out.println(count);
		results.get(count - 3).click();
		
		Reporter.log("Search for Shoe/product is Done");

		Set<String> pen_shoe = driver.getWindowHandles();

		Iterator<String> pcId = pen_shoe.iterator();

		String parendId = pcId.next();// parent id from parentandchild
		String childId = pcId.next();// 1st childid

		driver.switchTo().window(childId);// moved the control to child window
		Thread.sleep(3000);

		Amz_B2C_ProductDetails_Shoes_7 a3 = new Amz_B2C_ProductDetails_Shoes_7(driver);
		a3.ProductaddToCart();
		
		Reporter.log("Adding Product to the cart is Done");

		Amz_B2C_Pre_Cart_page_8 a4 = new Amz_B2C_Pre_Cart_page_8(driver);

//		a4.CheckProceedToPaymentBtn();
		a4.goToCart();
		
		Reporter.log("Routing to the Cart is Done");
		
		Assert.assertEquals(driver.getTitle() ,"Amazon.in Shopping Cart");
		
		
		
	}
}