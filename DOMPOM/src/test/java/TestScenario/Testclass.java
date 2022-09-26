package TestScenario;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import Objects.EdviselyDashboardPage;
import Objects.EdviselyHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	WebDriver driver;
	@BeforeTest
	public void initializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void Opensite() {
		driver.get("https://staging.educator.edwisely.com/");
		EdviselyHomePage c=new EdviselyHomePage(driver);
		c.typeemail("faculty@edwisely.com");
		c.typepwd("edwisely");
		//c.clicklogin();
		
	}

	@Test(description = "Test Login Functionality")
	public void tc1() {
		EdviselyDashboardPage edp = new EdviselyDashboardPage(driver);
		String exptTitle = "RMK Nextgen | Dashboard";
		String actualTitle =driver.getTitle();
		
		Assert.assertEquals(actualTitle,exptTitle, "Test Failed: Login not successful");

	}
}