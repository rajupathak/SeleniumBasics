package MavanGitIntegration.MavanGitIntegration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void launchChromebrowser() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
	}
}
