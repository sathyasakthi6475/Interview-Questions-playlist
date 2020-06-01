package interviewquestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAuthenticatioPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
