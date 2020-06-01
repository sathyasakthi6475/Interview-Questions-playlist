package interviewquestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingWebpage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms.htm");
	    JavascriptExecutor executor= (JavascriptExecutor) driver; 
		executor.executeScript("window.scroll(0,350)", "");
		//Thread.sleep(2000);
		executor.executeScript("window.scroll(0,-350)", "");
		//down of page
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		//Thread.sleep(2000);
		//top of the page
		executor.executeScript("window.scroll(0,0)", "");
		
		//using robot class
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	}

}
