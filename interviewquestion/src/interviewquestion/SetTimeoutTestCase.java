package interviewquestion;


import org.testng.annotations.Test;

public class SetTimeoutTestCase {
	@Test(timeOut=2000)
	public void timeout() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("The timeout has set");
   }
}
	