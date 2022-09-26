package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EdviselyDashboardPage {
	//String pageTitle;
	@FindBy(xpath="//title")private WebElement ttl;
	//@FindBy(xpath="//input[@id=\"inputPassword\"]")private WebElement pwd;
	//@FindBy(xpath="//button[@id=\"submit\"]")private WebElement login;
	public EdviselyDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//pageTitle= driver.getTitle();
	}
	
	public String getTitle() {
		String actualTitle = ttl.getText();
		return actualTitle;
	}

}
