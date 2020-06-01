package interviewquestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("user@phptravels.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		WebElement button =driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
		button.click();
		//WebDriverWait driverWait= new WebDriverWait(driver, 20);
		//WebElement profile=driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#profile']")));
		WebElement profile = driver.findElement(By.xpath("//a[@href='#profile']"));
		profile.click();
		//driver.quit();
		
	}

}
