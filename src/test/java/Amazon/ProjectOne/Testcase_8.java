//TC-8-Check if products can be sorted by relevance, price,rating etc

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

public class Testcase_8 extends Launch_Quit {

	@Test(retryAnalyzer=Utility.Retry_Logic.class)
	public void SortProductBasedOnrelevance_Testcase_8() throws InterruptedException, EncryptedDocumentException, IOException {
		Amz_B2C_HomePage_1 a1 = new Amz_B2C_HomePage_1(driver);
		a1.toLoginPage();
		
		Reporter.log("Routing to the login Page is Done");

		Data_Fetching d1 = new Data_Fetching();
		d1.fetch();
		
		Amz_B2C_Login_Page_3 a2 = new Amz_B2C_Login_Page_3(driver);
		a2.loginEnterUserName();// Enter UserName
		a2.clickOnContinueBtn();// Enter PhoneNumber
		a2.enterPasswordLoginPage();// Enter Password
		a2.ClickcontinueToSignIn();// Click on Continue btn
		
		Reporter.log("Sucessful Login is Done");

		a1.SearchShoe();// search for shoes
		
		Reporter.log("Search for Shoe/product is Done");

		WebElement featured_dd = driver.findElement(By.xpath("//select[@class='a-native-dropdown a-declarative']"));

		Select s1 = new Select(featured_dd);// Select is a class here

		s1.selectByVisibleText("Price: High to Low");// using the selectByVisibleText
		s1.selectByVisibleText("Price: Low to High");
		s1.selectByVisibleText("Avg. Customer Review");
		
		Reporter.log("Changing the relevance is Done");
		
		Amz_B2C_ProductListing_Shoes_6 a3=new Amz_B2C_ProductListing_Shoes_6(driver);
		a3.checkTextIsdisplayedOrNot();
		
	}

}
