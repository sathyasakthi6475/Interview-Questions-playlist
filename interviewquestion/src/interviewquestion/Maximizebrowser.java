package interviewquestion;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Maximizebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.phptravels.net/login");
		//driver.manage().window().maximize();
		
		//using set size
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
		
		//using firefox option
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized");
	}

}
