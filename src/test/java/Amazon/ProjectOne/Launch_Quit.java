package Amazon.ProjectOne;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import Utility.Listeners_Class3;
import Utility.Retry_Logic;
import Utility.Listeners_Class3;

//@Listeners(Listeners_Class3.class)
public class Launch_Quit extends Listeners_Class3 {

	// public static WebDriver driver = null;
	@BeforeMethod
	@Parameters("browser")
	public void precondition(String name_of_browser) {

		if (name_of_browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (name_of_browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		if (name_of_browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void closure_activity() throws InterruptedException, IOException {
		System.out.println("Thanks test case is done");
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.quit();// end of execution

	}
}
