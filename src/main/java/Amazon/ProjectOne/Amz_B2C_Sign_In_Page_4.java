package Amazon.ProjectOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Data_Fetching;

public class Amz_B2C_Sign_In_Page_4 extends Data_Fetching{
	
	//Step-1-locationg the elements
			
		@FindBy(xpath=("//span[@class='a-list-item']"))
		WebElement Password_text;
		
		//Step-2-writing the methods
		public void ChectText() {
			Assert.assertTrue(Password_text.isDisplayed()==true);
		}
		 //step 3 - initialization of elements
		public Amz_B2C_Sign_In_Page_4(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	

}
