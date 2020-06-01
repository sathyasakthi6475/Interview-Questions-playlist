package interviewquestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.Location;

public class Refresh {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.phptravels.net/login");
		//driver.navigate().refresh();
		
	//driver.get(driver.getCurrentUrl());
		
		//using java script executor
/*	JavascriptExecutor executor =(JavascriptExecutor) driver;
		executor.executeScript("location.reload()");
		*/
	//using robot class
		Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_F5);
	robot.keyRelease(KeyEvent.VK_F5);
	}

}
