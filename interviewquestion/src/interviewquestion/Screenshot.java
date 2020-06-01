package interviewquestion;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		//selenium builtin class(only partiall screen will be displayed)
		
		/*TakesScreenshot screenshot = (TakesScreenshot) driver;
		File shot =screenshot.getScreenshotAs(OutputType.FILE);
		File path = new File("D://sample.png");
		FileHandler.copy(shot, path);*/
		
		//using robot class
		
		Robot robot = new Robot();
		Dimension screensize=	Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(screensize);
		BufferedImage screen = robot.createScreenCapture(rectangle);
		File file = new File("D://robot.png");
		ImageIO.write(screen, "png", file);
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
		
		
	}

}
