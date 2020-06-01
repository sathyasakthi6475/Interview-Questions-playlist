package interviewquestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchSuggestionPrint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		WebElement google = driver.findElement(By.name("q"));
		google.sendKeys("football");
		Thread.sleep(5000);
		List<WebElement> options= driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		int size = options.size();
		System.out.println(size);
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
			
			if (text.contains("football players")) {
				webElement.click();
				break;
			}
		}
	}

}
