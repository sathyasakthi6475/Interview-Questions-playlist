package interviewquestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinksInPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("football players\n");
		Thread.sleep(5000);
		//All links
	/*List<WebElement> alllinks=	driver.findElements(By.xpath("//a"));
		for (WebElement webElement : alllinks) {
			String links = webElement.getAttribute("href");
			System.out.println(links);*/
			
		//Main links
			List<WebElement> mainlinks=	driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
			for (WebElement webElement : mainlinks) {
				String links = webElement.getText();
				System.out.println(links);
			
		}
	}

}
