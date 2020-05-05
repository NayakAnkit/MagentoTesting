
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {

	WebDriver driver;

	public Welcome(WebDriver driver) {

		super();
		this.driver = driver;

	}

	By myacct = By.linkText("My Account"); // has

	public void clickOnMyAccount() {

		driver.findElement(myacct).click();

	}

}
