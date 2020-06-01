package interviewquestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAllCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
	//List <WebElement> all=	driver.findElements(By.xpath("//*[contains(text(),'Select the languages that you know?')]//following::div//following::input"));
		List <WebElement> all=	driver.findElements(By.xpath("//input[@type='checkbox']"));
	for (WebElement webElement : all) {
		webElement.click();
		
	}

	}

}
