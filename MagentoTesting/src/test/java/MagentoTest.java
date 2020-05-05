
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	@Test
	public void positiveCredential() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://magento.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Welcome w = new Welcome(driver);
		w.clickOnMyAccount();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Login l = new Login(driver);
		l.typeEmail("kundansinghmahisour@gmail.com");
		l.typePwd("Welcome@123");
		l.clickLogin();

		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Home h = new Home(driver);
		h.clickOnLogout();

		Thread.sleep(5000);
		driver.close();

	}

}
