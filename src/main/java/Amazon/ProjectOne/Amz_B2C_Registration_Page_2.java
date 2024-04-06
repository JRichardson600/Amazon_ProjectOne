package Amazon.ProjectOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Data_Fetching;

public class Amz_B2C_Registration_Page_2 extends Data_Fetching{
	
	//Step-1-locationg the elements
			
		@FindBy(xpath=("//input[@name='customerName']"))
		WebElement fname_tf;
		
		@FindBy(xpath=("//input[@name='email']"))
		WebElement mobNum_tf;
		
		@FindBy(xpath=("//input[@name='password']"))
		WebElement psw_tf;
		
		@FindBy(id="continue")
		WebElement continue_btn;
		
		@FindBy(xpath="(//button[@class='sc-nkuzb1-0 sc-d5trka-0 eZxMRy button'])")
		WebElement Start_Puzzle;
		
		//Step-2-writing the methods
		
		public void enterUserName() {
			double EmailIdendSuffix = Math.random() *10000000;
			int EmailIdendSuffix1 = (byte) EmailIdendSuffix;
		//	System.out.println("EmailIdendSuffix : "+EmailIdendSuffix1);
			if(EmailIdendSuffix1<0) {
				EmailIdendSuffix1=EmailIdendSuffix1*-1;
			}
			
			fname_tf.sendKeys("enterUserName"+EmailIdendSuffix1+"@mailinator.com");
		}
		
		public void enterPhoneNumber() {
			//System.out.println("randomPhoneNo1 :"+randomPhoneNo1);
			mobNum_tf.sendKeys("7895***431246");
		}
		
		public void enterPassword() {
			psw_tf.sendKeys("enterPassword");
		}
		
		public void ClickContinue() {
			continue_btn.click();
		}
		
//		public void Check_Start_Puzzle_Btn() {
//			Assert.assertEquals(EdgeDriver.getTitle(), "India - Google Search");// using 3 String parameters
//		}
		
		
		 //step 3 - initialization of elements
		public Amz_B2C_Registration_Page_2(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	

}
