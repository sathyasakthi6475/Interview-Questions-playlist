package interviewquestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExecuteTestcaseMultipleWithoutLooping {
	@Test(invocationCount=2)
	public void Execution() {
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	}
}
