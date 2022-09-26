package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EdviselyHomePage {
	@FindBy(xpath="//input[@id=\"inputEmail\"]")private WebElement email;
	@FindBy(xpath="//input[@id=\"inputPassword\"]")private WebElement pwd;
	@FindBy(xpath="//button[@id=\"submit\"]")private WebElement login;
	public EdviselyHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void typeemail(String username) {
		email.sendKeys(username);

	}
	public void typepwd(String password) {
		pwd.sendKeys(password);
	}
	public void clicklogin() {
		login.click();
	}
}
