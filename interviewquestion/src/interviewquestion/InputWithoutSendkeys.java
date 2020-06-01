package interviewquestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InputWithoutSendkeys {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		WebElement enter= driver.findElement(By.name("q"));
		
		//using JavascriptExecutor(Finding the element name using java script
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		  //executor.executeScript("document.getElementsByName('q')[0].value='footbal'", "");
		
		//using JavascriptExecutor(but not finding elements only entering text
		  //executor.executeScript("arguments[0].value='football'", enter);
		
		//using robot class
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		
	}

}
