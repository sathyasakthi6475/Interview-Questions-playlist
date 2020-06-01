package interviewquestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementunderlinedorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		WebElement tamil=driver.findElement(By.xpath("//*[@id=\'SIvCob\']/a[5]"));
		String	Beforhover = tamil.getCssValue("text-decoration");
		System.out.println(Beforhover);
		Actions actions=  new Actions(driver);
		actions.moveToElement(tamil);
		actions.build().perform();
		String	Afterhover = tamil.getCssValue("text-decoration");
		System.out.println(Afterhover);
	}

}

